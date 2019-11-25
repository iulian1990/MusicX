package com.sample.musicx.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.sample.musicx.R
import com.sample.musicx.databinding.FragmentNewPlaylistBinding
import com.sample.musicx.fragments.UpdatePictureBottomSheetFragment.Companion.IMAGE_CAPTURE_REQUEST
import com.sample.musicx.fragments.UpdatePictureBottomSheetFragment.Companion.PHOTO_PICK_REQUEST
import com.sample.musicx.model.Playlist
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.utilities.getInputText
import com.sample.musicx.utilities.toUnderscore
import com.sample.musicx.viewmodels.PlaylistViewModel
import org.jetbrains.anko.dimen

class NewPlaylistFragment : Fragment() {

    lateinit var binding: FragmentNewPlaylistBinding

    private val viewModel: PlaylistViewModel by activityViewModels {
        InjectorUtils.providePlaylistViewModelFactory(requireContext())
    }

    private lateinit var bottomSheetFragment: UpdatePictureBottomSheetFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewPlaylistBinding.inflate(inflater, container, false)

        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        bottomSheetFragment = UpdatePictureBottomSheetFragment().apply {
            setTargetFragment(this@NewPlaylistFragment, IMAGE_CAPTURE_REQUEST)
        }

        binding.createPlaylistButton.setOnClickListener {
            if (!showErrors(binding)) {

                val title = binding.titleInputLayout.getInputText()
                val description = binding.descriptionInputLayout.getInputText()
                val image = bottomSheetFragment.currentPhotoPath

                viewModel.insert(
                    Playlist(
                        id = title.toUnderscore(),
                        title = title,
                        description = description,
                        image = image
                    )
                )
                findNavController().navigateUp()
            }
        }

        binding.playlistLoader.setOnClickListener {
            bottomSheetFragment.show(requireFragmentManager(), bottomSheetFragment.tag)
        }

        return binding.root
    }

    private fun showErrors(binding: FragmentNewPlaylistBinding): Boolean {
        val title = binding.titleInputLayout.getInputText()

        if (title.isBlank()) {
            binding.titleInputLayout.error = "Enter a playlist name"
            return true
        }

        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == IMAGE_CAPTURE_REQUEST || requestCode == PHOTO_PICK_REQUEST) {
                Glide.with(this)
                    .load(bottomSheetFragment.currentPhotoPath)
                    .into(binding.newPlaylistImage)
            }
        }
    }
}