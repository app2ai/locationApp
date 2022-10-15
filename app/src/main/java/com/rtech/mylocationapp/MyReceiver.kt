package com.rtech.mylocationapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.location.Location
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(ctx: Context?, intent: Intent?) {
        val location: Location? = intent?.getParcelableExtra<Location>(LocationUpdatesService.EXTRA_LOCATION)
        if (location == null) {
            Toast.makeText(
                ctx, Utils.getLocationText(location),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}