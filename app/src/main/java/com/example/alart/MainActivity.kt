package com.example.alart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val diologe = AlertDialog.Builder(this)
            diologe.setTitle("Delete")
            diologe.setMessage("Wanna delete this ?")
            diologe.setIcon(R.drawable.img_2)
            Toast.makeText(this, "click alert", Toast.LENGTH_SHORT).show()


            diologe.setPositiveButton("YES"){diologInterface,which->
                Toast.makeText(this, "click YES", Toast.LENGTH_SHORT).show()
            }
            diologe.setNegativeButton("NO"){diologInterface,which->
                Toast.makeText(this, "click NO", Toast.LENGTH_SHORT).show()
            }
            diologe.setNeutralButton("Cancel"){diologInterface,which->
                Toast.makeText(this, "click Cancel", Toast.LENGTH_SHORT).show()
            }


            val alertDialog:AlertDialog =diologe.create()
            alertDialog.setCancelable(true)
            alertDialog.show()

        }
    }
}