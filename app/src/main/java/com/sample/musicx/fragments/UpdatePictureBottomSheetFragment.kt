package com.sample.musicx.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.FileProvider
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sample.musicx.databinding.BottomSheetUpdatePictureBinding
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class UpdatePictureBottomSheetFragment : BottomSheetDialogFragment() {

    var currentPhotoPath: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = BottomSheetUpdatePictureBinding.inflate(
            inflater, container, false
        )

        binding.takePhoto.setOnClickListener {
            dispatchTakePictureIntent()
        }

        binding.chooseAnotherPicture.setOnClickListener {
            photoFromGallery()
        }

        return binding.root
    }

    @Throws(IOException::class)
    private fun createImageFile(): File {
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val storageDir: File? = requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile("JPEG_${timeStamp}_", ".jpg", storageDir).apply {
            currentPhotoPath = absolutePath
        }
    }

    private fun photoFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PHOTO_PICK_REQUEST)
    }


    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->

            takePictureIntent.resolveActivity(requireActivity().packageManager)?.also {
                val photoFile: File? = try {
                    createImageFile()
                } catch (ex: IOException) {
                    null
                }

                photoFile?.also {
                    val photoURI = FileProvider.getUriForFile(
                        requireContext(), "com.domain.fileprovider", it
                    )

                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                    startActivityForResult(takePictureIntent, IMAGE_CAPTURE_REQUEST)
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == PHOTO_PICK_REQUEST) {
                currentPhotoPath = data?.data?.toString() ?: ""
            }
        }

        targetFragment?.onActivityResult(requestCode, resultCode, data)
        dismiss()
    }

    companion object {
        const val IMAGE_CAPTURE_REQUEST = 1
        const val PHOTO_PICK_REQUEST = 2
    }
}