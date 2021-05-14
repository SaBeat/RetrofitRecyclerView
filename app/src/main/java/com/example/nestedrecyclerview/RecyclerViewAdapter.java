package com.example.nestedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context context;
    private List<Post> postList;

    public RecyclerViewAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.textview_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.userId.setText(postList.get(position).getUserId());
        holder.id.setText(postList.get(position).getId());
        holder.title.setText(postList.get(position).getTitle());
        holder.body.setText(postList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public static final class MyViewHolder extends RecyclerView.ViewHolder{

        TextView userId,id,title,body;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userId=itemView.findViewById(R.id.txt_userId);
            id=itemView.findViewById(R.id.txt_id);
            title=itemView.findViewById(R.id.txt_title);
            body=itemView.findViewById(R.id.txt_body);
        }
    }
}
