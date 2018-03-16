//This code, and activity, isn't used. I had trouble implementing it, so I didn't.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskAnnotation extends AskAccessDate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_annotation);
        Intent intent11 = getIntent();
        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String annotation = ((EditText) findViewById(R.id.editText7)).getText().toString();
        editor.putString("annotation", annotation);
        editor.apply();
    }
    public void Ask_Annotation(View v) {
        Intent intent12 = new Intent(this, AskIfWebsite.class);

        startActivity(intent12);
    }
}
