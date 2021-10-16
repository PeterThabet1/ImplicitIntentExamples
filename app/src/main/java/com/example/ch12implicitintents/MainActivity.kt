package com.example.ch12implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Web")
        menu?.add("Map")
        menu?.add("Phone")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var m_uri : Uri
        var m_intent = Intent()

        when(item?.toString()){
            "Web"->{
                m_uri = Uri.parse("https://www.facebook.com")
                m_intent= Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Map"->{
                m_uri = Uri.parse("https://goo.gl/maps/UpzAk6rcY115xyvz6")
                m_intent = Intent(Intent.ACTION_VIEW,m_uri)
            }
            "Phone"->{
                m_uri = Uri.parse("tel:1234567")
                m_intent = Intent(Intent.ACTION_DIAL,m_uri)
            }
        }
        startActivity(m_intent)
        return super.onOptionsItemSelected(item)
    }




}