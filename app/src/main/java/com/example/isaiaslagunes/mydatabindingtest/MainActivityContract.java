package com.example.isaiaslagunes.mydatabindingtest;

/**
 * Created by Isaias Lagunes on 11/9/2017.
 */

public interface MainActivityContract {
    public interface Presenter{
        void onShowData(TemperatureData temperatureData);
        void showList();
    }
    public interface View{
        void showData(TemperatureData temperatureData);
    }
}
