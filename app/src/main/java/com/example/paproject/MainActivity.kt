package com.example.paproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.paproject.databinding.ActivityIntroBinding
import com.example.paproject.databinding.ActivityMainBinding
import com.example.paproject.disney.ChooseDisneyActivity
import com.example.paproject.disney.PrincesDisneyActivity
import com.example.paproject.marvel.MarvelActivity

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

        //마블 버튼 불러오기
        val marvelBtn = binding.marvelBtn
        marvelBtn.setOnClickListener {
            initMarvelDialog()
        }
        //민폐 버튼 불러오기
        val nuisanceBtn = binding.nuisanceBtn
        nuisanceBtn.setOnClickListener {
            initNuisanceDialog()
        }
        //머그샷 버튼 불러오기
        val mugShatBtn = binding.mugShatBtn
        mugShatBtn.setOnClickListener {
            initMugShatDialog()
        }


    }
    //마블 다이얼로그
    private fun initMarvelDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        //메세지, 아이콘, 다이얼 로그 외부 터치 캔슬 막기, 취소/계속 버튼
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.main_marvel)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ -> })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, MarvelActivity::class.java))
            })

        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //민폐 다이얼로그
    private fun initNuisanceDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        //메세지, 아이콘, 다이얼 로그 외부 터치 캔슬 막기, 취소/계속 버튼
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.main_nuisance)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ -> })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, MarvelActivity::class.java))
            })

        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //머그샷 다이얼로그
    private fun initMugShatDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        //메세지, 아이콘, 다이얼 로그 외부 터치 캔슬 막기, 취소/계속 버튼
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.main_mugshat)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ -> })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, MarvelActivity::class.java))
            })

        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}