package com.example.educatedfarmer.ui.cropcare;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CropCareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CropCareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}