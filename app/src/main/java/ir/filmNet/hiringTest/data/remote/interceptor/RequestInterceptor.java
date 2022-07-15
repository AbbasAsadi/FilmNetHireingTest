package ir.filmNet.hiringTest.data.remote.interceptor;


import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * @author Abbas Asadi
 */
public class RequestInterceptor implements Interceptor {

    /**
     * @return Response
     * @throws IOException add request headers to all request
     */
    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request.Builder builder = chain.request().newBuilder();
        builder.addHeader("X-Platform", "Android");

        return chain.proceed(builder.build());
    }
}
