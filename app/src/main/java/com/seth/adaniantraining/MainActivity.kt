package com.seth.adaniantraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seth.adaniantraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNavigationView.inflateMenu(R.menu.bottom_navigation_menu)

        binding.changeSportExtendedFab.setOnClickListener {
            CustomBottomSheetDialogFragment().apply {
                show(supportFragmentManager, CustomBottomSheetDialogFragment.TAG)
            }
        }

    }
}