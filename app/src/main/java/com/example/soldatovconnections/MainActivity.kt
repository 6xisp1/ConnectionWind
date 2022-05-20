package com.example.soldatovconnections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bashkirov_opisanie.R
import com.example.bashkirov_opisanie.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private  val fragList = listOf(
        Fragment1.newInstance(),
        Fragment2.newInstance()
    )
    private  val fragListTitles = listOf(
        "Связи",
        "Состояние направлений"
    )
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = VPadapter(this, fragList)
        binding.placeHolder.adapter = adapter
        TabLayoutMediator(binding.tabchick, binding.placeHolder){
            tab, pos -> tab.text = fragListTitles[pos]
        }.attach()
    }
}