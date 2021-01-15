package com.alyndroid.architecturepatternstutorialshomework.ui;

import com.alyndroid.architecturepatternstutorialshomework.model.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.model.NumberModel;

public class NumberPresenter {


    NumberView view;

    public NumberPresenter(NumberView view) {
        this.view = view;
    }

    public NumberModel getNumFromDataBase() {
        return new DataBase().getNumbers();
    }

    public void getNumbers() {
        view.getNum(getNumFromDataBase().getFirstNum(), getNumFromDataBase().getSecondNum());
    }
}
