package com.example.tzippy.mediaplatyer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new HandleClick());
        mediaPlayer = MediaPlayer.create(this, R.raw.song);

    }

    private class HandleClick implements OnClickListener{

        public void onClick(View arg0) {
            Button btn = (Button)arg0;  //cast view to a button
            // get a reference to the TextView
            TextView tv = (TextView) findViewById(R.id.main_text);
            // update the TextView text
            tv.setText("I stay out too late\n" +
                    "Got nothing in my brain\n" +
                    "That's what people say, mmm-mmm\n" +
                    "That's what people say, mmm-mmm\n" +
                    "\n" +
                    "I go on too many dates [chuckle]\n" +
                    "But I can't make them stay\n" +
                    "At least that's what people say, mmm-mmm\n" +
                    "That's what people say, mmm-mmm\n" +
                    "\n" +
                    "But I keep cruising\n" +
                    "Can't stop, won't stop moving\n" +
                    "It's like I got this music\n" +
                    "In my mind\n" +
                    "Saying, \"It's gonna be alright.\"\n" +
                    "\n" +
                    "'Cause the players gonna play, play, play, play, play\n" +
                    "And the haters gonna hate, hate, hate, hate, hate\n" +
                    "Baby, I'm just gonna shake, shake, shake, shake, shake\n" +
                    "I shake it off, I shake it off\n" +
                    "Heart-breakers gonna break, break, break, break, break\n" +
                    "And the fakers gonna fake, fake, fake, fake, fake\n" +
                    "Baby, I'm just gonna shake, shake, shake, shake, shake\n" +
                    "I shake it off, I shake it off\n" +
                    "\n" +
                    "I never miss a beat\n" +
                    "I'm lightning on my feet\n" +
                    "And that's what they don't see, mmm-mmm\n" +
                    "That's what they don't see, mmm-mmm\n" +
                    "\n" +
                    "I'm dancing on my own (dancing on my own)\n" +
                    "I make the moves up as I go (moves up as I go)\n" +
                    "And that's what they don't know, mmm-mmm\n" +
                    "That's what they don't know, mmm-mmm\n" +
                    "\n" +
                    "But I keep cruising\n" +
                    "Can't stop, won't stop grooving\n" +
                    "It's like I got this music\n" +
                    "In my mind\n" +
                    "Saying, \"It's gonna be alright.\"\n" +
                    "\n" +
                    "'Cause the players gonna play, play, play, play, play\n" +
                    "And the haters gonna hate, hate, hate, hate, hate\n" +
                    "Baby, I'm just gonna shake, shake, shake, shake, shake\n" +
                    "I shake it off, I shake it off\n" +
                    "Heart-breakers gonna break, break, break, break, break\n" +
                    "And the fakers gonna fake, fake, fake, fake, fake\n" +
                    "Baby, I'm just gonna shake, shake, shake, shake, shake\n" +
                    "I shake it off, I shake it off\n" +
                    "\n" +
                    "Shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off\n" +
                    "\n" +
                    "Hey, hey, hey\n" +
                    "Just think while you've been getting down and out about the liars and the dirty, dirty cheats of the world,\n" +
                    "You could've been getting down to this sick beat.\n" +
                    "\n" +
                    "My ex-man brought his new girlfriend\n" +
                    "She's like \"Oh, my god!\" but I'm just gonna shake.\n" +
                    "And to the fella over there with the hella good hair\n" +
                    "Won't you come on over, baby? We can shake, shake, shake\n" +
                    "\n" +
                    "Yeah ohhh\n" +
                    "\n" +
                    "'Cause the players gonna play, play, play, play, play\n" +
                    "And the haters gonna hate, hate, hate, hate, hate (haters gonna hate)\n" +
                    "I'm just gonna shake, shake, shake, shake, shake\n" +
                    "I shake it off, I shake it off\n" +
                    "Heart-breakers gonna break, break, break, break, break (mmmm)\n" +
                    "And the fakers gonna fake, fake, fake, fake, fake (and fake, and fake, and fake)\n" +
                    "Baby, I'm just gonna shake, shake, shake, shake, shake\n" +
                    "I shake it off, I shake it off\n" +
                    "\n" +
                    "Shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off\n" +
                    "I, I, I shake it off, I shake it off\n" +
                    "\n" +
                    "Shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off\n" +
                    "\n" +
                    "Shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off (you've got to),\n" +
                    "I, I, I shake it off, I shake it off,\n" +
                    "I, I, I shake it off, I shake it off");
            if(mediaPlayer.isPlaying() == true)
                mediaPlayer.pause();
            else
                mediaPlayer.start();
        }
    }
}
