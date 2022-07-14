package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class Person(

    @field:SerializedName("summary")
    val summary: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("avatar_image")
    val avatarImage: AvatarImage? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("short_id")
    val shortId: String? = null,

    @field:SerializedName("slug")
    val slug: String? = null,

    @field:SerializedName("name_en")
    val nameEn: String? = null
)