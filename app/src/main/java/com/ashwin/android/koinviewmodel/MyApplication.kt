package com.ashwin.android.koinviewmodel

import android.app.Application
import com.ashwin.android.koinviewmodel.di.computerModule
import com.ashwin.android.koinviewmodel.di.computerViewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(computerViewModule, computerModule))
        }
    }
}