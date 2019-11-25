package com.sample.musicx.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.musicx.databinding.ItemTrackBinding
import com.sample.musicx.fragments.AlbumSongListFragmentDirections
import com.sample.musicx.fragments.ArtistSongListFragmentDirections
import com.sample.musicx.fragments.LibraryFragmentDirections
import com.sample.musicx.fragments.PlaylistSongListFragmentDirections
import com.sample.musicx.model.TrackCatalog
import com.sample.musicx.model.TrackEmbedded
import com.sample.musicx.viewmodels.SongListType

class TrackAdapter(val type: SongListType) :
    ListAdapter<TrackEmbedded, TrackAdapter.TrackViewHolder>(TrackDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTrackBinding.inflate(inflater, parent, false)
        return TrackViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) = with(holder) {
        bind(getItem(position))
    }

    inner class TrackViewHolder(private val binding: ItemTrackBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(track: TrackEmbedded) {
            binding.track = track
            binding.clickListener = createOnClickListener(adapterPosition)
            binding.executePendingBindings()
        }
    }


    private fun createOnClickListener(position: Int) = View.OnClickListener {

        val catalog = TrackCatalog(getItems())

        val direction = when (type) {
            SongListType.ALBUM ->
                AlbumSongListFragmentDirections.actionAlbumSongListFragmentToPlayingFragment(
                    catalog,
                    position
                )
            SongListType.ARTIST ->
                ArtistSongListFragmentDirections.actionArtistSongListFragmentToPlayingFragment(
                    catalog,
                    position
                )
            SongListType.PLAYLIST ->
                PlaylistSongListFragmentDirections.actionPlaylistSongListFragmentToPlayingFragment(
                    catalog,
                    position
                )
            SongListType.ALL ->
                LibraryFragmentDirections.actionLibraryFragmentToPlayerFragment(catalog, position)
        }

        it.findNavController().navigate(direction)
    }

    private fun getItems(): List<TrackEmbedded> {
        val items = mutableListOf<TrackEmbedded>()

        for (i in 0 until itemCount) {
            items.add(getItem(i))
        }

        return items
    }
}

object TrackDiff : DiffUtil.ItemCallback<TrackEmbedded>() {
    override fun areItemsTheSame(oldItem: TrackEmbedded, newItem: TrackEmbedded): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: TrackEmbedded, newItem: TrackEmbedded): Boolean =
        oldItem == newItem
}