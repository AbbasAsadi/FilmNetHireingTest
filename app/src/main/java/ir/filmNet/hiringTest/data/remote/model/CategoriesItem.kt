package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class CategoriesItem(

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("items")
    val items: List<ItemsItem?>? = null
)