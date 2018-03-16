// This code asks the user's source is a book or website, and uses that information to create the citation in the later activity.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskIfWebsite extends AskAnnotation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_if_website);
        Intent intent12 = getIntent();
    }
    public void Is_Website(View v) {
        Intent intent13 = new Intent(this, AskURL.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String webidentifier = "Web.";
        editor.putString("webidentifier", webidentifier);
        Boolean print = false;
        editor.putBoolean("print", print);
        editor.apply();
        startActivity(intent13);
    }
    public void Is_Not_Website(View v) {
        Intent intent14 = new Intent(this, FinalCitation.class);
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String printidentifier = "Print.";
        editor.putString("printidentifier", printidentifier);
        Boolean print = true;
        editor.putBoolean("print", print);
        editor.apply();
        startActivity(intent14);
    }
}
