package com.example.tablayoutt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_fragment,container,false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return  v;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Khushboo Rai", "7002345309",R.drawable.ic_launcher_background));
        lstContact.add(new Contact("Khushi Rai", "7002345309",R.drawable.ic_launcher_background));
        lstContact.add(new Contact("Khush Rai", "7002345309",R.drawable.ic_launcher_background));

        lstContact.add(new Contact("Khushbu Rai", "7002345309",R.drawable.ic_launcher_background));

        lstContact.add(new Contact("Khushhh Rai", "7002345309",R.drawable.ic_launcher_background));



    }
}
