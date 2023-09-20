package com.example.study_lifecycle_n_extensionfunction

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.remove
import android.util.Log
import android.widget.Toast
import com.example.study_lifecycle_n_extensionfunction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d("study1","onCreate 확인")

        val intent = Intent(this, MainActivity2::class.java)

        binding.button.setOnClickListener {

            startActivity(intent)
            showToastShort("액티비티 이동 성공")
            showToastLong("액티비티 이동 성공~~~")

        }

        binding.button2.setOnClickListener {
            setFragment()
        }

        binding.button3.setOnClickListener {
            removeFragment()
        }
    }

    private fun setFragment() {
        val blankFragment = BlankFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, blankFragment).commit()

    }

    private fun removeFragment() {
        val blankFragment = supportFragmentManager.findFragmentById(R.id.blankFragment)
        val frameLayout = supportFragmentManager.findFragmentById(R.id.frameLayout)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.remove(frameLayout!!).commit()

    }

    private fun Context.showToastShort(text: String) {
        return Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

    }

    private fun Context.showToastLong(text: String) {
        return Toast.makeText(this, text, Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d("study1","onStart 확인")

    }

    override fun onResume() {
        super.onResume()
        Log.d("study1","onResume 확인")
    }

    override fun onPause() {
        super.onPause()
        Log.d("study1","onPause 확인")
    }

    override fun onStop() {
        super.onStop()
        Log.d("study1","onStop 확인")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("study1","onDestory 확인")
    }
}