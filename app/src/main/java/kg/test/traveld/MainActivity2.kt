package kg.test.traveld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}
