package com.example.mailingapphomework

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.example.mailingapphomework.databinding.ActivityMainBinding

class MainActivity : Activity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.button.setOnClickListener {
                val intent = Intent(Intent.ACTION_SENDTO,
                    Uri.parse("mailto:${binding.whom.editText?.text.toString()}?body=${binding.letter.editText?.text.toString()}"))
                startActivity(intent)
            }
    }
}
