package com.benik.quizzapplication;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.Toast;

import com.benik.quizzapplication.databinding.ActivityFullscreenBinding;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private ActivityFullscreenBinding binding;

    private String result = "Tokyo";
    private Button choice1;
    private Button choice2;
    private Button choice3;

    private void showToastMessage(boolean showToastMessage) {
        if (showToastMessage)

        {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);


        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (choice1.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (choice2.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (choice3.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });
    }

}