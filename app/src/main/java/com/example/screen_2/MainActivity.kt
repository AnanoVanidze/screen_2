package com.example.screen_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.screen_2.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recipientsTv.text = getText(R.string.recipients)
        binding.transferTv.text = getText(R.string.transfer_details)
        binding.paymentTv.text = getText(R.string.payment_request)
        binding.amountTv.text = getText(R.string.amount)
        binding.amountNumberTv.text = getText(R.string._10_00)







    }
}