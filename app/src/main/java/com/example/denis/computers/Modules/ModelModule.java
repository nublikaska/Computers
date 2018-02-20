package com.example.denis.computers.Modules;

import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.MVP.ModelImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Denis on 20.02.2018.
 */
@Module
public class ModelModule {
    @Provides
    Model provideModel() {
        return new ModelImpl();
    }
}

