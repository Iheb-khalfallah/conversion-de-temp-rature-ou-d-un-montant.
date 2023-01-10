package eniso.gte2.tp2iheb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tp2iheb.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_home)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button3.setOnClickListener {
            val i = Intent(this,CurrencyActivity::class.java)
            startActivity(i)
        }
        binding.button4.setOnClickListener {
            val i = Intent(this,ConversionActivity::class.java)
            startActivity(i)
        }
        binding.button5.setOnClickListener {
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
    }
}