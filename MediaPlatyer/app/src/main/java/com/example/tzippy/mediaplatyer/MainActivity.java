package com.example.tzippy.mediaplatyer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new HandleClick());
    }

    private class HandleClick implements OnClickListener{

        public void onClick(View arg0) {
            Button btn = (Button)arg0;  //cast view to a button
            // get a reference to the TextView
            TextView tv = (TextView) findViewById(R.id.main_text);
            // update the TextView text
            tv.setText("Tzippy");
        }
    }
}
