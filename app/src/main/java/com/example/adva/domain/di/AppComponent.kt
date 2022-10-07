package com.example.adva.domain.di



import com.example.adva.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        FragmentModule::class,
        AppModule::class

    ]
)
interface AppComponent {
    fun inject(application: MyApplication)
}