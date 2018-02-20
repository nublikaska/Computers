package com.example.denis.computers.Modules;
import com.example.denis.computers.Components.MyScope;
import com.example.denis.computers.model.Computers;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Denis on 19.02.2018.
 */
@Module
public class NaumenModule {

    public interface NaumenApi {
        @GET("rest/computers")
        Observable<Computers> getComputers(@Query("p") int page);
    }

    @MyScope
    @Provides
    NaumenApi providesNaumenInterface(Retrofit retrofit) {
        return retrofit.create(NaumenApi.class);
    }
}
