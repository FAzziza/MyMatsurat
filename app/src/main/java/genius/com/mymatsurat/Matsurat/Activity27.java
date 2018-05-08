package genius.com.mymatsurat.Matsurat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import genius.com.mymatsurat.R;

public class Activity27 extends AppCompatActivity {

    private Button btnNext;
    private Integer i = 6;
    private String value = Integer.toString(i);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_27);
    }
}
