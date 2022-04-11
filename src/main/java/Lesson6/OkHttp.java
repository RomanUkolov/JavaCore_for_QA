package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttp {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("1046")
                .addQueryParameter("apikey", "QV1Xv1bAeAc4F6RLVdhTgSjeAC9pzFxH")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("accept",  "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.code());

        String body = response.body().string();
        System.out.println(body);



    }
}
