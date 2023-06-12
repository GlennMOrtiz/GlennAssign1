package glenn.ortiz.n23016;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ApartmentVisitScreenActivity extends AppCompatActivity {
    private Button paymentButton;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.apartmentvisitscreen_activity);

        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.Apartment1);
        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.Apartment2);
        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.Apartment3);

        paymentButton = (Button) findViewById(R.id.PaymentButton);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxOne.isChecked()||checkBoxTwo.isChecked()||checkBoxThree.isChecked()){
                    openPaymentActivity();
                } else {
                    Toast.makeText(ApartmentVisitScreenActivity.this, R.string.HousingCheckboxToast,Toast.LENGTH_LONG).show();

                }
            }


        });
     }
    private void openPaymentActivity(){
        Intent rentbutton = new Intent(this, PaymentActivity.class);
        startActivity(rentbutton);
    }
}
