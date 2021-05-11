package com.example.notetaking.di

import android.app.Application
import com.example.notetaking.AppApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ActivityInjectModule::class,
        FragmentInjectModule::class,
        ViewModelModule::class,
        FirebaseModule::class,
        AppModule::class,
        AndroidInjectionModule::class,
    ]
)
interface AppComponent : AndroidInjector<AppApplication> {

    // instruct the component how to build itself. using the @Component.Builder annotation.
    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}