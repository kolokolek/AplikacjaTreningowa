package com.example.kamilslu.aplikacjatreningowa;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jazdazbro(View view) {

        TextView pobranezrzutowniaTextView = (TextView) findViewById(R.id.textView1id);

    }
}
