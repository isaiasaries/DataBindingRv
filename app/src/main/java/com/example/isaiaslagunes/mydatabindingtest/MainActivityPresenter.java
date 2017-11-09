package com.example.isaiaslagunes.mydatabindingtest;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Isaias Lagunes on 11/9/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{

    private MainActivityContract.View view;
    private Context ctx;

    public MainActivityPresenter(MainActivityContract.View view, Context ctx) {
        this.view = view;
        this.ctx = ctx;
    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

    @Override
    public void showList() {
        Intent intent = new Intent(ctx, SecondActivity.class);
        ctx.startActivity(intent);
    }
}
