package android.preweather.com.preweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by bauhinia on 2018/6/8.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
