package eniso.gte2.tp2iheb

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import eniso.gte2.tp2iheb.databinding.ActivityConversionBinding
import eniso.gte2.tp2iheb.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_currency)
        val binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //CODE ACTIVITY 2
        binding.button.setOnClickListener {
            binding.button.setBackgroundColor(Color.LTGRAY)
            val a = binding.e1.text.toString().toFloat()
            val intent = Intent(this, ConversionActivity::class.java)
            intent.putExtra("text1", "L'équivalent de $a DT en EURO est : ")
            intent.putExtra("result1", binding.e1.text.toString().toFloat())
            intent.putExtra("text", "L'équivalent de $a EURO en DT est : ")
            intent.putExtra("result", binding.e1.text.toString().toFloat())
            startActivity(intent)

        }
    }
}
        /*//CODE ACTIVITY 1
        binding.button1.setOnClickListener {
            binding.button1.setBackgroundColor(Color.DKGRAY)
            binding.button2.setBackgroundColor(Color.LTGRAY)
            val res = binding.e1.text.toString().toFloat() / 3.2
            binding.t1.text = "$res"
            // binding.t1.setText("$res")
            if (binding.t1.text.isEmpty()) (
                    Toast.makeText(this, "le champs de saisie est vide", Toast.LENGTH_LONG).show()
                    )
        }
        binding.button2.setOnClickListener {
            binding.button2.setBackgroundColor(Color.DKGRAY)
            binding.button1.setBackgroundColor(Color.LTGRAY)
            val res = binding.e1.text.toString().toInt() * 3.2
            binding.t1.text = "$res"
            // ou bien binding.t1.setText("$res")
            if (binding.t1.text.isEmpty()) (
                    Toast.makeText(this, "le champs de saisie est vide", Toast.LENGTH_LONG).show()
                    )
        }
        binding.t1.setOnClickListener {
            if (binding.button1.isClickable == binding.button2.isClickable) {
                Toast.makeText(
                    this,
                    "Vous n'avez pas choisi le mode de transition !",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
      }
    }*/


