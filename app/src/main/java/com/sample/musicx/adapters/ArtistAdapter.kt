package com.sample.musicx.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.musicx.databinding.ItemArtistBinding
import com.sample.musicx.handlers.ArtistHandler
import com.sample.musicx.model.Artist

class ArtistAdapter(val handler: ArtistHandler) :
    ListAdapter<Artist, ArtistAdapter.ArtistViewHolder>(ArtistDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemArtistBinding.inflate(inflater, parent, false)
        return ArtistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) = with(holder) {
        bind(getItem(position))
    }

    inner class ArtistViewHolder(private val binding: ItemArtistBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(artist: Artist) {
            binding.artist = artist
            binding.handler = handler
            binding.executePendingBindings()
        }
    }
}

object ArtistDiff : DiffUtil.ItemCallback<Artist>() {
    override fun areItemsTheSame(oldItem: Artist, newItem: Artist): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Artist, newItem: Artist): Boolean =
        oldItem == newItem
}
