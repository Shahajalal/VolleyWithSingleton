package com.example.shahajalal.volleywithsingleton;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleton {

    private static MySingleton mInstance;
    private RequestQueue requestQueue;
    private static Context mctx;

    private MySingleton(Context context){
        mctx=context;
        requestQueue=getRequestQue();

    }

    public RequestQueue getRequestQue() {

        if(requestQueue==null){
            requestQueue= Volley.newRequestQueue(mctx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized MySingleton getInstance(Context context){

    }
}
