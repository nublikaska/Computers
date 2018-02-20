package com.example.denis.computers.Modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Denis on 19.02.2018.
 */
@Module
public class RetrofitModule {
    String baseURL;

    public RetrofitModule(String baseURL) {
        this.baseURL = baseURL;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(/*"http://testwork.nsd.naumen.ru/"*/baseURL)
                .build();
        return retrofit;
    }

}
