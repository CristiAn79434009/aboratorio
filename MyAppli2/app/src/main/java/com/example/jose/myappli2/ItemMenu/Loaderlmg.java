package com.example.jose.myappli2.ItemMenu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Binder;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Loaderlmg extends AsyncTask<String, Bitmap, Bitmap>{
    private  OnLoadComplelmg event;
    private ImageView containerimg;
    private int position;
    public  void setOnloadCompleteImg (ImageView conatainer, int position , OnLoadComplelmg event){
        this.event = event;
        this.containerimg = conatainer;
        this.position =position;

    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        String url = strings[0];
        try{
            URL imgurl =new URL(url);
            InputStream file = imgurl.openConnection().getInputStream();
            Bitmap img = BitmapFactory.decodeStream(file);
            return img;
        }catch (MalformedURLException exp){
            Log.i("ERROR",exp.getMessage());
        }
        catch (IOException exp) {
            Log.i("ERROR", exp.getMessage());
        }
        return null;
    }
    protected  void onPostExecute(Bitmap img){
        this.event.OnloadCompleteImgResult(this.containerimg,this.position, img);
    }
}
