package com.letronghieu.customfont.textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface alexBrushRegularTypeface;
    private  static  Typeface chunkFivePrintTypeface;
    private static Typeface windsongTypeface;

    public static Typeface getAlexBrushRegularTypeface(Context context) {
        if (alexBrushRegularTypeface == null){
            alexBrushRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/AlexBrush-Regular.ttf");

        }
        return alexBrushRegularTypeface;
    }

    public static Typeface getChunkFivePrintTypeface(Context context) {
        if (chunkFivePrintTypeface == null){
            chunkFivePrintTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Chunk Five Print.otf");

        }
        return chunkFivePrintTypeface;
    }

    public static Typeface getWindsongTypeface(Context context) {
        if (windsongTypeface == null){
            windsongTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Windsong.ttf");

        }
        return windsongTypeface;
    }
}
