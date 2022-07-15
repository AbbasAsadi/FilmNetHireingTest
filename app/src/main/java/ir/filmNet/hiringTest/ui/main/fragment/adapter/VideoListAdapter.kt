package ir.filmNet.hiringTest.ui.main.fragment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.filmNet.hiringTest.data.remote.model.VideosItem
import ir.filmNet.hiringTest.databinding.VideoListItemBinding

class VideoListAdapter(private val context: Context, private val videoList: List<VideosItem?>?) :
    RecyclerView.Adapter<VideoListAdapter.VideoListViewHolder>() {

    class VideoListViewHolder(var binding: VideoListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoListViewHolder {
        val binding = VideoListItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return VideoListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoListViewHolder, position: Int) {
        if (videoList != null)
            holder.binding.item = videoList[position]
    }

    override fun getItemCount(): Int {
        if (videoList == null)
            return 0
        return videoList.size
    }

}