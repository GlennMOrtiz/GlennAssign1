package glenn.ortiz.n23016;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

public class RentActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_activity);

        //RadioGroup
        radioGroup = findViewById(R.id.ortizradiogrouprent);
        imageButton = findViewById(R.id.ortizmoneybutton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioVar = radioGroup.getCheckedRadioButtonId();
                //Switch statement for radio buttons, default for validation
                if (radioVar == R.id.apartmentButton) {
                    openApartmentVisitScreen();
                } else if (radioVar == R.id.detachedHomeButton) {
                    openDetachedVisitScreen();
                } else if (radioVar == R.id.semidetachedHomeButton) {
                    //openSemiDetachedVisitScreen();
                }else {
                    Toast.makeText(RentActivity.this, R.string.rentValidation, Toast.LENGTH_LONG).show();
                }

            }
        });
    }


    //Method to open apartmentVisitScreen
    private void openApartmentVisitScreen(){
        Intent enterVisit = new Intent(this, ApartmentVisitScreenActivity.class);
        startActivity(enterVisit);
    }
    private void openDetachedVisitScreen(){
        Intent enterVisit = new Intent(this, DetachedVisitScreenActivity.class);
        startActivity(enterVisit);
    }
    private void openSemiDetachedVisitScreen(){
        Intent enterVisit = new Intent(this, SemiDetachedVisitScreenActivity.class);
        startActivity(enterVisit);
    }

}
