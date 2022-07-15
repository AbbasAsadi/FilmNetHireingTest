package ir.filmNet.hiringTest.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ir.filmNet.hiringTest.di.ViewModelKey;
import ir.filmNet.hiringTest.factory.ViewModelFactory;
import ir.filmNet.hiringTest.ui.main.MainViewModel;

/**
 * @author Abbas Asadi
 */

@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    /**
     * This methods basically says
     * inject this object into a Map using the @IntoMap annotation,
     * with the  MainActivityViewModel.class as key,
     * and a Provider that will build a MainActivityViewModel
     * object.
     */
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    protected abstract ViewModel mainViewModel(MainViewModel mainViewModel);


}