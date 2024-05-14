package com.example.alextimofeev_android_hw2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.alextimofeev_android_hw2.databinding.CustomBlockViewBinding

class CustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet?=null
) : LinearLayout(context, attributeSet) {
    private val binding = CustomBlockViewBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setTopLineDescription(text: String) {
        binding.topLine.text = text
    }

    fun setBottomLineDescription(text: String) {
        binding.bottomLine.text = text
    }



}