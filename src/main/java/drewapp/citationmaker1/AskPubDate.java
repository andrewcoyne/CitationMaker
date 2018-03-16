// This code asks for the user's source's date of publication and stores it.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskPubDate extends AskPubCity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_pub_date);
        Intent intent9 = getIntent();
    }
    public void Ask_Pub_Date(View v) {
        Intent intent10 = new Intent(this, AskAccessDate.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String pubdate = ((EditText) findViewById(R.id.editText5)).getText().toString();
        editor.putString("pubdate", pubdate);
        editor.apply();
        startActivity(intent10);
    }
}
