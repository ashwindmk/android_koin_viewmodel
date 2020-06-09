package com.ashwin.android.koinviewmodel.viewmodel

import android.content.ComponentCallbacks
import android.content.res.Configuration
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.ashwin.android.koinviewmodel.model.Computer
import org.koin.core.parameter.parametersOf
import org.koin.android.ext.android.get

class ComputerViewModel(bundle: Bundle) : ViewModel(), ComponentCallbacks {
    var computer: Computer

    init {
        val os = bundle.getString("os")
        val av = bundle.getString("av")
        val proc = bundle.getString("proc")
        val ram = bundle.getString("ram")
        val hdd = bundle.getString("hdd")

        computer = get<Computer>() { parametersOf(os, av, proc, ram, hdd) }
    }

    override fun onLowMemory() {
        TODO("Not yet implemented")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        TODO("Not yet implemented")
    }
}
