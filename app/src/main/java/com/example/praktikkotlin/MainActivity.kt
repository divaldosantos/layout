package com.example.praktikkotlin

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.praktikkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile, R.id.navigation_skill
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    fun showMaintenanceDialog(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Fitur Belum Tersedia")
        builder.setMessage("Fitur masih tahap maintenance oleh Padias")

        builder.setPositiveButton("OK") { dialog: DialogInterface, which: Int ->
            // Tindakan yang diambil ketika tombol "OK" ditekan
            dialog.dismiss() // Tutup dialog
        }

        val dialog = builder.create()
        dialog.show()
    }

}