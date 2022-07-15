package ir.filmNet.hiringTest.ui.main;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import ir.filmNet.hiringTest.data.DataWrapper;
import ir.filmNet.hiringTest.data.remote.model.SearchResponse;
import ir.filmNet.hiringTest.data.repository.SearchRepository;
import ir.filmNet.hiringTest.ui.ParentViewModel;

public class MainViewModel extends ParentViewModel {
    private final SearchRepository repository;
    public MutableLiveData<DataWrapper<SearchResponse>> searchResponse = new MutableLiveData<>();

    @Inject
    public MainViewModel(SearchRepository repository) {
        this.repository = repository;
    }

    public void search(String query) {
        loading.set(true);
        searchResponse.postValue(DataWrapper.loading());
        addToUnsubscribed(repository.search(query)
                .subscribe(searchResponseDataWrapper -> {
                            loading.set(false);
                            searchResponse.postValue(searchResponseDataWrapper);
                        }
                )
        );
    }
}
