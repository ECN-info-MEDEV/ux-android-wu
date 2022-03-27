package com.example.devmoapp.ui.ticket;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.devmoapp.R;

public class TicketFragment extends Fragment {

    public ImageView testImageView;

    public static TicketFragment newInstance() {
        return new TicketFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        testImageView = findViewById();
        return inflater.inflate(R.layout.ticket_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(TicketViewModel.class);
        // TODO: Use the ViewModel
    }

}