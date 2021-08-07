package dk.easj.anbo.helloexamplefindviewbyid

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.sayHelloButton)
        button.setOnClickListener {
            val editText = findViewById<EditText>(R.id.nameEditText)
            val name = editText.text.trim()
            if (name.isEmpty()) {
                editText.error = "No name"
                return@setOnClickListener
            }
            val textView = findViewById<TextView>(R.id.sayHelloTextView)
            textView.text = "Hello $name"
        }
    }
}