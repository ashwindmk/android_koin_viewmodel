package com.ashwin.android.koinviewmodel.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ashwin.android.koinviewmodel.R
import com.ashwin.android.koinviewmodel.viewmodel.ComputerViewModel
import kotlinx.android.synthetic.main.activity_computer.*
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf

class ComputerActivity : AppCompatActivity() {
    lateinit var viewModel: ComputerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer)

        val bundle = intent.extras ?: Bundle()
        viewModel = get { parametersOf(bundle) }
    }

    override fun onStart() {
        super.onStart()
        computer_textview.text = viewModel.computer.toString()
    }
}
