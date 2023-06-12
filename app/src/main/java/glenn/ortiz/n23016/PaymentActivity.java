package glenn.ortiz.n23016;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
//Glenn Ortiz
//N01523016
//CENG 258 0NA
public class PaymentActivity extends AppCompatActivity{
    ImageButton imageButton;
    EditText ccName;
    EditText ccNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_activity);
        //for Credit Card Info
        ccName = (EditText) findViewById(R.id.editTextCCName);
        ccNumber = (EditText) findViewById(R.id.editTextCCNumber);

        //Submit Click
        imageButton = findViewById(R.id.ortizmoneybutton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ccName.length() < 3 ) {
                    ccName.setError(getString(R.string.ccNameErrorTxt));
                }
                if (ccNumber.length() != 16 ) {
                    ccNumber.setError(getString(R.string.ccNumberErrorText));
                }
                if (ccName.length() > 3 && ccNumber.length() == 16) {
                    Toast.makeText(PaymentActivity.this, R.string.succesPaymentTxt, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
