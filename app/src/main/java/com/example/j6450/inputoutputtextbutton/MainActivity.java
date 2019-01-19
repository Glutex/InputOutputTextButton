package com.example.j6450.inputoutputtextbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{
    TextView outputText;
    EditText inputText;
    CharSequence text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputText = (TextView) findViewById(R.id.textView);
        //inputText.getText();
        inputText = (EditText) findViewById(R.id.editText);
    }

    public void textIO(View v)
    {
        text = inputText.getText();
        outputText.setText(text);
    }
}
