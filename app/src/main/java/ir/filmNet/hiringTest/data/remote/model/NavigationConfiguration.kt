package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class NavigationConfiguration(

    @field:SerializedName("api_url")
    val apiUrl: String? = null,

    @field:SerializedName("navigation_type")
    val navigationType: String? = null,

    @field:SerializedName("sort_order")
    val sortOrder: String? = null
)