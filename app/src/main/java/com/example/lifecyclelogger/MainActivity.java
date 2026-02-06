package com.example.lifecyclelogger;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity Lifecycle Logger - משימה 1
 * 
 * המשימה שלכם: הוסיפו הודעות Log.d() לכל פונקציות מחזור החיים.
 * 
 * פונקציות שצריך להוסיף:
 * 1. onCreate() - כבר קיימת, רק צריך להוסיף Log
 * 2. onStart()
 * 3. onResume()
 * 4. onPause()
 * 5. onStop()
 * 6. onDestroy()
 * 
 * דוגמה להודעת Log:
 * Log.d("LifecycleDemo", "onCreate called");
 */
public class MainActivity extends AppCompatActivity {

    // TAG לשימוש ב-Log - השתמשו בזה בכל ההודעות
    private static final String TAG = "LifecycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     Log.d("LifecycleDemo", "onCreate called");
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifecycleDemo", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifecycleDemo", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifecycleDemo", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifecycleDemo", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifecycleDemo", "onDestroy called");
    }
}
