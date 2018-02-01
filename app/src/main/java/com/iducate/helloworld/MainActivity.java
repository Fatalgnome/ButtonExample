package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("martin");
        Log.d("MainActivity","Startup finished");

    }
    
    public void sayHello(View view) {

        dialog = new Dialog(this);
        
        dialog.setTitle("greetings"); //hardcoded - should be in strings.xml!

        TextView textView = new TextView(this);
        //textView.setText("Hello World"); //Hardcoded - not best.
        textView.setText(R.string.hello_world); //refers to strings.xml  better!
        textView.setPadding(20, 20, 20, 20);
        
        dialog.setContentView(textView);
        
        dialog.show();
    }
    
}
