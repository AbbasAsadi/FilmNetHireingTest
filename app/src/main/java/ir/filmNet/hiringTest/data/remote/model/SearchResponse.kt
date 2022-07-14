package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class SearchResponse(

    @field:SerializedName("data")
    val data: Data? = null,

    @field:SerializedName("meta")
    val meta: Meta? = null
)