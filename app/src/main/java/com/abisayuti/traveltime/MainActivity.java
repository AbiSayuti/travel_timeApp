package com.abisayuti.traveltime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etspeed, etdistance;
    Button btnHitung;
    TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etdistance = (EditText)findViewById(R.id.etdistance);
        etspeed = (EditText)findViewById(R.id.etspeed);
        btnHitung = (Button) findViewById(R.id.btnhitung);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String njarak = etdistance.getText().toString();
                String nkecepatan = etspeed.getText().toString();

                if(njarak.isEmpty()){
                    etdistance.setError("jarak tidak boleh kosong");

                }else if(nkecepatan.isEmpty()) {
                    etspeed.setError("kecepatan tidak boleh kosong");
                }else{
                    int ajarak = Integer.parseInt(njarak);
                    int acepat = Integer.parseInt(nkecepatan);

                    int hasil = ajarak / acepat;

                    txtHasil.setText("waktu tempuhnya adalah " + hasil  + "jam" );
                }

            }
        });
    }
}
