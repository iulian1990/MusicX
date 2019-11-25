package com.sample.musicx.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.musicx.databinding.ItemAlbumBinding
import com.sample.musicx.handlers.AlbumHandler
import com.sample.musicx.model.Album

class AlbumAdapter(val handler: AlbumHandler) :
    ListAdapter<Album, AlbumAdapter.AlbumViewHolder>(AlbumDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemAlbumBinding.inflate(inflater, parent, false)
        return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class AlbumViewHolder(private val binding: ItemAlbumBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(album: Album) {
            binding.album = album
            binding.handler = handler
            binding.executePendingBindings()
        }
    }
}

object AlbumDiff : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean =
        oldItem == newItem
}
