package com.example.seang.sem8project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.view.Menu;
import android.widget.DatePicker;
import java.util.Calendar;
import android.app.FragmentTransaction;
import android.support.design.widget.Snackbar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.util.Log;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.seang.sem8project.models.ServerRequest;
import com.example.seang.sem8project.models.ServerResponse;
import com.example.seang.sem8project.models.User;

import java.util.Objects;


public class Register_BabyFragment extends Fragment implements View.OnClickListener{

    private AppCompatRadioButton btn_submit_babies_details;
    private EditText babys_name;
    private TextView add_your_babies_details_here;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         Spinner  spinner = (Spinner) view.findViewById(R.id.spinner);
    }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register__baby, container, false);
    }

}
