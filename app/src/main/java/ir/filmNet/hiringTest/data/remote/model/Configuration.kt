package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Configuration(

    @Expose
    @SerializedName("navigation_button")
    val navigationButton: NavigationButton? = null,

    @Expose
    @SerializedName("navigation_configuration")
    val navigationConfiguration: NavigationConfiguration? = null,

    @Expose
    @SerializedName("items")
    val items: List<PersonItem?>? = null
)