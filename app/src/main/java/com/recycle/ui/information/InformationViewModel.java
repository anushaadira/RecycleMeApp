package com.recycle.ui.information;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformationViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Please recycle\niuri uidhs i  lkjsjf jadsflk jlkadsjfkl jasklfjakls djgkldjsa kgljdasklgjdkslfjkld asjfkldsjfklds jfkldsjklfjdskjgd9u90 09 709 707 0709 770 907hiof hdoifhio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}