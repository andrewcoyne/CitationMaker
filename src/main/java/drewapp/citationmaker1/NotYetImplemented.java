// Currently, this app only supports MLA, so the app redirects anyone who clicks on APA, Chicago, or Turabian
// to this activity.
package drewapp.citationmaker1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NotYetImplemented extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_yet_implemented);
        Intent intent20 = getIntent();
    }
}
