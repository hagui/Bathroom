package data.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import util.Constants;

/**
 * Created by z.hagui.
 *
 */

public class BathRoomApi {
    @NonNull
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    @Nullable
    private static Retrofit retrofit = null;

    /**
     * rest interface to creat service to make api call using retrofit2
     * @param params parameters to add to Base url in order to make call with params in filters like rows or distance
     * @return api interface to use it in repository in order to make api call
     */
    public static RestApiInterface bathRoomApiService(ArrayList<String> params) {
        String url = Constants.BASE_URL;
        for(String s: params){
            url = url + "&" + s;
        }
        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url);
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Interceptor interceptor = new Interceptor();
        // log api call and response
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (!httpClient.interceptors().contains(interceptor)) {
            builder.addConverterFactory(GsonConverterFactory.create(gson));
            httpClient.addInterceptor(interceptor);
            httpClient.connectTimeout(10, TimeUnit.SECONDS);
            httpClient.readTimeout(10, TimeUnit.SECONDS);
            httpClient.writeTimeout(10, TimeUnit.SECONDS);
            httpClient.retryOnConnectionFailure(true);
            httpClient.addInterceptor(logging);
            builder.client(httpClient.build());
            retrofit = builder.build();
        }
        return retrofit != null ? retrofit.create(RestApiInterface.class) : null;
    }
}
