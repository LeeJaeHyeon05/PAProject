package com.example.paproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.databinding.ActivityBoyActorAnalyzeBinding
import com.example.paproject.databinding.ActivityGirlIdolAnalyzeBinding

class BoyActorAnalyzeActivity : AppCompatActivity() {
    //뷰바인딩
    private var mBinding: ActivityBoyActorAnalyzeBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBoyActorAnalyzeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}