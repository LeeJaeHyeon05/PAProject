package com.example.paproject.idol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.R
import com.example.paproject.databinding.ActivityBoyIdolAnalyzeBinding
import com.example.paproject.databinding.ActivityGirlIdolAnalyzeBinding

class BoyIdolAnalyzeActivity : AppCompatActivity() {
    //뷰바인딩
    private var mBinding: ActivityBoyIdolAnalyzeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBoyIdolAnalyzeBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}