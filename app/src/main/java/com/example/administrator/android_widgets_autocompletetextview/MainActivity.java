package com.example.administrator.android_widgets_autocompletetextview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    private String[] normalString = {"Android", "Android Blog", "Android Market", "Android SDK", "Android AVD", "BlackBerry",
            "BlackBerry JDE", "Symbian", "Symbian Carbide", "Java 2ME", "Java FX", "Java 2EE", "Java 2SE", "Mobile", "Motorola", "Nokia",
            "Sun", "Nokia Symbian", "Nokia Forum", "WindowsMobile", "Broncho", "Windows XP", "Google", "Google Android", "Google浏览器",
            "IBM", "Microsoft", "Java", "C++", "C", "C#", "J#", "VB"};

    private AutoCompleteTextView autoCompleteTextView;
    private Button clean;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        setAdapter();
        setListener();
    }

    private void  setAdapter(){
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,normalString);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }

    private void setListener() {
        clean.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.clean_btn:
                autoCompleteTextView.setText("");
                break;
        }
    }

    private void findViewById() {
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.AutoCompleteTextView_Input);
        clean = (Button)findViewById(R.id.clean_btn);
    }
}
