package com.example.educatedfarmer;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Movie extends ArrayList<Parcelable> implements Parcelable {

    private String title;
    private String plot;
    private boolean expanded;

    public Movie(String title,  String plot) {
        this.title = title;
        this.plot = plot;
        this.expanded = false;
    }

    protected Movie(Parcel in) {
        expanded = in.readBoolean();
        title = in.readString();

        plot = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int i) {
            return new Movie[i];
        }
    };

        public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", plot='" + plot + '\'' +
                ", expanded=" + expanded +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBoolean(expanded);
            parcel.writeString(title);
        parcel.writeString(plot);

    }


}