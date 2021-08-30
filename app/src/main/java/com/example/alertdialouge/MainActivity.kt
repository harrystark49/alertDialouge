package com.example.alertdialouge

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        alert.setOnClickListener {
            var builder=AlertDialog.Builder(this)
            builder.setTitle("harrystark")
            builder.setPositiveButton("ok"){ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("no"){ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
            }


            builder.create()
            builder.setCancelable(true)
            builder.show()
        }


    }

    override fun onBackPressed() {
        var builder=AlertDialog.Builder(this)
        builder.setTitle("harrystark")
        builder.setPositiveButton("ok"){ dialogInterface: DialogInterface, i: Int ->
            super.onBackPressed()
        }
        builder.setNegativeButton("no"){ dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
        }


        builder.create()
        builder.setCancelable(true)
        builder.show()


    }
}