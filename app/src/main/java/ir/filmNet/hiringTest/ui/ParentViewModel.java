package ir.filmNet.hiringTest.ui;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * @author Abbas Asadi
 */
public class ParentViewModel extends ViewModel {

    private final CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    public ObservableBoolean loading = new ObservableBoolean(false);

    @Deprecated
    protected CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

    protected void addToUnsubscribed(Disposable disposable) {
        mCompositeDisposable.add(disposable);
    }

    @Override
    protected void onCleared() {
        mCompositeDisposable.dispose();
        super.onCleared();
    }
}
