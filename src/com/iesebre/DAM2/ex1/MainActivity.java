package com.iesebre.DAM2.ex1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	boolean boto1 = false;
	boolean boto2 = false;
	boolean boto3 = false;
	boolean boto4 = false;
	boolean boto5 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        final Button btnBoton1 = (Button)findViewById(R.id.BtnBoton1);
        final Button btnBoton2 = (Button)findViewById(R.id.BtnBoton2);
        final ImageButton btnBoton3 = (ImageButton)findViewById(R.id.BtnBoton3);
        final Button btnBoton4 = (Button)findViewById(R.id.BtnBoton4);
        final Button btnBoton5 = (Button)findViewById(R.id.BtnBoton5);
        
        btnBoton1.setOnClickListener(new View.OnClickListener() {
        	
        
        public void onClick(View arg0)
        {
        	if(boto1){
        	boto1 = false;
        	}
        	else
        		boto1 = true;
        	TextView resultat = (TextView)findViewById(R.id.resultat);
        	if(boto1==true){
        	resultat.setText("Botón 1 pulsado!");
        }
        	else
        		resultat.setText("");
        	
        }
        });
        
        btnBoton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
            	if(boto2){
            	boto2 = false;
            	}
            	else
            		boto2 = true;
            	TextView resultat = (TextView)findViewById(R.id.resultat);
            	if(boto2==true){
            	resultat.setText("Botón 2 pulsado!");
            }
            	else
            		resultat.setText("");
            	
            }
            });
        
        btnBoton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
            	if(boto3){
            	boto3 = false;
            	}
            	else
            		boto3 = true;
            	TextView resultat = (TextView)findViewById(R.id.resultat);
            	if(boto3==true){
            	resultat.setText("Botón 3 pulsado!");
            }
            	else
            		resultat.setText("");
            	
            }
            });
        
        btnBoton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
            	if(boto4){
            	boto4 = false;
            	}
            	else
            		boto4 = true;
            	TextView resultat = (TextView)findViewById(R.id.resultat);
            	if(boto4==true){
            	resultat.setText("Botón 4 pulsado!");
            }
            	else
            		resultat.setText("");
            	
            }
            });
        
        btnBoton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
            	if(boto5){
            	boto5 = false;
            	}
            	else
            		boto5 = true;
            	TextView resultat = (TextView)findViewById(R.id.resultat);
            	if(boto5==true){
            	resultat.setText("Botón 5 pulsado!");
            }
            	else
            		resultat.setText("");
            	
            }
            });
        
        	
        	
        }
        
        

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
