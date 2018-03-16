// This code creates the citation and displays it. I'm having trouble displaying the title and webtitle in italics.
package drewapp.citationmaker1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.text.SpannableString;

import android.text.style.StyleSpan;
import android.view.View;

import android.widget.TextView;




public class FinalCitation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_citation);
        Intent intent14 = getIntent();

        // The code below retrieves each "user input string" from SharedPreferences
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
            if (title != "" && !title.substring(title.length()-1).equals(".")){

                title = title + ". ";
                title = translate(title);

            }

            SpannableString title1 = new SpannableString(title);
            //title1.setSpan (new StyleSpan(Typeface.ITALIC), 0, title.length(), 0);
            title1.setSpan(new StyleSpan(Typeface.ITALIC), 0, title1.length(), 0);


            //String citation = author + title1 + pubcity + publisher + pubdate + printidentifier;


            TextView textView12 = (TextView) findViewById(R.id.textView12);


            textView12.setText(author + title1 + pubcity + publisher + pubdate + printidentifier);


        }else if (!print){
            if (title != ""){

                title = "\"" + title + "." + "\"";

            }
            String spacesaver = webidentifier + accessdate + url;
            SpannableString webtitle1 = new SpannableString(webtitle);
            webtitle1.setSpan (new StyleSpan(Typeface.ITALIC), 0, webtitle.length(), 0);
            SpannableString citation = new SpannableString(author + title + webtitle1 + publisher + pubdate + spacesaver);
            TextView textView12 = (TextView) findViewById(R.id.textView12);

            textView12.setText(citation);
        }


    }

    public void returnToStart (View v){
        Intent intentfinal = new Intent(this, MainActivity.class);
        startActivity(intentfinal);
    }

    public void importantInfo (View v){
        Intent importantInfo = new Intent(this, ImportantInfo.class);
        startActivity(importantInfo);
    }

    public String translate(String title){
        String title1 = "";
        for(int i = 0; i < title.length(); i++){
            switch(title.substring(i, i+1)){
                case "A": title1+="\uD835\uDE08"; break;
                case "B": title1+="\uD835\uDE09"; break;
                case "C": title1+="\uD835\uDE0A"; break;
                case "D": title1+="\uD835\uDE0B"; break;
                case "E": title1+="\uD835\uDE0C"; break;
                case "F": title1+="\uD835\uDE0D"; break;
                case "G": title1+="\uD835\uDE0E"; break;
                case "H": title1+="\uD835\uDE0F"; break;
                case "I": title1+="\uD835\uDE10"; break;
                case "J": title1+="\uD611"; break;
                case "K": title1+="\uD612"; break;
                case "L": title1+="\uD613"; break;
                case "M": title1+="\uD614"; break;
                case "N": title1+="\uD615"; break;
                case "O": title1+="\uD616"; break;
                case "P": title1+="\uD617"; break;
                case "Q": title1+="\uD618"; break;
                case "R": title1+="\uD619"; break;
                case "S": title1+="\uD61A"; break;
                case "T": title1+="\uD61B"; break;
                case "U": title1+="\uD61C"; break;
                case "V": title1+="\uD61D"; break;
                case "W": title1+="\uD61E"; break;
                case "X": title1+="\uD61F"; break;
                case "Y": title1+="\uD620"; break;
                case "Z": title1+="\uD621"; break;
                case "a": title1+="\uD622"; break;
                case "b": title1+="\uD623"; break;
                case "c": title1+="\uD624"; break;
                case "d": title1+="\uD625"; break;
                case "e": title1+="\uD626"; break;
                case "f": title1+="\uD627"; break;
                case "g": title1+="\uD628"; break;
                case "h": title1+="\uD629"; break;
                case "i": title1+="\uD62A"; break;
                case "j": title1+="\uD62B"; break;
                case "k": title1+="\uD62C"; break;
                case "l": title1+="\uD62D"; break;
                case "m": title1+="\uD62E"; break;
                case "n": title1+="\uD62F"; break;
                case "o": title1+="\uD630"; break;
                case "p": title1+="\uD631"; break;
                case "q": title1+="\uD632"; break;
                case "r": title1+="\uD633"; break;
                case "s": title1+="\uD634"; break;
                case "t": title1+="\uD635"; break;
                case "u": title1+="\uD636"; break;
                case "v": title1+="\uD637"; break;
                case "w": title1+="\uD638"; break;
                case "x": title1+="\uD639"; break;
                case "y": title1+="\uD63A"; break;
                case "z": title1+="\uD63B"; break;
                default: title1+=title.substring(i, i+1);
            }
        }
        return title1;
    }
}
