package com.octo.rdo.enzo.mobday

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import java.io.FileInputStream

object FirebaseWrapper {

    fun initFirebase() {
        val firebaseCredentialsPath = "mobday_server_fcm.json"

        FileInputStream(firebaseCredentialsPath).use { serviceAccount ->
            val options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build()

            FirebaseApp.initializeApp(options)
        }
    }

}
