package cl.ubb.animalsounds;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int maxStreams = 1;
    private final int streamType = AudioManager.STREAM_MUSIC;
    private final int srcQuality = 0;
    private SoundPool soundPool;

    private int idSoundCat;
    private int idSoundBird;
    private int idSoundCow;
    private int idSoundDog;
    private int idSoundDuck;

    private final int LEFT_VOLUME = 1;
    private final int RIGHT_VOLUME = 1;
    private final int PRIORITY = 0;
    private final int LOOP = 0;
    private final int RATE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //soundPool = new SoundPool.Builder();
        soundPool = new SoundPool(maxStreams, streamType, srcQuality);

        idSoundCat = soundPool.load(getApplicationContext(), R.raw.cat, 1);
        idSoundBird = soundPool.load(getApplicationContext(), R.raw.bird, 1);
        idSoundCow = soundPool.load(getApplicationContext(), R.raw.cow, 1);
        idSoundDog = soundPool.load(getApplicationContext(), R.raw.dog, 1);
        idSoundDuck = soundPool.load(getApplicationContext(), R.raw.duck, 1);

    }

    public void playCat(View view) {
        soundPool.play(idSoundCat, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, RATE);
        Log.d("play", "cat");
    }
    public void playBird(View view) {
        soundPool.play(idSoundBird, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, RATE);
        Log.d("play", "bird");
    }
    public void playCow(View view) {
        soundPool.play(idSoundCow, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, RATE);
        Log.d("play", "cow");
    }
    public void playDog(View view) {
        soundPool.play(idSoundDog, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, RATE);
        Log.d("play", "dog");
    }
    public void playDuck(View view) {
        soundPool.play(idSoundDuck, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, RATE);
        Log.d("play", "duck");
    }
}
