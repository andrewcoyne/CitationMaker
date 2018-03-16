// This code asks for the title of the website which contains the user's source, and stores it.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskWebsiteTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_website_title);
        Intent intent15 = getIntent();
    }
    public void Ask_Web_Title(View v) {
        Intent intent16 = new Intent(this, FinalCitation.class);

        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String webtitle = ((EditText) findViewById(R.id.editText9)).getText().toString();
        editor.putString("webtitle", webtitle);
        editor.apply();

        startActivity(intent16);
    }
}
