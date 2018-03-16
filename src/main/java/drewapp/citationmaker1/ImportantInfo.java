// This code displays the "limitations" of CitationMaker.
package drewapp.citationmaker1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImportantInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_info);
        Intent importantInfo = getIntent();
    }
}
