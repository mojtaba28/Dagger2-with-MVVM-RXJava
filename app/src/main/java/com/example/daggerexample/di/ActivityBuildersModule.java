package com.example.daggerexample.di;

import com.example.daggerexample.di.auth.AuthModule;
import com.example.daggerexample.di.auth.AuthScope;
import com.example.daggerexample.di.auth.AuthViewModelsModule;
import com.example.daggerexample.di.main.MainFragmentBuilderModule;
import com.example.daggerexample.di.main.MainModule;
import com.example.daggerexample.di.main.MainScope;
import com.example.daggerexample.di.main.MainViewModelModule;
import com.example.daggerexample.ui.Auth.AuthActivity;
import com.example.daggerexample.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
            )

    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuilderModule.class, MainViewModelModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

//    @Provides
//    static String something(){
//        return "this is a test string";
//    }
}
