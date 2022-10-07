package com.example.adva.domain.di
import com.example.adva.views.fragments.PhotosFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeFragmentInjector(): PhotosFragment

}