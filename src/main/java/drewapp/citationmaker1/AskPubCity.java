// This code asks for the city the source was published in, and stores it.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskPubCity extends AskPub {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_pub_city);
        Intent intent8 = getIntent();
    }
    public void Ask_Pub_City(View v) {
        Intent intent9 = new Intent(this, AskPubDate.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String pubcity = ((EditText) findViewById(R.id.editText4)).getText().toString();
        editor.putString("pubcity", pubcity);
        editor.apply();
        startActivity(intent9);
    }
}
