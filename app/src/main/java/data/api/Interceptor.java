package data.api;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by z.hagui on 20/03/2018.
 * Bathroom
 * it is added to intercept every http call
 * if we need to use an authentification system
 * or if we have a dynamic headers
 */

class Interceptor implements okhttp3.Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        // if we need a token we will check if it needs to be refreshed here.
        // in order to catch if therer is a server problem and the sended body is null
        if (response.body() == null) {
            throw new IllegalStateException("interceptor " + response.code() + " returned a response with no body");
        }
        return response;
    }
}
