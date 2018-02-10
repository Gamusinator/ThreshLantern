package gmustudios.threshlantern;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton boto;
    CoordinatorLayout principal;
    boolean flash;
    int seleccionat;
    static Camera camera;
    Camera.Parameters parameters;


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

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA,}, 1000);
        }

        flash=false;
        seleccionat = 1;

        //Inicialitzacions
        boto = findViewById(R.id.imageButton);
        principal = findViewById(R.id.mainlayout);
        boto.setOnClickListener(this);

        //Iniciem amb fons negre i botó apagat
        principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
        boto.setImageResource(R.mipmap.sk0_1);



        //botó de compartir
        FloatingActionButton share = (FloatingActionButton) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CompartirAPP();
            }
        });
    }
    @Override
    public void onClick(View view) {
        //canviem el boleà segons si tenim el flash engegat o apagat
        if (flash){
            flash = false;
            processOffClick();
        }else {
            flash = true;
            processOnClick();
        }
        //switch per posar diferents skins
        switch (seleccionat){
            case 1:
                //al encendre la llum posem el gradient
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_1);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk1);
                    principal.setBackgroundResource(R.drawable.skin1_gradient_selector);
                }
                break;
            case 2:
                //al encendre la llum posem el gradient
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_2);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk2);
                    principal.setBackgroundResource(R.drawable.skin2_gradient_selector);
                }
                break;
            case 3:
                //al encendre la llum posem el gradient
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_3);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk3);
                    principal.setBackgroundResource(R.drawable.skin3_gradient_selector);
                }
                        break;
            case 4:
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_4);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk4);
                    principal.setBackgroundResource(R.drawable.skin4_gradient_selector);
                }
                break;
            case 5:
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_5);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk5);
                    principal.setBackgroundResource(R.drawable.skin5_gradient_selector);
                }
                break;
            case 6:
                //al encendre la llum posem el gradient
                boto.setImageResource(R.mipmap.sk6);
                if (!flash){
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    principal.setBackgroundResource(R.drawable.skin6_gradient_selector);
                }
                break;
            default:
                break;
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
                seleccionat = 1;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_1);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk1);
                    principal.setBackgroundResource(R.drawable.skin1_gradient_selector);
                }
                break;
            case R.id.action_skin2:
                seleccionat = 2;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_2);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk2);
                    principal.setBackgroundResource(R.drawable.skin2_gradient_selector);
                }
                break;
            case R.id.action_skin3:
                seleccionat = 3;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_3);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk3);
                    principal.setBackgroundResource(R.drawable.skin3_gradient_selector);
                }
                break;
            case R.id.action_skin4:
                seleccionat = 4;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_4);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk4);
                    principal.setBackgroundResource(R.drawable.skin4_gradient_selector);
                }
                break;
            case R.id.action_skin5:
                seleccionat = 5;
                if (!flash){
                    boto.setImageResource(R.mipmap.sk0_5);
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    boto.setImageResource(R.mipmap.sk5);
                    principal.setBackgroundResource(R.drawable.skin5_gradient_selector);
                }
                break;
            case R.id.action_skin6:
                seleccionat = 6;
                boto.setImageResource(R.mipmap.sk6);
                if (!flash){
                    principal.setBackgroundResource(R.drawable.apagat_gradient_selector);
                }else{
                    principal.setBackgroundResource(R.drawable.skin6_gradient_selector);
                }
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(camera != null){
            camera.release();
            camera = null;
        }
    }

    protected void onResume(){
        super.onResume();
    }

    private void processOnClick(){
        try{
            camera = Camera.open();
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            camera.setParameters(parameters);
            camera.startPreview();
        } catch(Exception e) {
            Log.e("Error", ""+e);
        }
    }

    private void processOffClick(){
        try{
            camera.stopPreview();
            camera.release();
            camera = null;
        } catch(Exception e) {
            Log.e("Error", ""+e);
        }
    }

    public void CompartirAPP() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "The best Lantern of Runaterra. Download it here: https://play.google.com/store/apps/details?id=gmustudios.threshlantern");
        try {
            startActivity(Intent.createChooser(intent, "Share using:"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }

}
