package com.karthick.fragmentapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bind(position);
    }

    @Override
    public int getItemCount() {
        return MyData.colors.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView itemTextView;

        public ListViewHolder(@NonNull final View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.itemTextView);
            itemTextView.setOnClickListener(this);
        }

        void bind(int position) {
            itemTextView.setText(MyData.colors[position]);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            switch (position) {
                case 0:
                    MainActivity.rightFragment.getView().setBackgroundColor(Color.BLACK);
                    break;

                case 1:
                    MainActivity.rightFragment.getView().setBackgroundColor(Color.RED);
                    break;

                case 2:
                    MainActivity.rightFragment.getView().setBackgroundColor(Color.GREEN);
                    break;

                case 3:
                    MainActivity.rightFragment.getView().setBackgroundColor(Color.BLUE);
                    break;

                case 4:
                    MainActivity.rightFragment.getView().setBackgroundColor(Color.GRAY);
                    break;
            }
        }
    }
}