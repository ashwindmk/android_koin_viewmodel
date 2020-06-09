package com.ashwin.android.koinviewmodel.di

import android.os.Bundle
import com.ashwin.android.koinviewmodel.model.Computer
import com.ashwin.android.koinviewmodel.model.Cover
import com.ashwin.android.koinviewmodel.model.Hardware
import com.ashwin.android.koinviewmodel.model.Software
import com.ashwin.android.koinviewmodel.viewmodel.ComputerViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val computerViewModule = module {
    fun provideViewModel(bundle: Bundle): ComputerViewModel {
        return ComputerViewModel(bundle)
    }

    viewModel { (bundle: Bundle) -> provideViewModel(bundle) }
}

val computerModule = module {
    fun provideSoftware(os: String, av: String): Software {
        return Software(os, av)
    }

    fun provideHardware(proc: String, ram: String, hdd: String): Hardware {
        return Hardware(proc, ram, hdd)
    }

    single { Cover() }

    factory { (os: String, av: String, proc: String, ram: String, hdd: String) -> Computer(provideSoftware(os, av), provideHardware(proc, ram, hdd), get()) }
}
