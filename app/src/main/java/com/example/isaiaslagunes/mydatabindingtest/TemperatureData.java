package com.example.isaiaslagunes.mydatabindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Isaias Lagunes on 11/9/2017.
 */

public class TemperatureData extends BaseObservable{
    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius) {
        this.location = location;
        this.celsius = celsius;
    }
    @Bindable
    public String getLocation() {
        return location;
    }
    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }
}
