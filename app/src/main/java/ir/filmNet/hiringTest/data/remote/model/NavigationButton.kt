package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NavigationButton(

    @Expose
    @SerializedName("title")
    val title: String? = null
)