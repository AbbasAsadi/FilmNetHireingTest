package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class Configuration(

    @field:SerializedName("navigation_button")
    val navigationButton: NavigationButton? = null,

    @field:SerializedName("navigation_configuration")
    val navigationConfiguration: NavigationConfiguration? = null,

    @field:SerializedName("items")
    val items: List<ItemsItem?>? = null
)