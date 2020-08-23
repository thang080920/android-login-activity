package com.example.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDone;
    private EditText edUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        edUser = (EditText)findViewById(R.id.edUser);
        btnDone = (Button)findViewById(R.id.btnDone);
        btnDone.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDone:
                onDone();
                break;
            default:
                break;
        }
    }

    private void onDone() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("RESULT", edUser.getText().toString());
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}