package com.reshadev.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {
    Project entries[];

    public BucketListAdapter(Project[] entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListAdapter.BucketListViewHolder holder, int position) {
        holder.bind(entries[position], position);

    }


    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView title;
        private TextView desc;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.image_view_project);
            this.title = itemView.findViewById(R.id.title_text);
            this.desc = itemView.findViewById(R.id.desc_text_view);
        }

        public void bind(Project project, int position) {
            image.setImageResource(project.image);
            title.setText(project.title);
            desc.setText(project.description);
        }

    }
}
