package com.raymag.kchat

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_sign_in.setOnClickListener {signIn(
            email_sign_in.text.toString(),
            password_sign_in.text.toString()
        )}
        no_account.setOnClickListener {noAccount()}
    }

    private fun signIn(email: String, password: String) {
        Toast.makeText(this, "Para MATEEEUS!!", Toast.LENGTH_SHORT).show()

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {

            }
    }

    private fun noAccount() {
        finish()
    }
}