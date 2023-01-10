package eniso.gte2.tp2iheb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tp2iheb.databinding.ActivityConversionBinding


class ConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_conversion)
        val binding1 = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding1.root)

        val n1 = intent.getStringExtra("text1")
        val nb1 = intent.getFloatExtra("result1",0.0f)
        val n = intent.getStringExtra("text")
        val nb = intent.getFloatExtra("result",0.0f)
        binding1.button.setOnClickListener {
            binding1.t.text= "$n"+"${nb1*3.2}" ;
            binding1.t1.text= "$n1"+ "${nb/3.2}" ;
        }
        binding1.b2.setOnClickListener {
            val i = Intent(this,TemperatureActivity::class.java)
            startActivity(i)
        }
    }
}