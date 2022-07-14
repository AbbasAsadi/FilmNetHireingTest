package ir.filmNet.hiringTest.data.remote.api;

import io.reactivex.Flowable;
import ir.filmNet.hiringTest.data.remote.model.SearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search")
    Flowable<SearchResponse> getSearchResponse(
            @Query("query") String query
    );
}
