package ir.filmNet.hiringTest.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Meta(

    @Expose
    @SerializedName("total_items_count")
    val totalItemsCount: Int? = null,

    @Expose
    @SerializedName("remaining_items_count")
    val remainingItemsCount: Int? = null,

    @Expose
    @SerializedName("operation_result")
    val operationResult: String? = null,

    @Expose
    @SerializedName("next_url")
    val nextUrl: String? = null,

    @Expose
    @SerializedName("display_message")
    val displayMessage: String? = null,

    @Expose
    @SerializedName("operation_result_code")
    val operationResultCode: Int? = null,

    @Expose
    @SerializedName("server_date_time")
    val serverDateTime: String? = null
)