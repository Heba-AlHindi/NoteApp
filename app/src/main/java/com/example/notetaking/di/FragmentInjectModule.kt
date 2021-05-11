package com.example.notetaking.di

import com.example.notetaking.views.home.CategoriesFragment
import com.example.notetaking.views.home.CreateNoteFragment
import com.example.notetaking.views.home.NotesFragment
import com.example.notetaking.views.registration.LogInFragment
import com.example.notetaking.views.registration.SignUpFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

// Inject all fragments here
@Module
abstract class FragmentInjectModule {

    @ContributesAndroidInjector
    abstract fun injectSignUpFragment(): SignUpFragment

    @ContributesAndroidInjector
    abstract fun injectLogInFragment(): LogInFragment

    @ContributesAndroidInjector
    abstract fun injectNotesFragment(): NotesFragment

    @ContributesAndroidInjector
    abstract fun injectCreateNoteFragment(): CreateNoteFragment

    @ContributesAndroidInjector
    abstract fun injectCategoriesFragment(): CategoriesFragment
}