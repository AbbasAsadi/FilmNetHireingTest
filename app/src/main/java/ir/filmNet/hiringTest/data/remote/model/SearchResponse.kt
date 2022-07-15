package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @Expose
    @SerializedName("data")
    val data: Data? = null,

    @Expose
    @SerializedName("meta")
    val meta: Meta? = null,

    val errorMessage: String? = null

)