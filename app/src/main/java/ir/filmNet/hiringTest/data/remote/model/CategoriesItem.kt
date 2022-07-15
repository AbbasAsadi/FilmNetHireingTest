package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CategoriesItem(

    @Expose
    @SerializedName("type")
    val type: String? = null,

    @Expose
    @SerializedName("items")
    val items: List<PersonItem?>? = null
)