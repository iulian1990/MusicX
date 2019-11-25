package com.sample.musicx.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.musicx.databinding.ItemPlaylistPickerBinding
import com.sample.musicx.handlers.PlaylistPickerHandler
import com.sample.musicx.model.Playlist

class PlaylistPickerAdapter(val handler: PlaylistPickerHandler) :
    ListAdapter<Playlist, PlaylistPickerAdapter.PlaylistPickerViewHolder>(PlaylistPickerDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistPickerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlaylistPickerBinding.inflate(inflater, parent, false)
        return PlaylistPickerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaylistPickerViewHolder, position: Int) = with(holder) {
        bind(getItem(position))
    }

    inner class PlaylistPickerViewHolder(private val binding: ItemPlaylistPickerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(playlist: Playlist) {
            binding.playlist = playlist
            binding.handler = handler
            binding.executePendingBindings()
        }
    }
}

object PlaylistPickerDiff : DiffUtil.ItemCallback<Playlist>() {
    override fun areItemsTheSame(oldItem: Playlist, newItem: Playlist): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Playlist, newItem: Playlist): Boolean =
        oldItem == newItem
}
