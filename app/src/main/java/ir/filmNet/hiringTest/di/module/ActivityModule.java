package ir.filmNet.hiringTest.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ir.filmNet.hiringTest.ui.main.activity.MainActivity;
import ir.filmNet.hiringTest.ui.splash.SplashActivity;

/**
 * @author Abbas Asadi
 */
@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract SplashActivity contributeSplashActivity();

    @ContributesAndroidInjector(modules = FragmentModule.class)
    abstract MainActivity contributeMainActivity();

}

