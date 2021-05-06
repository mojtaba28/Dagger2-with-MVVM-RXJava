package com.example.daggerexample.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.daggerexample.viewmodel.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModelFactoryModule  {

    @Provides
    static ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory){
        return viewModelFactory;
    }

//    @Binds
//    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
