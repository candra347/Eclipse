package com.example.quizmb_190;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Identifikasi Tipe Data
    EditText txtTinggi, txtKelamin, txtBerat;
    TextView txtHasil, txtHBI, txtHS;
    int Tinggi, Berat, BBILaki, BBIPerempuan, SelisihL, SelisihP;
    int Kelamin;
	String Laki, Perempuan;
    
    public void Hasil (View v)
    {
//    	Penkonversian
    	txtTinggi=(EditText) findViewById(R.id.txtTinggi);
    	txtKelamin=(EditText) findViewById(R.id.txtKelamin);
    	txtBerat=(EditText) findViewById(R.id.txtBerat);
    	txtHasil=(TextView) findViewById(R.id.txtHasil);
    	txtHBI=(TextView) findViewById(R.id.txtHBI);
    	txtHS=(TextView) findViewById(R.id.txtHS);
    	
//    	Tinggi
    	Tinggi=Integer.parseInt(txtTinggi.getText().toString());
    	
//    	Berat
    	Berat=Integer.parseInt(txtBerat.getText().toString());
    	txtHasil.setText("Berat Badan Sekarang Adalah ="+Berat);
    	
//    	Rumus Berat Badan Ideal
    	BBILaki=(Tinggi-100)*90/100;
    	BBIPerempuan=(Tinggi-100)*80/100;
    	
//    	Jenis Kelamin
    	Kelamin=Integer.parseInt(txtKelamin.getText().toString());
//    	Inputkan angka 1 untuk memilih kelamin laki
    	if(Kelamin == 1)
    		{
        		if(Berat==BBILaki)
        		{
        			txtHBI.setText("Status Anda Ideal");
        		}
        		else if(Berat<BBILaki)
        		{
        			txtHBI.setText("Status Anda Kurus");
        		}
        		else if(Berat>BBILaki)
        		{
        			txtHBI.setText("Status Anda Gemuk1");
        		}
        		else
        		{
        			txtHBI.setText("Status Error");
        		}
//        		Rumus Selisih
        		SelisihL=Berat-BBILaki;
        		txtHS.setText("Selisih saya adalah ="+SelisihL);
        	}
//    	Inputkan angka 2 untuk memilih kelamin Perempuan
        	else if(Kelamin == 2)
        	{
        		if(Berat==BBIPerempuan)
        		{
        			txtHBI.setText("Status Anda Ideal");
        		}
        		else if(Berat<BBIPerempuan)
        		{
        			txtHBI.setText("Status Anda Kurus");
        		}
        		else if(Berat>BBIPerempuan)
        		{
        			txtHBI.setText("Status Anda Gemuk2");
        		}
        		else
        		{
        			txtHBI.setText("Status Error");
        		}
//        		Rumus Selisih
        		SelisihP=Berat-BBIPerempuan;
        		txtHS.setText("Selisih saya adalah ="+SelisihP);
        	}
        	else
        	{
        		txtHasil.setText("Inputan anda salah");
        	}
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
