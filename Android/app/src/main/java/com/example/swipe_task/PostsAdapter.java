package com.example.swipe_task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private List<Posts> postsList;

    public PostsAdapter(List<Posts> postsList) {
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvProductname.setText(postsList.get(position).getProduct_name());
        holder.tvProducttype.setText(postsList.get(position).getProduct_type());
        //holder.tvImage.setImageIcon(postsList.get(position).getImage());
        holder.tvTax.setText(postsList.get(position).getTax());
        holder.tvPrice.setText(postsList.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvProductname;
        TextView tvProducttype;
        TextView tvTax;
        ImageView tvImage;
        TextView tvPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvProductname=itemView.findViewById(R.id.productName);
            tvProducttype=itemView.findViewById(R.id.ProductType);
            tvPrice=itemView.findViewById(R.id.price);
            tvTax=itemView.findViewById(R.id.tax);
            tvImage=itemView.findViewById(R.id.image);

        }
    }
}
