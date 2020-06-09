package com.ashwin.android.koinviewmodel.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ashwin.android.koinviewmodel.R
import kotlinx.android.synthetic.main.activity_builder.*

class BuilderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)

        build_button.setOnClickListener {
            build()
        }
    }

    private fun build() {
        val os = os_spinner.selectedItem.toString()
        val av = av_spinner.selectedItem.toString()
        val proc = proc_spinner.selectedItem.toString()
        val ram = ram_spinner.selectedItem.toString()
        val hdd = hdd_spinner.selectedItem.toString()

        val intent = Intent(this, ComputerActivity::class.java)
        intent.putExtra("os", os)
        intent.putExtra("av", av)
        intent.putExtra("proc", proc)
        intent.putExtra("ram", ram)
        intent.putExtra("hdd", hdd)

        startActivity(intent)
    }
}
