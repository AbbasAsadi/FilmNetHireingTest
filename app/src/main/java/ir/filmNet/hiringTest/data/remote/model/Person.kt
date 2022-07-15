package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Person(

    @Expose
    @SerializedName("summary")
    val summary: String? = null,

    @Expose
    @SerializedName("name")
    val name: String? = null,

    @Expose
    @SerializedName("avatar_image")
    val avatarImage: AvatarImage? = null,

    @Expose
    @SerializedName("id")
    val id: String? = null,

    @Expose
    @SerializedName("short_id")
    val shortId: String? = null,

    @Expose
    @SerializedName("slug")
    val slug: String? = null,

    @Expose
    @SerializedName("name_en")
    val nameEn: String? = null
)