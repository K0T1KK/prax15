package com.example.prax15

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Проверка состояния входа
        val sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        if (isLoggedIn) {
            // Если пользователь уже вошел, переходите на MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Закрыть WelcomeActivity
        } else {
            // Если пользователь не вошел, устанавливаем слушатель на кнопку
            val continueButton: Button = findViewById(R.id.continueButton)
            continueButton.setOnClickListener {
                // Переход на активность Login
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish() // Закрыть текущую активность
            }
        }
    }
}
