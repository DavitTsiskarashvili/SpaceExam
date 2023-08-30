package com.spaceexam

import android.app.Application
import com.spaceexam.data.local.di.dataBaseModule
import com.spaceexam.data.mapper.module.databaseMapperModule
import com.spaceexam.domain.di.repositoryModule
import com.spaceexam.domain.di.useCaseModule
import com.spaceexam.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ExamApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ExamApp)
            modules(
                dataBaseModule,
                viewModelModule,
                databaseMapperModule,
                repositoryModule,
                useCaseModule
            )
        }
    }
}