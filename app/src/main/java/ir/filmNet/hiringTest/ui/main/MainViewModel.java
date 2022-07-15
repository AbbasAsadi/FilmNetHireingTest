package ir.filmNet.hiringTest.ui.main;

import android.arch.lifecycle.LifecycleObserver;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import ir.filmNet.hiringTest.data.DataWrapper;
import ir.filmNet.hiringTest.data.remote.model.SearchResponse;
import ir.filmNet.hiringTest.data.repository.SearchRepository;

public class MainViewModel extends ViewModel implements LifecycleObserver {
    private final SearchRepository repository;
    public MutableLiveData<DataWrapper<SearchResponse>> searchResponse = new MutableLiveData<>();

    @Inject
    public MainViewModel(SearchRepository repository) {
        this.repository = repository;
    }

    public void search(String query) {
        searchResponse.setValue(DataWrapper.loading());
        new CompositeDisposable().add(repository.search(query)
                .subscribe(searchResponseDataWrapper -> searchResponse.postValue(searchResponseDataWrapper)
                )
        );
    }
}
