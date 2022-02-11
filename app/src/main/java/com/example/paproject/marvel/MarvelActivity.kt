package com.example.paproject.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.R
import com.example.paproject.databinding.ActivityChooseDisneyBinding
import com.example.paproject.databinding.ActivityMarvelBinding

class MarvelActivity : AppCompatActivity() {

    //뷰바인딩
    private var mBinding: ActivityMarvelBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvel)
        mBinding = ActivityMarvelBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}