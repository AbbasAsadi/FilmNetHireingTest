package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @Expose
    @SerializedName("videos")
    val videos: List<VideosItem?>? = null,

    @Expose
    @SerializedName("widgets")
    val widgets: List<WidgetsItem?>? = null,

    @Expose
    @SerializedName("promoted_videos")
    val promotedVideos: List<VideosItem?>? = null
)