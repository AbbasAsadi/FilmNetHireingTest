package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AlterCoverImage(

    @Expose
    @SerializedName("path")
    val path: String? = null
)