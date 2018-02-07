package gmustudios.threshlantern;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton boto;
    CoordinatorLayout principal;
    boolean sk1,sk2,sk3,sk4,sk5,sk6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Inicialitzacions
        boto = findViewById(R.id.imageButton);
        principal = findViewById(R.id.mainlayout);


        //Iniciem amb skin1 (s'ha d'iniciar amb un fons negre
        //principal.setBackgroundResource(R.drawable.skin1_gradient_selector);

        boto = findViewById(R.id.imageButton);
        boto.setOnClickListener(this);

        FloatingActionButton share = (FloatingActionButton) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public void onClick(View view) {
        //switch per posar diferents skins
        if (sk1) {
            //al encendre la llum posem el gradient
            principal.setBackgroundResource(R.drawable.skin1_gradient_selector);
            //encenem el flash
                    /*codi per encendre flash*/
        }else if (sk2){
        }else if (sk3){
            //al encendre la llum posem el gradient
            principal.setBackgroundResource(R.drawable.skin3_gradient_selector);
            //encenem el flash
                    /*codi per encendre flash*/
        }else if (sk4){
        }else if (sk5){
        }else if (sk6){
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_skin1) {
            Toast.makeText(this, "Skin1", Toast.LENGTH_SHORT).show();
            sk1=true;
            sk2=false;
            sk3=false;
            sk4=false;
            sk5=false;
            sk6=false;
            return true;
        }else if (id == R.id.action_skin2){
            Toast.makeText(this, "Skin2", Toast.LENGTH_SHORT).show();
            sk2=true;
            sk1=false;
            sk3=false;
            sk4=false;
            sk5=false;
            sk6=false;
            return true;
        }else if (id == R.id.action_skin3){
            Toast.makeText(this, "Skin3", Toast.LENGTH_SHORT).show();
            sk3=true;
            sk1=false;
            sk2=false;
            sk4=false;
            sk5=false;
            sk6=false;
            return true;
        }else if (id == R.id.action_skin4){
            Toast.makeText(this, "Skin4", Toast.LENGTH_SHORT).show();
            sk4=true;
            sk1=false;
            sk2=false;
            sk3=false;
            sk5=false;
            sk6=false;
            return true;
        }else if (id == R.id.action_skin5){
            Toast.makeText(this, "Skin5", Toast.LENGTH_SHORT).show();
            sk5=true;
            sk1=false;
            sk2=false;
            sk3=false;
            sk4=false;
            sk6=false;
            return true;
        }else if (id == R.id.action_skin6){
            Toast.makeText(this, "Skin6", Toast.LENGTH_SHORT).show();
            sk6=true;
            sk1=false;
            sk2=false;
            sk3=false;
            sk4=false;
            sk5=false;
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
