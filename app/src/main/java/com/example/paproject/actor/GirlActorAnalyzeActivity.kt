package com.example.paproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.databinding.ActivityGirlActorAnalyzeBinding
import com.example.paproject.databinding.ActivityGirlIdolAnalyzeBinding

class GirlActorAnalyzeActivity : AppCompatActivity() {
    //뷰바인딩
    private var mBinding: ActivityGirlActorAnalyzeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityGirlActorAnalyzeBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}