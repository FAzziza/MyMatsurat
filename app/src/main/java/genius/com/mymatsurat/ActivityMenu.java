package genius.com.mymatsurat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import genius.com.mymatsurat.Matsurat.Activity1;

import static android.widget.Toast.LENGTH_SHORT;

public class ActivityMenu extends AppCompatActivity {

    private Button btnSore, btnPagi;
    public static String Kapan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarMenu);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        btnPagi = (Button) findViewById(R.id.buttonPagi);
        btnSore = (Button) findViewById(R.id.buttonSore);

        btnPagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kapan = "Pagi";
                Intent i = new Intent(ActivityMenu.this, Activity1.class);
                startActivity(i);
            }
        });

        btnSore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kapan = "Sore";
                Intent o = new Intent(ActivityMenu.this, Activity1.class);
                startActivity(o);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actionAbout:
                    aboutDialog();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void aboutDialog(){
        AboutDialog aboutDialog = new AboutDialog();
        aboutDialog.show(getSupportFragmentManager(), "About");
    }
}


