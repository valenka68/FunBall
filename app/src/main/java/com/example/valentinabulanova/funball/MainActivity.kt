package com.example.valentinabulanova.funball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.valentinabulanova.funball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvText.setOnClickListener {
            binding.tvText.text = getFred()
        }
    }
    private fun getFred(): String {
        return  resources.getStringArray(R.array.predskaz)[randomNumber()]
    }
private fun randomNumber(): Int {
    val size = resources.getStringArray(R.array.predskaz).size - 1
    return (0..size).random()
}
}