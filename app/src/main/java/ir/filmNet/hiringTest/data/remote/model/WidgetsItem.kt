package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class WidgetsItem(

    @field:SerializedName("configuration")
    val configuration: Configuration? = null,

    @field:SerializedName("display_title")
    val displayTitle: String? = null,

    @field:SerializedName("column")
    val column: Int? = null,

    @field:SerializedName("row")
    val row: Int? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("type")
    val type: String? = null
)