package lod.com.sound;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    public void onClick(View v) {
        int resId;
        switch (v.getId()) {
            case R.id.button1:
                resId = R.raw.boton1;
                break;
            case R.id.button2:
                resId = R.raw.boton2;
                break;
            case R.id.button3:
                resId = R.raw.boton3;
                break;
            case R.id.button4:
                resId = R.raw.boton4;
                break;
            case R.id.button5:
                resId = R.raw.boton5;
                break;
            case R.id.button6:
                resId = R.raw.boton6;
                break;
            case R.id.button7:
                resId = R.raw.boton7;
                break;
            case R.id.button8:
                resId = R.raw.boton8;
                break;
            default:
                resId = R.raw.boton1;
                break;
        }
        /*if (mp != null) {
            mp.release();
        }*/

        mp = MediaPlayer.create(this, resId);
        mp.start();

        }


        @Override
    protected void onDestroy() {
        if(null!=mp){
            mp.release();
        }
        super.onDestroy();
    }
}


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.boton1);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();

            }

        });

        Button two = (Button) this.findViewById(R.id.button2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.boton2);
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp2.start();

            }
        });
        Button tres = (Button) this.findViewById(R.id.button3);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.boton3);
        tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp3.start();
            }
        });
        Button cuatro = (Button) this.findViewById(R.id.button4);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.boton4);
        cuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp4.start();
            }
        });
        Button cinco = (Button) this.findViewById(R.id.button5);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.boton5);
        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp5.start();
            }
        });
        Button seis = (Button) this.findViewById(R.id.button6);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.boton6);
        seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp6.start();
            }
        });
        Button siete = (Button) this.findViewById(R.id.button7);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.boton7);
        siete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp7.start();
            }
        });

    }
*/


