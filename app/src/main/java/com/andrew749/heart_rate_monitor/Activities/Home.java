package com.andrew749.heart_rate_monitor.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andrew749.heart_rate_monitor.Activities.HeartRateMonitor;
import com.andrew749.heart_rate_monitor.R;

/**
 * Created by andrew on 2/8/15.
 */
public class Home extends Activity implements View.OnClickListener {
    //TODO run tutorial livrary to show user how to operate monitor
    Button quickMeasurement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        //check to see if first time launching and launch tutorial
//        TutorialsCardActivity activity = new TutorialsCardActivity();
        quickMeasurement=(Button)findViewById(R.id.quickMeasurementButton);
        quickMeasurement.setOnClickListener(this);

        //

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.quickMeasurementButton:
                Intent intent=new Intent(this,HeartRateMonitor.class);
                startActivity(intent);
                break;
            case R.id.historyButton:
                Intent intent=new Intent(this, )
                break;

        }
    }
}
