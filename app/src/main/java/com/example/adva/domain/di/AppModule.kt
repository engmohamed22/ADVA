package com.example.adva.domain.di

import android.content.Context
import android.content.SharedPreferences
import com.example.adva.MyApplication

import com.example.adva.data.network.ApiClient
import com.example.adva.data.network.ApiInterface
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule (
    private var application: MyApplication
        ){

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }


    @Singleton
    @Provides
    fun provideApiInterface(): ApiInterface {
        return ApiClient.getClient()
    }


    @Singleton
    @Provides
    fun provideSharedPreferences(): SharedPreferences {
        return application.getSharedPreferences("BTP", Context.MODE_PRIVATE)
    }
}