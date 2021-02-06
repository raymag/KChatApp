package com.raymag.kchat

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_sign_in.setOnClickListener {signIn()}
        no_account.setOnClickListener {noAccount()}
    }

    private fun signIn() {
        Toast.makeText(this, "Para MATEEEUS!!", Toast.LENGTH_SHORT).show()
    }

    private fun noAccount() {
        finish()
    }
}