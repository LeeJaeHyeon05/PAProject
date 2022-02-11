package com.example.paproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.paproject.databinding.ActivityIntroBinding
import com.example.paproject.databinding.ActivityMainBinding
import com.example.paproject.disney.ChooseDisneyActivity

class MainActivity : AppCompatActivity() {

    //뷰바인딩
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //아이돌 버튼 불러오기
        val idolBtn = binding.idolBtn
        //아이돌 버튼 눌렀을때
        idolBtn.setOnClickListener {
            startActivity(Intent(this, ChooseIdolActivity::class.java))
            Toast.makeText(this, "아이돌 닮은 꼴 찾으러 가기!", Toast.LENGTH_SHORT).show()
        }

        //영화 버튼 불러오기
        val actorBtn = binding.actorBtn
        //영화 버튼 눌렀을때
        actorBtn.setOnClickListener {
            startActivity(Intent(this, ChooseActorActivity::class.java))
            Toast.makeText(this, "배우 닮은 꼴 찾으러 가기", Toast.LENGTH_SHORT).show()
        }

        //디즈니 버튼 불러오기
        val disneyBtn = binding.disneyBtn
        disneyBtn.setOnClickListener {
            startActivity(Intent(this, ChooseDisneyActivity::class.java))
            Toast.makeText(this, "디즈니 닮은 꼴 찾으러 가기", Toast.LENGTH_SHORT).show()
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}