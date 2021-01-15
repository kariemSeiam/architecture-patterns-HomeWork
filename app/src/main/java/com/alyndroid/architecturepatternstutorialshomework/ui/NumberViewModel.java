package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.model.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.model.NumberModel;

public class NumberViewModel extends ViewModel {

    public MutableLiveData<Integer> numberMutableLiveData = new MutableLiveData<>();

    public NumberModel getNumFromDataBase() {
        return new DataBase().getNumbers();
    }


    public void mulNumbers() {
        numberMutableLiveData.setValue(getNumFromDataBase().getFirstNum() * getNumFromDataBase().getSecondNum());

    }


}
