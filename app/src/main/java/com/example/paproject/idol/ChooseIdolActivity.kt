package com.example.paproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paproject.databinding.ActivityChooseActorBinding
import com.example.paproject.databinding.ActivityChooseIdolBinding
import com.example.paproject.idol.BoyIdolAnalyzeActivity
import com.example.paproject.idol.GirlIdolAnalyzeActivity

class ChooseIdolActivity : AppCompatActivity() {

    //뷰바인딩
    private var mBinding: ActivityChooseIdolBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityChooseIdolBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //남자배우 버튼
        val boyIdol = binding.boyChooseBtn
        boyIdol.setOnClickListener {
            initBoyDialog()
        }
        //여자배우 버튼
        val girlIdol = binding.girlChooseBtn
        girlIdol.setOnClickListener {
            initGirlDialog()
        }
    }
    //남자 배우 다이얼로그
    private fun initBoyDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.boy_idol)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, BoyIdolAnalyzeActivity::class.java))
            })

        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //여자 배우 다이얼로그
    private fun initGirlDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.intro_iu)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, GirlIdolAnalyzeActivity::class.java))
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