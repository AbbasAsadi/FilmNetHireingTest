package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WidgetsItem(

    @Expose
    @SerializedName("configuration")
    val configuration: Configuration? = null,

    @Expose
    @SerializedName("display_title")
    val displayTitle: String? = null,

    @Expose
    @SerializedName("column")
    val column: Int? = null,

    @Expose
    @SerializedName("row")
    val row: Int? = null,

    @Expose
    @SerializedName("id")
    val id: String? = null,

    @Expose
    @SerializedName("type")
    val type: String? = null
)