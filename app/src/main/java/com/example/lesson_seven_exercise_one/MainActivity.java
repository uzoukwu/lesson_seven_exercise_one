package com.example.lesson_seven_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> informationInput = Arrays.asList(
                "Peter Jackson, 32 years",
                "Marcus Linch, 90 years",
                "Esther Smith, 23 years",
                "Ivan Ivanov, 40 years",
                "Johnny Campbell, 16 years",
                "Louis Sander, 21 years",
                "Anderson Lovegood, 25 years",
                "Miguel Andrade, 65 years",
                "Kevin Lucas, 29 years",
                "Martin Martin, 10 years");


        ArrayList<String> peopleInfo = new ArrayList(informationInput);


        String persontofind = "Ivan";


        for (String person: peopleInfo) {
            if(person.contains(persontofind)) {
                String personage = person.replaceAll("[^0-9]", "");
                Log.d("myLog", "" + persontofind.split(",")[0] + "'s age is " + personage + " years old.");
            }
       }
        }

    }