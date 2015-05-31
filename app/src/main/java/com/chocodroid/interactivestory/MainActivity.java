package com.chocodroid.interactivestory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText mNameField;
    private Button mButton;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.namEditText);
        mButton = (Button) findViewById(R.id.startButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mNameField.getText().toString();
                if (name.length()==0) {
                    Toast.makeText(MainActivity.this, "Please Enter Your Name To Proceed", Toast.LENGTH_SHORT).show();
                }
                else {
                    startStory();
                }

            }
        });
    }


    private void startStory() {

        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }


}
