package com.example.denis.computers.MVP;

import com.example.denis.computers.App;
import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.Modules.NaumenModule;
import com.example.denis.computers.model.Computers;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Denis on 18.02.2018.
 */

public class ModelImpl implements Model {

    @Inject
    public ModelImpl() {
        App.getNaumenComponent().inject(this);
    }

    @Inject
    NaumenModule.NaumenApi naumenApi;

    @Override
    public Observable<Computers> getComputers(int page) {

        return naumenApi
                .getComputers(page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
