package com.example.denis.computers.Components;

import com.example.denis.computers.Modules.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Denis on 20.02.2018.
 */
@Singleton
@Component(modules = RetrofitModule.class)
public interface RetrofitComponent {
    Retrofit retrofit();
}
