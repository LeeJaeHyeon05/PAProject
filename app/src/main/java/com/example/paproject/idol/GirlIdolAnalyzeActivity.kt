package com.example.paproject.idol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.R
import com.example.paproject.databinding.ActivityChooseIdolBinding
import com.example.paproject.databinding.ActivityGirlIdolAnalyzeBinding

class GirlIdolAnalyzeActivity : AppCompatActivity() {

    //뷰바인딩
    private var mBinding: ActivityGirlIdolAnalyzeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityGirlIdolAnalyzeBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}