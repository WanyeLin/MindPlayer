package com.example.linwei.mindplayer;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

        private Context mContext ;

        private List<Music> mMusicList;

        static class ViewHolder extends RecyclerView.ViewHolder{
            CardView cardView;
            ImageView musicImage;
            TextView musicName;

            public ViewHolder(View view){
                super(view);
                cardView=(CardView) view;
                musicImage=(ImageView) view.findViewById(R.id.music_image);
                musicName=(TextView) view.findViewById(R.id.music_name);

            }
        }

        public MusicAdapter(List<Music> musicList){
            mMusicList= musicList;
        }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        if(mContext==null){
            mContext=parent.getContext();
        }

        View view = LayoutInflater.from(mContext).inflate(R.layout.music,parent,false);
        return new ViewHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Music music = mMusicList.get(position);
        holder.musicName.setText(music.getname());
        Glide.with(mContext).load(music.getUrl()).into(holder.musicImage);
    }

    @Override
    public int getItemCount() {
        return mMusicList.size();
    }
}
