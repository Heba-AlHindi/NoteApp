package com.example.notetaking.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notetaking.viewmodels.HomeViewModel
import com.example.notetaking.viewmodels.RegistrationViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

// inject all viewModels here.
@Module
abstract class ViewModelModule {
    @Binds
    abstract fun injectViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun injectRegistrationViewModel(viewModel: RegistrationViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun injectHomeViewModel(viewModel: HomeViewModel): ViewModel
}