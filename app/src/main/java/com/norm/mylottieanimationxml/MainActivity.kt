package com.norm.mylottieanimationxml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieDrawable
import com.norm.mylottieanimationxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            startAnim.setOnClickListener {
                lottieView.setMinProgress(0.0f)
                lottieView.setMaxProgress(0.27f)
                lottieView.repeatCount = LottieDrawable.INFINITE
                lottieView.repeatMode = LottieDrawable.REVERSE
                lottieView.playAnimation()
            }
            stopAnim.setOnClickListener {
                lottieView.setMinProgress(0.27f)
                lottieView.setMaxProgress(0.80f)
                lottieView.repeatCount = 0
                lottieView.repeatMode = LottieDrawable.RESTART
                lottieView.playAnimation()
            }
            fullAnim.setOnClickListener {
                lottieView.setMinProgress(0.0f)
                lottieView.setMaxProgress(1f)
                lottieView.repeatCount = 0
                lottieView.repeatMode = LottieDrawable.RESTART
                lottieView.playAnimation()
            }
        }
    }
}