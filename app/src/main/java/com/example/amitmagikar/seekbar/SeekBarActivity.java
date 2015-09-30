package com.example.amitmagikar.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView finished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        finished = (TextView) findViewById(R.id.finished);

        finished.setText("Finished : "+seekBar.getProgress()+ " / "+seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress_value;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress_value = progress;
                finished.setText("Finished : "+progress+" / "+seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                finished.setText("Finished : "+progress_value+" / "+seekBar.getMax());

            }
        });

    }


}
