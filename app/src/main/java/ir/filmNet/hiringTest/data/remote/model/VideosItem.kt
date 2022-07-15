package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class VideosItem(

    @Expose
    @SerializedName("summary")
    val summary: String? = null,

    @Expose
    @SerializedName("conditional_flag")
    val conditionalFlag: String? = null,

    @Expose
    @SerializedName("flag")
    val flag: String? = null,

    @Expose
    @SerializedName("year")
    val year: Int? = null,

    @Expose
    @SerializedName("page_title")
    val pageTitle: String? = null,

    @Expose
    @SerializedName("imdb_rank_percent")
    val imdbRankPercent: Int? = null,

    @Expose
    @SerializedName("alter_cover_image")
    val alterCoverImage: AlterCoverImage? = null,

    @Expose
    @SerializedName("short_id")
    val shortId: String? = null,

    @Expose
    @SerializedName("title")
    val title: String? = null,

    @Expose
    @SerializedName("type")
    val type: String? = null,

    @Expose
    @SerializedName("duration")
    val duration: String? = null,

    @Expose
    @SerializedName("rate")
    val rate: Double? = null,

    @Expose
    @SerializedName("cover_image")
    val coverImage: CoverImage? = null,

    @Expose
    @SerializedName("categories")
    val categories: List<CategoriesItem?>? = null,

    @Expose
    @SerializedName("id")
    val id: String? = null,

    @Expose
    @SerializedName("age_restriction")
    val ageRestriction: String? = null,

    @Expose
    @SerializedName("slug")
    val slug: String? = null,

    @Expose
    @SerializedName("status")
    val status: String? = null,

    @Expose
    @SerializedName("poster_image")
    val posterImage: PosterImage? = null,

    @Expose
    @SerializedName("original_name")
    val originalName: String? = null,

    @Expose
    @SerializedName("logo_image")
    val logoImage: LogoImage? = null,

    @Expose
    @SerializedName("thumbnail_image")
    val thumbnailImage: ThumbnailImage? = null
)