package ir.filmNet.hiringTest.di.module;

import static ir.filmNet.hiringTest.data.remote.api.ServerAddresses.BASE_URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ihsanbal.logging.Level;
import com.ihsanbal.logging.LoggingInterceptor;
import com.squareup.picasso.BuildConfig;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.filmNet.hiringTest.data.remote.api.ApiService;
import ir.filmNet.hiringTest.data.remote.interceptor.RequestInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Abbas Asadi
 */
@Module
public class ApiModule {
    /**
     * The method returns the Gson object
     */
    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder()
                .setLenient()
                .disableHtmlEscaping()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .excludeFieldsWithoutExposeAnnotation()
                .create();
    }

    /**
     * The method returns the HttpLoggingInterceptor object
     */
    @Provides
    @Singleton
    LoggingInterceptor provideHttpLoggingInterceptor() {
        return new LoggingInterceptor.Builder()
                .setLevel(Level.BASIC)
                .log(Platform.INFO)
                .request("Request")
                .response("Response")
                .addHeader("version", BuildConfig.VERSION_NAME)
                .build();
    }

    /**
     * The method returns the Okhttp object
     */
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(LoggingInterceptor loggingInterceptor) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);
        httpClient.addInterceptor(new RequestInterceptor());
        httpClient.connectTimeout(30, TimeUnit.SECONDS);
        httpClient.readTimeout(30, TimeUnit.SECONDS);
        httpClient.writeTimeout(30, TimeUnit.SECONDS);
        httpClient.protocols(Collections.singletonList(Protocol.HTTP_1_1));

        return httpClient.build();
    }


    /**
     * The method returns the Retrofit object
     */
    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .build();
    }

    /**
     * The method provide api service
     */
    @Provides
    @Singleton
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

}
