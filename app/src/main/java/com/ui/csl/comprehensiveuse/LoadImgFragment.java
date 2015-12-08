package com.ui.csl.comprehensiveuse;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author chenshenglong
 * @since 2015/9/10
 */
public class LoadImgFragment extends Fragment {

    //顺便看下Fragment的生命周期
    private static final String TAG = "LoadImgFragment";

    public LoadImgFragment() {
    }

    public static Fragment newInstance() {

        LoadImgFragment fragment = new LoadImgFragment();

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, ",onAttach()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, ",onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,",onCreateView()");
        View view = inflater.inflate(R.layout.fragment_load_img,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, ",onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, ",onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, ",onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, ",onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, ",onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, ",onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ",onDestroy()");
    }
}
