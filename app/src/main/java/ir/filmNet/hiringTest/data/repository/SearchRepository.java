package ir.filmNet.hiringTest.data.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import ir.filmNet.hiringTest.data.DataWrapper;
import ir.filmNet.hiringTest.data.remote.api.ApiService;
import ir.filmNet.hiringTest.data.remote.model.SearchResponse;

@Singleton
public class SearchRepository {
    private final ApiService apiService;

    @Inject
    public SearchRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public Observable<DataWrapper<SearchResponse>> search(String query) {
        return apiService.getSearchResponse(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError(Throwable::printStackTrace)
                .onErrorResumeNext(throwable ->
                        Observable.just(new SearchResponse(null, null, throwable.getMessage()))
                ).flatMap(response -> {
                            if (response.getErrorMessage() == null) {
                                return Observable.just(DataWrapper.success(response));
                            } else {
                                return Observable.just(DataWrapper.serverError(response.getErrorMessage(), null));
                            }
                        }
                );
    }

}
