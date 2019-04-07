package com.e.seekbarbackgroundprogressdrablethumb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=(TextView)findViewById(R.id.textView);
        SeekBar seekBar=(SeekBar)findViewById(R.id.seekBar);
        SeekBar seekBar1=(SeekBar)findViewById(R.id.seekBar1);
        textView.setText(String.valueOf(seekBar.getProgress()));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textView.setText("拖曳開始");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText("拖曳結束");
            }
        });
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar1) {
                textView.setText("拖曳開始");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar1) {
                textView.setText("拖曳結束");
            }
        });
    }
}
