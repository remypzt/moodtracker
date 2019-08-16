package remy.pouzet.moodtracker.controller;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Date;

import remy.pouzet.moodtracker.R;
import remy.pouzet.moodtracker.model.Mood;

/**
 * Created by Remy Pouzet on 29/06/2019.
 */

public class HistoricActivity extends AppCompatActivity
{
    public static final String PREF_KEY_MOOD = "PREF_KEY_MOOD";
    private SharedPreferences mPreferences;

    int a = 0;

    TextView baner = findViewById(R.id.imageView);
    TextView baner2 = findViewById(R.id.imageView2);
    TextView baner3 = findViewById(R.id.imageView3);
    TextView baner4 = findViewById(R.id.imageView4);
    TextView baner5 = findViewById(R.id.imageView5);
    TextView baner6 = findViewById(R.id.imageView6);
    TextView baner7 = findViewById(R.id.imageView7);

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historic_activity);

        mPreferences = getSharedPreferences(PREF_KEY_MOOD, MODE_PRIVATE);
        String fromJsonMoods = mPreferences.getString(PREF_KEY_MOOD, null);

        Gson gson = new Gson();
        final ArrayList<Mood> moods = gson.fromJson(fromJsonMoods, new TypeToken<ArrayList<Mood>>()
        {
        }.getType());


        ArrayList<TextView> baners = new ArrayList<>();
        baners.add(baner);
        baners.add(baner2);
        baners.add(baner3);
        baners.add(baner4);
        baners.add(baner5);
        baners.add(baner6);
        baners.add(baner7);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        int fifthWidth = width / 5;
        int fourWidth = fifthWidth * 4;
        int threeWidth = fifthWidth * 3;
        int twoWidth = fifthWidth * 2;

        Date now = new Date();
        long mDate = now.getTime() / 86400000;

        assert moods != null;
        while (a + 1 <= moods.size() || moods.size() > 8)
        {
            if (moods.get(a) != null)
            {
                long compare = (moods.get(a).getDate() - mDate);
                String resultCompare;

                if (compare == 0)
                {
                    resultCompare = "Aujourd'hui";
                } else if (compare == -1)
                {
                    resultCompare = "Hier";
                } else if (compare == -2)
                {
                    resultCompare = "Avant-hier";
                } else if (compare < -2 && compare > -7)
                {
                    resultCompare = "Il y a " + (compare - compare * 2) + " jours";
                } else if (compare == -7)
                {
                    resultCompare = "Il y a une semaine";
                } else if (compare < -7 && compare > -32)
                {
                    resultCompare = "Il y a plus de 1 semaine";
                } else
                {
                    resultCompare = "Il y a plus de 1 mois";
                }
                baners.get(a).setText(resultCompare);

                switch (moods.get(a).getCounter())
                {
                    case 0:
                        baners.get(a).setBackgroundColor(getResources().getColor(R.color.light_sage));
                        baners.get(a).getLayoutParams().width = fourWidth;
                        break;
                    case 1:
                        baners.get(a).setBackgroundColor(getResources().getColor(R.color.cornflower_blue_65));
                        baners.get(a).getLayoutParams().width = threeWidth;
                        break;
                    case 2:
                        baners.get(a).setBackgroundColor(getResources().getColor(R.color.warm_grey));
                        baners.get(a).getLayoutParams().width = twoWidth;
                        break;
                    case 3:
                        baners.get(a).setBackgroundColor(getResources().getColor(R.color.faded_red));
                        baners.get(a).getLayoutParams().width = fifthWidth;
                        break;
                    default:
                        baners.get(a).setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                        baners.get(a).getLayoutParams().width = width;
                }
                a++;
            }

        }
        if (moods.size() >= 1)
        {
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
            if (moods.size() >= 2)
            {
                if (moods.get(1).getComment() != null)
                {
                    baners.get(1).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                    baners.get(1).setForegroundGravity(21);

                    baners.get(1).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(final View v)
                        {
                            Toast.makeText(HistoricActivity.this, moods.get(1).getComment(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
                if (moods.size() >= 3)
                {
                    if (moods.get(2).getComment() != null)
                    {
                        baners.get(2).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                        baners.get(2).setForegroundGravity(21);

                        baners.get(2).setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(final View v)
                            {
                                Toast.makeText(HistoricActivity.this, moods.get(2).getComment(), Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                    if (moods.size() >= 4)
                    {
                        if (moods.get(3).getComment() != null)
                        {
                            baners.get(3).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                            baners.get(3).setForegroundGravity(21);

                            baners.get(3).setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(final View v)
                                {
                                    Toast.makeText(HistoricActivity.this, moods.get(3).getComment(), Toast.LENGTH_LONG).show();
                                }
                            });
                        }
                        if (moods.size() >= 5)
                        {
                            if (moods.get(4).getComment() != null)
                            {
                                baners.get(4).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                                baners.get(4).setForegroundGravity(21);

                                baners.get(4).setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(final View v)
                                    {
                                        Toast.makeText(HistoricActivity.this, moods.get(4).getComment(), Toast.LENGTH_LONG).show();
                                    }
                                });
                            }
                            if (moods.size() >= 6)
                            {
                                if (moods.get(5).getComment() != null)
                                {
                                    baners.get(5).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                                    baners.get(5).setForegroundGravity(21);

                                    baners.get(5).setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(final View v)
                                        {
                                            Toast.makeText(HistoricActivity.this, moods.get(5).getComment(), Toast.LENGTH_LONG).show();
                                        }
                                    });
                                }
                                if (moods.size() >= 7)
                                {
                                    if (moods.get(6).getComment() != null)
                                    {
                                        baners.get(6).setForeground(getResources().getDrawable(R.mipmap.ic_comment_black_48px));
                                        baners.get(6).setForegroundGravity(21);

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
                    }
                }
            }
        }
    }



