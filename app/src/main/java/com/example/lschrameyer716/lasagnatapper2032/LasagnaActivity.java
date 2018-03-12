package com.example.lschrameyer716.lasagnatapper2032;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class LasagnaActivity extends Activity {
    public int lasagnaCompare;
    public String lasagnaNum;
    public int lNum = 1;
    public int sckolCost = 3;
    public int sckolNum = 0;
    public int colegCost = 6;
    public int colegNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasagna);
    }

    public void showShop(View v) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);

    }

    private void updateLasagna() {
        lasagnaNum = "";
        lasagnaNum += lasagnaCompare;
        ((TextView) findViewById(R.id.lasagnaAmount)).setText(lasagnaNum);
    }

    public void lasagnaOnClick (View v){
        lasagnaCompare += lNum;
        updateLasagna();
    }

    public void sckol (View v){
        if (lasagnaCompare >= sckolCost){
            lNum++;
            lasagnaCompare -= sckolCost;
            updateLasagna();
            sckolCost = sckolCost * 2;
            sckolNum++;
        }else{

        }
        ((TextView) findViewById(R.id.sckolCount)).setText(""+sckolNum);
    }

    public void coleg(View v) {
        if (lasagnaCompare == colegCost){
            lNum += 5;
            colegCost = colegCost * 2;
            colegNum++;
        }else{

        }
        ((TextView)findViewById(R.id.colegCount)).setText(""+colegNum);
    }
}
