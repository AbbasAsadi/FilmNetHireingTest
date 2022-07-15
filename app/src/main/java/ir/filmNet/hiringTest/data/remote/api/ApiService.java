package ir.filmNet.hiringTest.data.remote.api;

import io.reactivex.rxjava3.core.Observable;
import ir.filmNet.hiringTest.data.remote.model.SearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search")
    Observable<SearchResponse> getSearchResponse(
            @Query("query") String query
    );
}
