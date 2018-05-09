package genius.com.mymatsurat.Matsurat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import genius.com.mymatsurat.R;

public class Activity1 extends AppCompatActivity {

    private Button btnNext;
    private Integer i = 1;
    private String value = Integer.toString(i);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = (Button) findViewById(R.id.button);
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
                    Intent intent = new Intent(Activity1.this, Activity2.class);
                    startActivity(intent);
                }
            }
        });

    }
}
