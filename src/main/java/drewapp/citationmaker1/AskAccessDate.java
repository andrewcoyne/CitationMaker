// This code displays the activity that asks for the date the user accessed the source, and saves
// the user's input.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskAccessDate extends AskPubDate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_access_date);

    }
    public void Ask_Access_Date(View v) {
        Intent intent12 = new Intent(this, AskIfWebsite.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String accessdate = ((EditText) findViewById(R.id.editText6)).getText().toString();
        editor.putString("accessdate", accessdate);
        startActivity(intent12);
    }
}
