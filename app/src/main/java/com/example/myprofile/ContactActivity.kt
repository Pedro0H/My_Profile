package com.example.myprofile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContactActivity : AppCompatActivity() {

    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val gmailText = findViewById<TextView>(R.id.gmail_text)
        gmailText.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:pedrohenriquelimapereira9@gmail.com")
            }
            startActivity(intent)
        }
        val linkedinText = findViewById<TextView>(R.id.linkedin_text)
        linkedinText.setOnClickListener {
            val url = "https://www.linkedin.com/in/pedro-henrique-lima-pereira-0570b9283/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val zapText = findViewById<TextView>(R.id.zap_text)
        zapText.setOnClickListener {
            val url = "https://wa.me/5511986148362"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val instaText = findViewById<TextView>(R.id.insta_text)
        instaText.setOnClickListener {
            val url = "https://www.instagram.com/pedroh.lp"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val gitText = findViewById<TextView>(R.id.git_text)
        gitText.setOnClickListener {
            val url = "https://github.com/Pedro0H"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}