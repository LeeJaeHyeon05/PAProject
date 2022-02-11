package com.example.paproject.disney

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.R
import com.example.paproject.databinding.ActivityChooseDisneyBinding
import com.example.paproject.databinding.ActivityChooseIdolBinding
import com.example.paproject.idol.BoyIdolAnalyzeActivity
import com.example.paproject.idol.GirlIdolAnalyzeActivity

class ChooseDisneyActivity : AppCompatActivity() {

    //뷰바인딩
    private var mBinding: ActivityChooseDisneyBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityChooseDisneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //공듀 버튼
        val princesBtn = binding.princesImageButton
        princesBtn.setOnClickListener {
            initPrincesDialog()
        }
        //왕자 버튼 불러오기
        val princeBtn = binding.princeImageButton
        princeBtn.setOnClickListener {
            initPrinceDialog()
        }
        //동물 버튼 불러오기
        val animalBtn = binding.animalImageButton
        animalBtn.setOnClickListener {
            initAnimalDialog()
        }


    }
    //공주 다이얼로그
    private fun initPrincesDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.princes_disney)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, PrincesDisneyActivity::class.java))
            })

        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //왕자 다이얼로그
    private fun initPrinceDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.prince_disney)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, PrinceDisneyActivity::class.java))
            })
        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //여자 배우 다이얼로그
    private fun initAnimalDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.animal_disney)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, AnimalActivity::class.java))
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