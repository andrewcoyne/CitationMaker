// This code asks for the publisher of the user's source, and stores it.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskPub extends AskAuthor {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_pub);
        Intent intent7 = getIntent();
    }
    public void Ask_Pub(View v) {
        Intent intent8 = new Intent(this, AskPubCity.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String publisher = ((EditText) findViewById(R.id.editText3)).getText().toString();
        editor.putString("publisher", publisher);
        editor.apply();
        startActivity(intent8);
    }
}
