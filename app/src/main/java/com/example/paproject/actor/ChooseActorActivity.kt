package com.example.paproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.paproject.databinding.ActivityChooseActorBinding
import com.example.paproject.databinding.ActivityMainBinding

class ChooseActorActivity : AppCompatActivity() {

    //뷰바인딩
    private var mBinding: ActivityChooseActorBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰바인딩
        mBinding = ActivityChooseActorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //남자배우 버튼
        val boyActor = binding.boyChooseBtn
        boyActor.setOnClickListener {
            initBoyDialog()
        }
        //여자배우 버튼
        val girlActor = binding.girlChooseBtn
        girlActor.setOnClickListener {
            initGirlDialog()
        }
    }

    //남자 배우 다이얼로그
    private fun initBoyDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.boy_actor)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, BoyActorAnalyzeActivity::class.java))
            })

        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //여자 배우 다이얼로그
    private fun initGirlDialog() {
        val dialogBuilder = android.app.AlertDialog.Builder(this)
        dialogBuilder.setMessage(R.string.dialogExplainText)
            .setIcon(R.drawable.girl_actor)
            .setCancelable(false)
            .setNegativeButton(R.string.cancelText, DialogInterface.OnClickListener { _, _ ->
                finish()
            })
            .setPositiveButton(R.string.nextDialogText, DialogInterface.OnClickListener { _, _ ->
                startActivity(Intent(this, GirlActorAnalyzeActivity::class.java))
            })
        val alert = dialogBuilder.create()
        alert.setTitle(R.string.checkText)
        alert.show()
    }
    //메모리 누수 막기
    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}