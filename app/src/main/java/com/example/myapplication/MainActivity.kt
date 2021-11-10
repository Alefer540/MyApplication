package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iwPueblo.setOnClickListener{
            saludaAAmazon()
        }
         val listener= View.OnClickListener{


         }
        binding.tvTitulo1.setOnClickListener{
          if(binding.twScrollview1.visibility==View.VISIBLE)
              binding.twScrollview1.visibility=View.GONE
            else
              binding.twScrollview1.visibility=View.VISIBLE

        }
        binding.tvTitulo2.setOnClickListener{
            if(binding.twScrollview2.visibility==View.VISIBLE)
                binding.twScrollview2.visibility=View.GONE
            else
                binding.twScrollview2.visibility=View.VISIBLE

        }
        

    }
    fun saludaAAmazon(){
        Toast.makeText(this,"Hola amazon ;)" +binding.tvTitulo1.text,Toast.LENGTH_LONG).show()
    }

}