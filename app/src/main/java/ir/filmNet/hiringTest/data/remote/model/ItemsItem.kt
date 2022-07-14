package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class ItemsItem(

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("person")
    val person: Person? = null,

    @field:SerializedName("person_id")
    val personId: String? = null,

    @field:SerializedName("order")
    val order: Int? = null
)