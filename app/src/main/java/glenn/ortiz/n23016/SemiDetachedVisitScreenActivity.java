package glenn.ortiz.n23016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
//Name: Glenn Ortiz
//Student Number: N01523016
//Class: CENG-0NA
public class SemiDetachedVisitScreenActivity extends MenuCode {
    private Button paymentButton;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.semidetachedvisitscreen_activity);

        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.semiDetached1);
        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.semiDetached2);
        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.semiDetached3);

        paymentButton = (Button) findViewById(R.id.PaymentButton);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxOne.isChecked() || checkBoxTwo.isChecked() || checkBoxThree.isChecked()) {
                    openPaymentActivity();
                } else {
                    Toast.makeText(SemiDetachedVisitScreenActivity.this, R.string.HousingCheckboxToast, Toast.LENGTH_LONG).show();

                }
            }


        });
    }
    private void openPaymentActivity(){
        Intent rentbutton = new Intent(this, PaymentActivity.class);
        startActivity(rentbutton);
    }
}
