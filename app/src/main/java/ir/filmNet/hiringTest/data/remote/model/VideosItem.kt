package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class VideosItem(

    @field:SerializedName("summary")
    val summary: String? = null,

    @field:SerializedName("conditional_flag")
    val conditionalFlag: String? = null,

    @field:SerializedName("flag")
    val flag: String? = null,

    @field:SerializedName("year")
    val year: Int? = null,

    @field:SerializedName("page_title")
    val pageTitle: String? = null,

    @field:SerializedName("imdb_rank_percent")
    val imdbRankPercent: Int? = null,

    @field:SerializedName("alter_cover_image")
    val alterCoverImage: AlterCoverImage? = null,

    @field:SerializedName("short_id")
    val shortId: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("duration")
    val duration: String? = null,

    @field:SerializedName("rate")
    val rate: Double? = null,

    @field:SerializedName("cover_image")
    val coverImage: CoverImage? = null,

    @field:SerializedName("categories")
    val categories: List<CategoriesItem?>? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("age_restriction")
    val ageRestriction: String? = null,

    @field:SerializedName("slug")
    val slug: String? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("poster_image")
    val posterImage: PosterImage? = null,

    @field:SerializedName("original_name")
    val originalName: String? = null,

    @field:SerializedName("logo_image")
    val logoImage: LogoImage? = null,

    @field:SerializedName("thumbnail_image")
    val thumbnailImage: ThumbnailImage? = null
)