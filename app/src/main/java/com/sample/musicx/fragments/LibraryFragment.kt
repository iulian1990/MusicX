package com.sample.musicx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sample.musicx.databinding.FragmentLibraryBinding

class LibraryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLibraryBinding.inflate(inflater, container, false)

        with(binding.libraryViewPager) {
            adapter = MainPagerAdapter(childFragmentManager)
            binding.libraryTabs.setupWithViewPager(this)
        }

        return binding.root
    }
}

class MainPagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment = when (position) {
        0 -> TrackFragment()
        1 -> AlbumFragment()
        2 -> PlaylistsFragment()
        else -> ArtistFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? = when (position) {
        0 -> "Tracks"
        1 -> "Albums"
        2 -> "Playlists"
        else -> "Artists"
    }

    override fun getCount(): Int = 4
}
