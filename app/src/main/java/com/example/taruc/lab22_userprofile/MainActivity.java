package com.example.taruc.lab22_userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_PROFILE_UPDATE =1 ;
    public static final String USER_EMAIL = "package com.example.taruc.lab22_userprofile.EMAIL";
    public static final String USER_ID = "package com.example.taruc.lab22_userprofile.ID";
    private TextView IDtextView;
    private TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDtextView=(TextView)findViewById(R.id.textView);
        emailTextView=(TextView)findViewById(R.id.textView2);

    }

    public void clickEdit(View v){
        Intent intent=new Intent(this,profileActivity.class);
        startActivityForResult(intent,REQUEST_PROFILE_UPDATE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //request code=the unique that you activity sent with an intent
        //resultCode= Store eihter ok or Cancel
        //data=the data returned from an intent
        if(requestCode==REQUEST_PROFILE_UPDATE){
            String id,email;
            id=data.getStringExtra(USER_ID);
            email=data.getStringExtra(USER_EMAIL);

            //Display DATA on UI
            emailTextView.setText(getString(R.string.email)+email);
            IDtextView.setText(getString(R.string.UserId)+id);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity","onPause");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("Main Activity","onResume");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Main Activity","onStart");

    }
    public void showMain(View v){
        Intent intent=new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }
}
