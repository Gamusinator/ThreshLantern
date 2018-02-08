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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton boto;
    CoordinatorLayout principal;
    boolean sk1,sk2,sk3,sk4,sk5,sk6, flash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Publicidad!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //Publicidad!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        sk1=true;
        sk2=false;
        sk3=false;
        sk4=false;
        sk5=false;
        sk6=false;
        flash=false;

        //Inicialitzacions
        boto = findViewById(R.id.imageButton);
        principal = findViewById(R.id.mainlayout);


        //Iniciem amb fons negre i botó apagat
        principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
        boto.setImageResource(R.mipmap.sk0);


        boto = findViewById(R.id.imageButton);
        boto.setOnClickListener(this);

        //botó de compartir
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
        //canviem el boleà segons si tenim el flash engegat o apagat
        if (flash){
            flash = false;
        }else {
            flash = true;
        }
        //switch per posar diferents skins
        if (sk1) {
            //al encendre la llum posem el gradient
            if (!flash){
                boto.setImageResource(R.mipmap.sk0);
                principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
            }else{
                boto.setImageResource(R.mipmap.sk1);
                principal.setBackgroundResource(R.drawable.skin1_gradient_selector);
            }
            //encenem el flash
                    /*codi per encendre flash*/
        }else if (sk2){
            //al encendre la llum posem el gradient
            if (!flash){
                boto.setImageResource(R.mipmap.sk0);
                principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
            }else{
                boto.setImageResource(R.mipmap.sk2);
                principal.setBackgroundResource(R.drawable.skin2_gradient_selector);
            }
            //encenem el flash
                    /*codi per encendre flash*/
        }else if (sk3){
            //al encendre la llum posem el gradient
            if (!flash){
                boto.setImageResource(R.mipmap.sk0);
                principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
            }else{
                boto.setImageResource(R.mipmap.sk3);
                principal.setBackgroundResource(R.drawable.skin3_gradient_selector);
            }
            //encenem el flash
                    /*codi per encendre flash*/
        }else if (sk4){
            Toast.makeText(this, "Skin444", Toast.LENGTH_SHORT).show();
        }else if (sk5){
            Toast.makeText(this, "Skin555", Toast.LENGTH_SHORT).show();
        }else if (sk6){
            Toast.makeText(this, "Skin666", Toast.LENGTH_SHORT).show();
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

        switch (id){
            case R.id.action_skin1:
                sk1=true;
                sk2=false;
                sk3=false;
                sk4=false;
                sk5=false;
                sk6=false;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk1);
                    principal.setBackgroundResource(R.drawable.skin1_gradient_selector);
                }
                break;
            case R.id.action_skin2:
                sk2=true;
                sk1=false;
                sk3=false;
                sk4=false;
                sk5=false;
                sk6=false;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk2);
                    principal.setBackgroundResource(R.drawable.skin2_gradient_selector);
                }
                break;
            case R.id.action_skin3:
                sk3=true;
                sk1=false;
                sk2=false;
                sk4=false;
                sk5=false;
                sk6=false;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk3);
                    principal.setBackgroundResource(R.drawable.skin3_gradient_selector);
                }
                break;
            case R.id.action_skin4:
                Toast.makeText(this, "Skin4", Toast.LENGTH_SHORT).show();
                sk4=true;
                sk1=false;
                sk2=false;
                sk3=false;
                sk5=false;
                sk6=false;
                break;
            case R.id.action_skin5:
                Toast.makeText(this, "Skin5", Toast.LENGTH_SHORT).show();
                sk5=true;
                sk1=false;
                sk2=false;
                sk3=false;
                sk4=false;
                sk6=false;
                break;
            case R.id.action_skin6:
                Toast.makeText(this, "Skin6", Toast.LENGTH_SHORT).show();
                sk6=true;
                sk1=false;
                sk2=false;
                sk3=false;
                sk4=false;
                sk5=false;
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
