package com.example.menu_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var Main_Activity:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Main_Activity=findViewById(R.id.Main_Activity)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.inf_menu,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.contentus -> {
                Main_Activity.text = "contentus menu clicked"
                true
            }
            R.id.settings -> {
                Main_Activity.text = "settings menu clicked"
                true
            }
            R.id.logout -> {
                Main_Activity.text= "logout menu clicked"
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
}