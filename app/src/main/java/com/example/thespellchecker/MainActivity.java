package com.example.thespellchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int SL1R = 4;
    private int SL2R = 3;
    private int SL3R = 3;
    private int SL4R = 3;
    private int SL5R = 3;
    private int SL6R = 2;
    private int SL7R = 2;
    private int SL8R = 1;
    private int SL9R = 1;
    private int warlockSR = 3;
    private int CharacterLevel=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.CharacterClass);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.custom_spinner,getResources().getStringArray(R.array.characterclass));
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown);
        spinner.setAdapter(adapter);

        Spinner spinner1= findViewById(R.id.CharacterLevel);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.custom_spinner,getResources().getStringArray(R.array.characterlevel));
        adapter1.setDropDownViewResource(R.layout.custom_spinner_dropdown);
        spinner1.setAdapter(adapter1);

        Button btn = (Button)findViewById(R.id.SRbtnPlus1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL1R<4){
                    SL1R++;
                    TextView textView = (TextView) findViewById(R.id.SRL1);
                    textView.setText(""+SL1R);
                }

            }
        });

        Button btn1 = (Button) findViewById(R.id.SRbtnMinus1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL1R>0) {
                    SL1R--;
                    TextView textView = (TextView) findViewById(R.id.SRL1);
                    textView.setText("" + SL1R);
                }
            }
        });

        Button btn2 =(Button) findViewById(R.id.SRbtnPlus2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL2R<3){
                    SL2R++;
                    TextView textView = (TextView) findViewById(R.id.SRL2);
                    textView.setText(""+ SL2R);
                }
            }
        });

        Button btn3 = (Button) findViewById(R.id.SRbtnMinus2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL2R>0){
                    SL2R--;
                    TextView textView = (TextView) findViewById(R.id.SRL2);
                    textView.setText(""+SL2R);
                }
            }
        });

        Button btn4 = (Button) findViewById(R.id.SRbtnPlus3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL3R<3){
                    SL3R++;
                    TextView textView = (TextView) findViewById(R.id.SRL3);
                    textView.setText(""+SL3R);
                }
            }
        });

        Button btn5 = (Button) findViewById(R.id.SRbtnMinus3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL3R>0){
                    SL3R--;
                    TextView textView =(TextView)findViewById(R.id.SRL3);
                    textView.setText(""+ SL3R);
                }
            }
        });

        Button btn6 =(Button)findViewById(R.id.SRbtnPlus4);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL4R<3){
                    SL4R++;
                    TextView textView =(TextView) findViewById(R.id.SRL4);
                    textView.setText(""+SL4R);
                }
            }
        });

        Button btn7 =(Button)findViewById(R.id.SRbtnMinus4);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL4R>0){
                    SL4R--;
                    TextView textView = (TextView)findViewById(R.id.SRL4);
                    textView.setText(""+ SL4R);
                }
            }
        });

        Button btn8 = (Button) findViewById(R.id.SRbtnPlus5);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL5R<3){
                    SL5R++;
                    TextView textView = (TextView)findViewById(R.id.SRL5);
                    textView.setText(""+ SL5R);
                }
            }
        });

        Button btn9 = (Button) findViewById(R.id.SRbtnMinus5);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL5R>0){
                    SL5R--;
                    TextView textView = (TextView)findViewById(R.id.SRL5);
                    textView.setText(""+ SL5R);
                }
            }
        });

        Button btn10 =(Button)findViewById(R.id.SRbtnPlus6);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL6R<2){
                    SL6R++;
                    TextView textView = (TextView)findViewById(R.id.SRL6);
                    textView.setText(""+SL6R);
                }
            }
        });

        Button btn11 = (Button)findViewById(R.id.SRbtnMinus6);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL6R>0){
                    SL6R--;
                    TextView textView =(TextView)findViewById(R.id.SRL6);
                    textView.setText(""+SL6R);
                }
            }
        });

        Button btn12 = (Button) findViewById(R.id.SRbtnPlus7);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL7R<2){
                    SL7R++;
                    TextView textView = (TextView)findViewById(R.id.SRL7);
                    textView.setText(""+ SL7R);
                }
            }
        });

        Button btn13 = (Button) findViewById(R.id.SRbtnMinus7);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL7R>0){
                    SL7R--;
                    TextView textView = (TextView) findViewById(R.id.SRL7);
                    textView.setText(""+ SL7R);
                }
            }
        });

        Button btn14 = (Button) findViewById(R.id.SRbtnPlus8);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL8R<1){
                    SL8R++;
                    TextView textView = (TextView) findViewById(R.id.SRL8);
                    textView.setText(""+ SL8R);
                }
            }
        });

        Button btn15 = (Button)findViewById(R.id.SRbtnMinus8);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL8R>0){
                    SL8R--;
                    TextView textView = (TextView) findViewById(R.id.SRL8);
                    textView.setText(""+ SL8R);
                }
            }
        });

        Button btn16 = (Button) findViewById(R.id.SRbtnPlus9);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL9R<1){
                    SL9R++;
                    TextView textView = (TextView)findViewById(R.id.SRL9);
                    textView.setText(""+ SL9R);
                }
            }
        });

        Button btn17 =(Button) findViewById(R.id.SRbtnMinus9);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SL9R>0){
                    SL9R--;
                    TextView textView= (TextView)findViewById(R.id.SRL9);
                    textView.setText(""+ SL9R);
                }
            }
        });

        Button btn18 =(Button)findViewById(R.id.LongRestedbtn);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SL1R = 4;
                SL2R = 3;
                SL3R = 3;
                SL4R = 3;
                SL5R = 3;
                SL6R = 2;
                SL7R = 2;
                SL8R = 1;
                SL9R = 1;
                TextView textView = (TextView) findViewById(R.id.SRL1);
                TextView textView1 = (TextView)findViewById(R.id.SRL2);
                TextView textView2 = (TextView)findViewById(R.id.SRL3);
                TextView textView3 = (TextView) findViewById(R.id.SRL4);
                TextView textView4 = (TextView) findViewById(R.id.SRL5);
                TextView textView5 = (TextView)findViewById(R.id.SRL6);
                TextView textView6 = (TextView)findViewById(R.id.SRL7);
                TextView textView7 = (TextView)findViewById(R.id.SRL8);
                TextView textView8 = (TextView)findViewById(R.id.SRL9);

                textView.setText(""+ SL1R);
                textView1.setText(""+ SL2R);
                textView2.setText(""+ SL3R);
                textView3.setText(""+ SL4R);
                textView4.setText(""+ SL5R);
                textView5.setText(""+ SL6R);
                textView6.setText(""+ SL7R);
                textView7.setText(""+ SL8R);
                textView8.setText(""+ SL9R);
            }
        });







        }

        @Override
        protected void onRestoreInstanceState(Bundle savedIntanceState){
            super.onRestoreInstanceState(savedIntanceState);
            String stateSaved = savedIntanceState.getString("saved_state");
            if(stateSaved == null){
                Toast.makeText(MainActivity.this,"onRestoreInstanceState:\n" + "No State Saved!", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(MainActivity.this, "onRestoreInstanceState:\n" + "Saved State = " +stateSaved, Toast.LENGTH_LONG).show();
            }
        }



    }



