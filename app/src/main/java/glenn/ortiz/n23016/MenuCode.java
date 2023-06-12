package glenn.ortiz.n23016;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
//Glenn Ortiz
//N01523016
//CENG258-0NA
public class MenuCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    //Menu Code Start
    //Makes Menu in Action Bar
    public boolean onCreateOptionsMenu(android.view.Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    //Allows clicking of menu item to do stuffs
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        String url = "https://developer.android.com/studio/intro";
        //Menucodes
        if (id == R.id.help) {
            Intent urlOpen = new Intent(Intent.ACTION_VIEW);
            urlOpen.setData(Uri.parse(url));
            startActivity(urlOpen);
            return true;
        } else if (id == R.id.Rent) {
            Intent phoneOpen = new Intent(Intent.ACTION_DIAL);
            phoneOpen.setData(Uri.parse(getString(R.string.phone)));
            startActivity(phoneOpen);
            return true;
        } else if (id == R.id.Home) {
            Intent goBack = new Intent(this, OrtizActivity.class);
            startActivity(goBack);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}