package eniso.gte2.tp2iheb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tp2iheb.databinding.ActivityTemperatureBinding
import kotlin.math.ceil

class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_temperature)
        val binding = ActivityTemperatureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rb1.setOnClickListener{
            val Tf = ((9*binding.e1.text.toString().toFloat())/5)+32
            if (binding.checkBox.isChecked) {
                binding.t3.text = ceil(Tf).toString()
            }
            else
                    binding.t3.text="$Tf"

        }
        binding.rb2.setOnClickListener{
            val Tc = (5*(binding.e1.text.toString().toFloat()-32)/9)
            if (binding.checkBox.isChecked){
                    binding.t3.text = ceil(Tc).toString()
            }
            else
                    binding.t3.text="$Tc"

        }
    }
}