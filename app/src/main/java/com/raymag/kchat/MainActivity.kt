package com.raymag.kchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sign_up.setOnClickListener {signUp()}
        already_own_account.setOnClickListener {goToLoginActivity()}
    }

    private fun signUp() {
        val username = username_sign_up.text.toString()
        Toast.makeText(this, "Ai $username!", Toast.LENGTH_SHORT).show()
    }

    private fun goToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}