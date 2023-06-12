package glenn.ortiz.n23016;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OrtizActivity extends AppCompatActivity {
    private Button enterbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ortiz_activity);

        //Enter Button
        enterbutton = (Button) findViewById(R.id.ortizbutton);
        enterbutton.setOnClickListener(v -> openRentActivity());
    }
    //Enter Button Method
    private void openRentActivity(){
        Intent rentbutton = new Intent(this, RentActivity.class);
        startActivity(rentbutton);
    }
}
