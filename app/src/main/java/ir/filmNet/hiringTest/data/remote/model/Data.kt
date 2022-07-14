package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class Data(

    @field:SerializedName("videos")
    val videos: List<VideosItem?>? = null,

    @field:SerializedName("widgets")
    val widgets: List<WidgetsItem?>? = null,

    @field:SerializedName("promoted_videos")
    val promotedVideos: List<PromotedVideosItem?>? = null
)