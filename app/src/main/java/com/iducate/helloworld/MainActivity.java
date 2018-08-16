package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnHello);
      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Hello class",Toast.LENGTH_LONG);
                toast.show();
            }
        });*/
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
