package com.example.denis.computers.Components;

import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.Modules.ModelModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Denis on 20.02.2018.
 */
@Component(modules = ModelModule.class)
public interface ModelComponent {
    Model model();
}
