package com.aiartqr.aiartqrcode.qraiart.alertfiredemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.os.Vibrator
import android.util.Log
import android.widget.Toast

class AlarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val vibrator = context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate( 4000)
        Toast.makeText(context,"Alarm Wake up",Toast.LENGTH_SHORT).show()

//        var alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
//
//        if (alarmUri == null){
//
//            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
//        }
//        val ringtone = RingtoneManager.getRingtone(context,alarmUri)
//        ringtone.play();

        val mediaPlayer = MediaPlayer.create(context,RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM))
        mediaPlayer.isLooping = true
        mediaPlayer.start()

    }
}