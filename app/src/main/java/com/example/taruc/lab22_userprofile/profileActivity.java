package com.example.taruc.lab22_userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class profileActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText userIDEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        emailEditText=(EditText)findViewById(R.id.emailEditText);
        userIDEditText=(EditText)findViewById(R.id.userIDEditText);

    }
    public void save(View v){
        Intent intent=new Intent();
        intent.putExtra(MainActivity.USER_ID,userIDEditText.getText().toString());
        intent.putExtra(MainActivity.USER_EMAIL,emailEditText.getText().toString());
        setResult(1,intent);
        finish();

    }
}
