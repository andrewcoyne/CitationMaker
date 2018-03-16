// This code asks for the URL of the user's source and stores it.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskURL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_url);
        Intent intent13 = getIntent();
    }
    public void Ask_URL(View v) {
        Intent intent15 = new Intent(this, AskWebsiteTitle.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String url = ((EditText) findViewById(R.id.editText8)).getText().toString();
        editor.putString("url", url);
        editor.apply();
        startActivity(intent15);
    }
}
