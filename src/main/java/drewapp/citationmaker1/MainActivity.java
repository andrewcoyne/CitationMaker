// This code asks which citation format the user wants to use, and goes to the next activity.
package drewapp.citationmaker1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
// Brings the below code up when the app starts up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // The code below retrieves each "user input string" from SharedPrefernces
        SharedPreferences settings = getSharedPreferences("ttt", 0);
        String title = settings.getString("title", "");
        String author = settings.getString("author", "");
        if (author != ""){

            author = author + ". ";

        }
        String pubcity = settings.getString("pubcity", "");
        if (pubcity != ""){

            pubcity = pubcity + ": ";

        }
        String publisher = settings.getString("publisher", "");
        if (publisher != ""){

            publisher = publisher + ", ";

        }
        String pubdate = settings.getString("pubdate", "");
        if (pubdate != ""){

            pubdate = pubdate + ". ";

        }
        String printidentifier = settings.getString("printidentifier", "");
        if (printidentifier != ""){

            printidentifier = printidentifier + " ";

        }
        String webtitle = settings.getString("webtitle", "");
        if (webtitle != ""){

            webtitle = webtitle + ". ";

        }
        String webidentifier = settings.getString("webidentifier", "");
        if (webidentifier != ""){

            webidentifier = webidentifier + " ";

        }
        String accessdate = settings.getString("accessdate", "");
        if (accessdate != ""){

            accessdate = accessdate + ". ";

        }
        String url = settings.getString("url", "");
        Boolean print = settings.getBoolean("print", false);

        // The code below decides whether the citation is print or web, and sets up the citation accordingly
        if (print) {
            if (title != ""){

                title = title + ". ";


            }

            SpannableString title1 = new SpannableString(title);
            title1.setSpan (new StyleSpan(Typeface.ITALIC), 0, title.length(), 0);



            SpannableString citation = new SpannableString(author + title1 + pubcity + publisher + pubdate + printidentifier);


            TextView textView13 = (TextView) findViewById(R.id.textView13);


            textView13.setText(citation);


        }else if (!print){
            if (title != ""){

                title = "\"" + title + "." + "\"";

            }
            String spacesaver = webidentifier + accessdate + url;
            SpannableString webtitle1 = new SpannableString(webtitle);
            webtitle1.setSpan (new StyleSpan(Typeface.ITALIC), 0, webtitle.length(), 0);
            SpannableString citation = new SpannableString(author + title + webtitle1 + publisher + pubdate + spacesaver);
            TextView textView13 = (TextView) findViewById(R.id.textView13);

            textView13.setText(citation);
        }

    }
    /* No matter which one is clicked, the previous citation's data is deleted
       and the app transitions to the next activity.
    */

    public void APA(View v) {
        Intent intent20 = new Intent(this, NotYetImplemented.class);
        String citationFormatType = "APA";
        startActivity(intent20);

        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();

        String printidentifier = "";
        editor.putString("printidentifier", printidentifier);

        String webidentifier = "";
        editor.putString("webidentifier", webidentifier);

        String url = "";
        editor.putString("url", url);

        String webtitle = "";
        editor.putString("webtitle", webtitle);

        String annotation = "";
        editor.putString("annotation", annotation);

        String title = "";
        editor.putString("title", title);

        String author = "";
        editor.putString("author", author);

        String pubcity = "";
        editor.putString("pubcity", pubcity);

        String publisher = "";
        editor.putString("publisher", publisher);

        String pubdate = "";
        editor.putString("publisher", pubdate);

        String accessdate = "";
        editor.putString("accessdate", accessdate);

        editor.apply();
    }
    public void MLA(View v) {
        Intent intent2 = new Intent(this, AskTitle.class);
        String citationFormatType = "MLA";
        startActivity(intent2);

        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();

        String printidentifier = "";
        editor.putString("printidentifier", printidentifier);

        String webidentifier = "";
        editor.putString("webidentifier", webidentifier);

        String url = "";
        editor.putString("url", url);

        String webtitle = "";
        editor.putString("webtitle", webtitle);

        String annotation = "";
        editor.putString("annotation", annotation);

        String title = "";
        editor.putString("title", title);

        String author = "";
        editor.putString("author", author);

        String pubcity = "";
        editor.putString("pubcity", pubcity);

        String publisher = "";
        editor.putString("publisher", publisher);

        String pubdate = "";
        editor.putString("publisher", pubdate);

        String accessdate = "";
        editor.putString("accessdate", accessdate);

        editor.apply();
    }
    public void Chicago(View v){
        Intent intent20 = new Intent(this, NotYetImplemented.class);
        String citationFormatType = "Chicago";
        startActivity(intent20);

        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();

        String printidentifier = "";
        editor.putString("printidentifier", printidentifier);

        String webidentifier = "";
        editor.putString("webidentifier", webidentifier);

        String url = "";
        editor.putString("url", url);

        String webtitle = "";
        editor.putString("webtitle", webtitle);

        String annotation = "";
        editor.putString("annotation", annotation);

        String title = "";
        editor.putString("title", title);

        String author = "";
        editor.putString("author", author);

        String pubcity = "";
        editor.putString("pubcity", pubcity);

        String publisher = "";
        editor.putString("publisher", publisher);

        String pubdate = "";
        editor.putString("publisher", pubdate);

        String accessdate = "";
        editor.putString("accessdate", accessdate);

        editor.apply();
    }
    public void Turabian(View v){
        Intent intent20 = new Intent(this, NotYetImplemented.class);
        String citationFormatType = "Turabian";
        startActivity(intent20);

        SharedPreferences sp = getSharedPreferences("ttt", 0);
        SharedPreferences.Editor editor = sp.edit();

        String printidentifier = "";
        editor.putString("printidentifier", printidentifier);

        String webidentifier = "";
        editor.putString("webidentifier", webidentifier);

        String url = "";
        editor.putString("url", url);

        String webtitle = "";
        editor.putString("webtitle", webtitle);

        String annotation = "";
        editor.putString("annotation", annotation);

        String title = "";
        editor.putString("title", title);

        String author = "";
        editor.putString("author", author);

        String pubcity = "";
        editor.putString("pubcity", pubcity);

        String publisher = "";
        editor.putString("publisher", publisher);

        String pubdate = "";
        editor.putString("publisher", pubdate);

        String accessdate = "";
        editor.putString("accessdate", accessdate);

        editor.apply();
    }
}
