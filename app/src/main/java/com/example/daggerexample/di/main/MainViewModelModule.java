package com.example.daggerexample.di.main;

import androidx.lifecycle.ViewModel;

import com.example.daggerexample.di.ViewModelKey;
import com.example.daggerexample.ui.main.posts.PostsViewModel;
import com.example.daggerexample.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}
