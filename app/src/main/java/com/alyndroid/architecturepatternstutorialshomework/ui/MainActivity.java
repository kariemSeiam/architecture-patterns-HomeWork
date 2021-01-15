package com.alyndroid.architecturepatternstutorialshomework.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.alyndroid.architecturepatternstutorialshomework.R;
import com.alyndroid.architecturepatternstutorialshomework.databinding.ActivityMainBinding;
import com.alyndroid.architecturepatternstutorialshomework.model.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.model.NumberModel;

public class MainActivity extends AppCompatActivity implements NumberView {

    ActivityMainBinding binding;
    NumberPresenter presenter = new NumberPresenter(this);
    NumberViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // MVP
        binding.divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getNumbers();
            }
        });

        //MVC
        binding.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.plusResultTextView.setText(String.valueOf(getNumFromDataBase().getFirstNum() + getNumFromDataBase().getSecondNum()));
            }
        });

        //The rest of MVVM in XML R.layout.activity_main
        viewModel = ViewModelProviders.of(this).get(NumberViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
    }

    public NumberModel getNumFromDataBase() {
        return new DataBase().getNumbers();
    }

    //MVP
    @Override
    public void getNum(int num1, int num2) {
        binding.divResultTextView.setText(String.valueOf(num1 / num2));
    }
}
