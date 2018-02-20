package com.example.denis.computers.Components;

import com.example.denis.computers.MVP.Interfaces.View;
import com.example.denis.computers.Modules.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Denis on 20.02.2018.
 */
@Component(modules = ViewModule.class)
public interface ViewComponent {
    View view();
}
