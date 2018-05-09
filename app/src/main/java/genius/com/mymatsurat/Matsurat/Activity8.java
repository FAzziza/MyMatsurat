package genius.com.mymatsurat.Matsurat;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import genius.com.mymatsurat.ActivityMenu;
import genius.com.mymatsurat.R;

import static genius.com.mymatsurat.ActivityMenu.Kapan;

public class Activity8 extends AppCompatActivity {

    private Button btnNext;
    private Integer i = 3;
    private String value = Integer.toString(i);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        btnNext = (Button) findViewById(R.id.button8);
        btnNext.setTextColor(Color.WHITE);
        btnNext.setText("Baca "+ value +"X" );
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value;

                if(i > 1){
                    i = i - 1;

                    value = String.valueOf(i);
                    btnNext.setText("Baca "+ value +"X");

                } else {
                    lanjut();
                }
            }
        });
    }
    private void lanjut(){
        String pagi = "Pagi";
        String sore = "Sore";

        if(Kapan == pagi){
            Intent u = new Intent(Activity8.this, Activity9Pagi.class);
            startActivity(u);
        }else if (Kapan == sore){
            Intent p = new Intent(Activity8.this, ActivityMenu.class);
            startActivity(p);
        }else{
            Toast.makeText(Activity8.this, "Cek lagi", Toast.LENGTH_SHORT).show();
        }

    }

}
