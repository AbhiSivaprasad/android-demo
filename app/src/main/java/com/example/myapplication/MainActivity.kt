package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText);
        val message = getString(R.string.edit_message, "hello");
        editText.setText(message);
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText);
        val message = getString(R.string.edit_message, "hello");
        editText.setText(message);
        println(message);
        val intent = Intent(this, DisplayMessagesActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message);
        }
        startActivity(intent)
    }
}