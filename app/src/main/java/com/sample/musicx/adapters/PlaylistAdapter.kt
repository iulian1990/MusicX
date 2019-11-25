package com.sample.musicx.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.musicx.databinding.ItemAlbumBinding
import com.sample.musicx.databinding.ItemPlaylistBinding
import com.sample.musicx.handlers.AlbumHandler
import com.sample.musicx.handlers.PlaylistHandler
import com.sample.musicx.model.Album
import com.sample.musicx.model.Playlist

class PlaylistAdapter(val handler: PlaylistHandler) :
    ListAdapter<Playlist, PlaylistAdapter.PlaylistViewHolder>(PlaylistDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlaylistBinding.inflate(inflater, parent, false)
        return PlaylistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) = with(holder) {
        bind(getItem(position))
    }

    inner class PlaylistViewHolder(private val binding: ItemPlaylistBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(playlist: Playlist) {
            binding.playlist = playlist
            binding.handler = handler
            binding.executePendingBindings()
        }
    }
}

object PlaylistDiff : DiffUtil.ItemCallback<Playlist>() {
    override fun areItemsTheSame(oldItem: Playlist, newItem: Playlist): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Playlist, newItem: Playlist): Boolean =
        oldItem == newItem
}
