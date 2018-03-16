// This code asks for the title of the user's source and stores it.
package drewapp.citationmaker1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.EditText;


import java.io.File;
import java.io.FileOutputStream;

import static android.R.id.edit;
import static android.R.id.inputExtractEditText;
import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static drewapp.citationmaker1.R.id.editText99;


public class AskTitle extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_title);
        Intent intent = getIntent();

    }

    public void Ask_Title(View v) {
        Intent intent6 = new Intent(this, AskAuthor.class);

        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();
        String title = ((EditText) findViewById(R.id.editText99)).getText().toString();
        editor.putString("title", title);
        editor.apply();

        startActivity(intent6);

    }

}
