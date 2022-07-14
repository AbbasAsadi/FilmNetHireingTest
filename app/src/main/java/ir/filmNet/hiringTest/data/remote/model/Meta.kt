package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.SerializedName

data class Meta(

    @field:SerializedName("total_items_count")
    val totalItemsCount: Int? = null,

    @field:SerializedName("remaining_items_count")
    val remainingItemsCount: Int? = null,

    @field:SerializedName("operation_result")
    val operationResult: String? = null,

    @field:SerializedName("next_url")
    val nextUrl: String? = null,

    @field:SerializedName("display_message")
    val displayMessage: String? = null,

    @field:SerializedName("operation_result_code")
    val operationResultCode: Int? = null,

    @field:SerializedName("server_date_time")
    val serverDateTime: String? = null
)