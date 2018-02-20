package com.example.denis.computers.Modules;

import com.example.denis.computers.Components.MyScope;
import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.MVP.Interfaces.Presenter;
import com.example.denis.computers.MVP.Interfaces.View;
import com.example.denis.computers.MVP.PresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Denis on 20.02.2018.
 */
@Module
public class PresenterModule {

    @MyScope
    @Provides
    Presenter providePresenter(View view, Model model) {
        return new PresenterImpl(view, model);
    }
}
