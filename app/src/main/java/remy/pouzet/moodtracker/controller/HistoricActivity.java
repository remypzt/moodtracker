package remy.pouzet.moodtracker.controller;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import remy.pouzet.moodtracker.R;
import remy.pouzet.moodtracker.model.Mood;


/**
 * Created by Remy Pouzet on 29/06/2019.
 */


public class HistoricActivity extends AppCompatActivity
{
    public static final String PREF_KEY_MOOD = "PREF_KEY_MOOD";

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historic_activity);

        SharedPreferences preferences = getSharedPreferences(PREF_KEY_MOOD, MODE_PRIVATE);
        String fromJsonMoods = preferences.getString(PREF_KEY_MOOD, null);
        Gson gson = new Gson();
        final ArrayList<Mood> moods = gson.fromJson(fromJsonMoods, new TypeToken<ArrayList<Mood>>()
        {
        }.getType());

        TextView baner = findViewById(R.id.imageView);
        TextView baner2 = findViewById(R.id.imageView2);
        TextView baner3 = findViewById(R.id.imageView3);
        TextView baner4 = findViewById(R.id.imageView4);
        TextView baner5 = findViewById(R.id.imageView5);
        TextView baner6 = findViewById(R.id.imageView6);
        TextView baner7 = findViewById(R.id.imageView7);

        ArrayList<TextView> baners = new ArrayList<>();
        baners.add(baner);
        baners.add(baner2);
        baners.add(baner3);
        baners.add(baner4);
        baners.add(baner5);
        baners.add(baner6);
        baners.add(baner7);

        if (fromJsonMoods != null)
        {
            if (moods.get(0) != null)
            {
                baners.get(0).setText(moods.get(0).getDate());
                if (moods.get(0).getCounter() == 0)
                {
                    baners.get(0).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(0).getLayoutParams().width = 864;
                }
                if (moods.get(0).getCounter() == 1)
                {
                    baners.get(0).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(0).getLayoutParams().width = 648;
                }
                if (moods.get(0).getCounter() == 2)
                {
                    baners.get(0).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(0).getLayoutParams().width = 432;
                }
                if (moods.get(0).getCounter() == 3)
                {
                    baners.get(0).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(0).getLayoutParams().width = 216;
                }
                if (moods.get(0).getCounter() == 4)
                {
                    baners.get(0).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(0).getLayoutParams().width = 1080;
                }
                if (moods.get(0).getComment() != null)
                {
                    baners.get(0).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);

                    baners.get(0).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(0).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }

            if (moods.get(1) != null)
            {
                baners.get(1).setText(moods.get(1).getDate());
                if (moods.get(1).getCounter() == 0)
                {
                    baners.get(1).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(1).getLayoutParams().width = 864;
                }
                if (moods.get(1).getCounter() == 1)
                {
                    baners.get(1).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(1).getLayoutParams().width = 648;
                }
                if (moods.get(1).getCounter() == 2)
                {
                    baners.get(1).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(1).getLayoutParams().width = 432;
                }
                if (moods.get(1).getCounter() == 3)
                {
                    baners.get(1).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(1).getLayoutParams().width = 216;
                }
                if (moods.get(1).getCounter() == 4)
                {
                    baners.get(1).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(1).getLayoutParams().width = 1080;
                }
                if (moods.get(1).getComment() != null)
                {
                    baners.get(1).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);

                    baners.get(1).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(1).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }

            if (moods.get(2) != null)
            {
                baners.get(2).setText(moods.get(2).getDate());
                if (moods.get(2).getCounter() == 0)
                {
                    baners.get(2).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(2).getLayoutParams().width = 864;
                }
                if (moods.get(2).getCounter() == 1)
                {
                    baners.get(2).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(2).getLayoutParams().width = 648;
                }
                if (moods.get(2).getCounter() == 2)
                {
                    baners.get(2).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(2).getLayoutParams().width = 432;
                }
                if (moods.get(2).getCounter() == 3)
                {
                    baners.get(2).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(2).getLayoutParams().width = 216;
                }
                if (moods.get(2).getCounter() == 4)
                {
                    baners.get(2).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(2).getLayoutParams().width = 1080;
                }
                if (moods.get(2).getComment() != null)
                {
                    baners.get(2).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);

                    baners.get(2).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(2).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });

                }
            }

            if (moods.get(3) != null)
            {
                baners.get(3).setText(moods.get(3).getDate());
                if (moods.get(3).getCounter() == 0)
                {
                    baners.get(3).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(3).getLayoutParams().width = 864;
                }
                if (moods.get(3).getCounter() == 1)
                {
                    baners.get(3).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(3).getLayoutParams().width = 648;
                }
                if (moods.get(3).getCounter() == 2)
                {
                    baners.get(3).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(3).getLayoutParams().width = 432;
                }
                if (moods.get(3).getCounter() == 3)
                {
                    baners.get(3).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(3).getLayoutParams().width = 216;
                }
                if (moods.get(3).getCounter() == 4)
                {
                    baners.get(3).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(3).getLayoutParams().width = 1080;
                }
                if (moods.get(3).getComment() != null)
                {
                    baners.get(3).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);
                }
                baners.get(3).setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(final View v)
                    {
                        Toast.makeText(HistoricActivity.this, moods.get(3).getComment(), Toast.LENGTH_LONG).show();
                    }
                });
            }

            if (moods.get(4) != null)
            {
                baners.get(4).setText(moods.get(4).getDate());
                if (moods.get(4).getCounter() == 0)
                {
                    baners.get(4).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(4).getLayoutParams().width = 864;
                }
                if (moods.get(4).getCounter() == 1)
                {
                    baners.get(4).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(4).getLayoutParams().width = 648;
                }
                if (moods.get(4).getCounter() == 2)
                {
                    baners.get(4).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(4).getLayoutParams().width = 432;
                }
                if (moods.get(4).getCounter() == 3)
                {
                    baners.get(4).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(4).getLayoutParams().width = 216;
                }
                if (moods.get(4).getCounter() == 4)
                {
                    baners.get(4).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(4).getLayoutParams().width = 1080;
                }
                if (moods.get(4).getComment() != null)
                {
                    baners.get(4).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);

                    baners.get(4).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(4).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }

            if (moods.get(5) != null)
            {
                baners.get(5).setText(moods.get(5).getDate());
                if (moods.get(5).getCounter() == 0)
                {
                    baners.get(5).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(5).getLayoutParams().width = 864;
                }
                if (moods.get(5).getCounter() == 1)
                {
                    baners.get(5).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(5).getLayoutParams().width = 648;
                }
                if (moods.get(5).getCounter() == 2)
                {
                    baners.get(5).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(5).getLayoutParams().width = 432;
                }
                if (moods.get(5).getCounter() == 3)
                {
                    baners.get(5).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(5).getLayoutParams().width = 216;
                }
                if (moods.get(5).getCounter() == 4)
                {
                    baners.get(5).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(5).getLayoutParams().width = 1080;
                }
                if (moods.get(5).getComment() != null)
                {
                    baners.get(5).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);

                    baners.get(5).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(5).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }

            if (moods.get(6) != null)
            {
                baners.get(6).setText(moods.get(6).getDate());
                if (moods.get(6).getCounter() == 0)
                {
                    baners.get(6).setBackgroundColor(getResources().getColor(R.color.light_sage));
                    baners.get(6).getLayoutParams().width = 864;
                }
                if (moods.get(6).getCounter() == 1)
                {
                    baners.get(6).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                    baners.get(6).getLayoutParams().width = 648;
                }
                if (moods.get(6).getCounter() == 2)
                {
                    baners.get(6).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                    baners.get(6).getLayoutParams().width = 432;
                }
                if (moods.get(6).getCounter() == 3)
                {
                    baners.get(6).setBackgroundColor(getResources().getColor(R.color.faded_red));
                    baners.get(6).getLayoutParams().width = 216;
                }
                if (moods.get(6).getCounter() == 4)
                {
                    baners.get(6).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                    baners.get(6).getLayoutParams().width = 1080;
                }
                if (moods.get(6).getComment() != null)
                {
                    baners.get(6).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(0).setForegroundGravity(21);

                    baners.get(6).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(6).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        }
    }
}