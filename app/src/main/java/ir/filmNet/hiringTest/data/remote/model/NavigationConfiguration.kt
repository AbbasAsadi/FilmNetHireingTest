package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NavigationConfiguration(

    @Expose
    @SerializedName("api_url")
    val apiUrl: String? = null,

    @Expose
    @SerializedName("navigation_type")
    val navigationType: String? = null,

    @Expose
    @SerializedName("sort_order")
    val sortOrder: String? = null
)