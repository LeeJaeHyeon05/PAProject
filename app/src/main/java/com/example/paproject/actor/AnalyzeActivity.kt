package com.example.paproject.actor

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.paproject.databinding.ActivityBoyActorAnalyzeBinding

class AnalyzeActivity : AppCompatActivity() {
    //뷰바인딩
    private var mBinding: ActivityBoyActorAnalyzeBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBoyActorAnalyzeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        requestPermission()
        registerForActivityResult(ActivityResultContracts.TakePicture()) { sc ->    // camera촬영 구현중
            if (sc) {
                when (intent.extras?.get("type")) {
                    "boy" -> {

                    }
                    "girl" -> {

                    }
                }
            }
        }
    }

    private fun requestPermission() {
        ActivityCompat.RequestPermissionsRequestCodeValidator { android.Manifest.permission.CAMERA }
    }

    private fun checkPermission() : Boolean {
        return ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (checkPermission()) {    // camera 허용

        } else {                    // camera 허용 안됨.
            requestPermission()     // 허용 요청.
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}