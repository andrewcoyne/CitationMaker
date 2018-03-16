// This code asks for the author of the user's source, and saves that input.
package drewapp.citationmaker1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskAuthor extends AskTitle {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_author);
        Intent intent6 = getIntent();
    }
    public void Ask_Author(View v) {
        Intent intent7 = new Intent(this, AskPub.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String author = ((EditText) findViewById(R.id.editText2)).getText().toString();
        editor.putString("author", author);
        editor.apply();
        startActivity(intent7);
    }
}
