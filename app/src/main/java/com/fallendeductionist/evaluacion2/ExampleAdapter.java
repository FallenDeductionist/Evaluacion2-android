package com.fallendeductionist.evaluacion2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<ExampleResult> mExampleList;
    private OnResultClickListener mListener;

    public interface OnResultClickListener {
        void onResultClick(int position);
    }

    public void setOnResultCLickListener(OnResultClickListener listener){
        mListener = listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public RatingBar mRatingBar;

        public ExampleViewHolder(View itemView, final OnResultClickListener listener){
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView1);
            mTextView2 = itemView.findViewById(R.id.textView2);
            mTextView3 = itemView.findViewById(R.id.textView3);
            mRatingBar = itemView.findViewById(R.id.ratingBar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onResultClick(position);
                        }
                    }
                }
            });
        }
    }

    public ExampleAdapter(ArrayList<ExampleResult> exampleList){
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_result, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v, mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleResult currentResult = mExampleList.get(position);

        holder.mImageView.setImageResource(currentResult.getImageResource());
        holder.mTextView1.setText(currentResult.getText1());
        holder.mTextView2.setText(currentResult.getText2());
        holder.mTextView3.setText(currentResult.getText3());
        holder.mRatingBar.setRating(currentResult.getRating());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<ExampleResult> filteredList){
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}
