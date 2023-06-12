package glenn.ortiz.n23016;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

//Name: Glenn Ortiz
//Student Number: N01523016
//Class: CENG-0NA
public class GlennActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glenn_activity);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(getApplicationContext(),OrtizActivity.class);
                startActivity(splash);
                finish();
            }

        },3000);
            
        
    }
}