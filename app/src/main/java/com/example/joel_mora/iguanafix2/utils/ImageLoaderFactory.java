package com.example.joel_mora.iguanafix2.utils;

import android.content.Context;

public class ImageLoaderFactory {
    public static ImageLoader getImageLoader(Context context){
        return new PicassoImageLoader(context);
    }
}
