package com.example.mycoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 数据请求类
 */
public class HttpUtil {

    /**
     * 数据请求
     *
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
