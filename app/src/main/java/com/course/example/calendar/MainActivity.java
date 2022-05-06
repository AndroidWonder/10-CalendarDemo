package com.course.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {

    private CalendarView calendar;
    private TextView date_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = (CalendarView) findViewById(R.id.calendar);
        date_view = (TextView) findViewById(R.id.date_view);

        //set date change listener on calendar
        calendar.setOnDateChangeListener(this);

    }
    //required by interface
    public void onSelectedDayChange( CalendarView view,
                                     int year,
                                     int month,
                                     int dayOfMonth)
    {
        //format date for textview
        String Date
                = (month + 1) + "/" + dayOfMonth + "/"
                 + year;

        date_view.setText(Date);
    }

}