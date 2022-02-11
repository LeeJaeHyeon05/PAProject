package com.example.paproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private var mBinding: ActivityIntroBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //버튼 불러오기
        val nextBtn = binding.introNextButton

        //버튼 셋온클릭리스너
        nextBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }



    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}