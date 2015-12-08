package com.ui.csl.comprehensiveuse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.tyczj.extendedcalendarview.Day;
import com.tyczj.extendedcalendarview.ExtendedCalendarView;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * @author chenshenglong
 * @since 2015/11/3
 */
public class CalendarFragment extends Fragment {

    private static final String TAG = "CalendarFragment";
    //private CalendarView calendarView;
    private ExtendedCalendarView extendedCalendarView;

    public static Fragment newInstance() {
        CalendarFragment fragment = new CalendarFragment();
        return fragment;
    }

    public CalendarFragment() {
    }

    private void initViews() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, ",onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, ",onCreateView()");
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        extendedCalendarView = (ExtendedCalendarView) view.findViewById(R.id.extended_calendar_view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d(TAG, ",onViewCreated()");
        if (extendedCalendarView != null) {

            extendedCalendarView.setOnDayClickListener(new ExtendedCalendarView.OnDayClickListener() {
                @Override
                public void onDayClicked(AdapterView<?> adapter, View view, int position, long id, Day day) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(day.getYear(), day.getMonth(), day.getDay());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(gregorianCalendar.getTime());
                    Toast.makeText(getContext(), date,
                            Toast.LENGTH_SHORT).show();
                }
            });

        } else {
            Toast.makeText(getContext(), "null pointer !",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
