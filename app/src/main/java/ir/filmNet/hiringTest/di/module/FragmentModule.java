package ir.filmNet.hiringTest.di.module;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ir.filmNet.hiringTest.ui.main.fragment.MainFragment;

/**
 * @author Abbas Asadi
 */
@Module
public abstract class FragmentModule {

    /*
     * We define the name of the Fragment we are going
     * to inject the ViewModelFactory into. i.e. in our case
     */


    @ContributesAndroidInjector
    abstract MainFragment contributesMainFragment();


//    @ContributesAndroidInjector
//    abstract ErrorDialogFragment contributesErrorDialogFragment();


}