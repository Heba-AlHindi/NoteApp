package com.example.notetaking.di

import com.example.notetaking.views.SplashActivity
import com.example.notetaking.views.home.HomeActivity
import com.example.notetaking.views.registration.RegistrationActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

// Inject all activities here
@Module(includes = [ViewModelModule::class])
abstract class ActivityInjectModule {

    @ContributesAndroidInjector
    abstract fun injectSplashActivity(): SplashActivity

    @ContributesAndroidInjector
    abstract fun injectRegistrationActivity(): RegistrationActivity

    @ContributesAndroidInjector
    abstract fun injectHomeActivity(): HomeActivity

}