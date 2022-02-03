package com.irsyad_19104040.modul6broadcastreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SmsReceiverActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)

        val tv_form: TextView = findViewById(R.id.tv_form)
        val tv_message: TextView = findViewById(R.id.tv_message)
        val btn_close: Button = findViewById(R.id.btn_close)

        title = getString(R.string.incoming_message)
        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)
        tv_form.text = getString(R.string.coming_form) + ": " + senderNo
        tv_message.text = senderMessage
        btn_close.setOnClickListener { finish() }
    }
}