package com.recycle.ui.survey;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.camera2.basic.R;
import com.example.android.camera2.basic.databinding.FragmentSurveyBinding;

//import com.recycle.R;
//import com.recycle.databinding.FragmentSurveyBinding;

public class SurveyFragment extends Fragment {

    private FragmentSurveyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SurveyViewModel surveyViewModel =
                new ViewModelProvider(this).get(SurveyViewModel.class);

        binding = FragmentSurveyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textDashboard;
        //surveyViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        binding.q1Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i== R.id.radioButton1) {
                    Log.d("ZZZ","q1yes");
                } else if (i== R.id.radioButton2) {
                    Log.d("ZZZ","q1no");
                }
                else if (i== R.id.radioButton3) {
                Log.d("ZZZ","q2yes");
                }
                else if (i== R.id.radioButton4) {
                    Log.d("ZZZ","q2no");
                }
                 else if (i== R.id.radioButton5) {
                    Log.d("ZZZ","q3yes");
                }
                else if (i== R.id.radioButton6) {
                    Log.d("ZZZ","q3no");
                }
            }
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}