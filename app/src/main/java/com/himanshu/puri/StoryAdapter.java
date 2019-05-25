package com.himanshu.puri;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    private String[] data;
    public StoryAdapter(String[] data){
        this.data=data;
    }

    @Override
    public StoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StoryViewHolder viewHolder, int i) {

        String title=data[i];
        viewHolder.txtTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder{
       TextView txtTitle;
        public StoryViewHolder(View itemView){
            super(itemView);
            txtTitle=(TextView) itemView.findViewById(R.id.txtTitle);
            txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), Content.class);
                    view.getContext().startActivity(intent);
                }
            });
        }
    }


}
