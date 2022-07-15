package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PersonItem(

    @Expose
    @SerializedName("title")
    val title: String? = null,

    @Expose
    @SerializedName("person")
    val person: Person? = null,

    @Expose
    @SerializedName("person_id")
    val personId: String? = null,

    @Expose
    @SerializedName("order")
    val order: Int? = null
)