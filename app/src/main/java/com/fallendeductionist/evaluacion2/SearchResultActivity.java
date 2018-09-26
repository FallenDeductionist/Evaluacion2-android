package com.fallendeductionist.evaluacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class SearchResultActivity extends AppCompatActivity {
    private ArrayList<ExampleResult> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        mExampleList = ResultRepository.getPersons();
        buildRecyclerView();

        EditText searchText2 = findViewById(R.id.searchText2);
        final String searchQuery = this.getIntent().getExtras().getString("search");
        searchText2.setText(searchQuery);
        filter(searchQuery);
        searchText2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String text){
        ArrayList<ExampleResult> filteredList = new ArrayList<>();

        for (ExampleResult result : mExampleList){
            if(result.getText4().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(result);

            }
        }

        mAdapter.filterList(filteredList);
    }


    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
