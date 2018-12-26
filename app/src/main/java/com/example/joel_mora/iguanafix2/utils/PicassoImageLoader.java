package com.example.joel_mora.iguanafix2.utils;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

public class PicassoImageLoader implements ImageLoader {

    private Picasso picasso;
    private Context mContext;

    public PicassoImageLoader(Context context) {
        mContext = context;
        Downloader downloader   = new OkHttpDownloader(mContext, Integer.MAX_VALUE);
        Picasso.Builder builder = new Picasso.Builder(mContext);
        builder.downloader(downloader);
        picasso = builder.build();
    }

    @Override
    public void loadImage(String url, ImageView imageView){
        picasso.with(mContext).load(url).into(imageView);
    }

    @Override
    public void loadImage(String url, ImageView imageView, final ImageLoaderCallBack imageLoaderCallBack){
        picasso.with(mContext).load(url).into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                imageLoaderCallBack.onSuccess();
            }

            @Override
            public void onError() {
                imageLoaderCallBack.onError();
            }
        });
    }
}