package com.example.alextimofeev_android_hw2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alextimofeev_android_hw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customView2.setTopLineDescription("Верхняя строчка, настроенная из кода")
        binding.customView2.setBottomLineDescription("Нижняя строчка, настроенная из кода")

        binding.customView3.setTopLineDescription("Описание очердной позиции верхней строки")
        binding.customView3.setBottomLineDescription("Описание очердной позиции нижней строки")

        }
    }
