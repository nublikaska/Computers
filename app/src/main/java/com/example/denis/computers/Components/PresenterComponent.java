package com.example.denis.computers.Components;

import com.example.denis.computers.MVP.Interfaces.Presenter;
import com.example.denis.computers.MainActivity;
import com.example.denis.computers.Modules.ModelModule;
import com.example.denis.computers.Modules.PresenterModule;

import dagger.Component;

/**
 * Created by Denis on 20.02.2018.
 */
@MyScope
@Component(dependencies = {ModelComponent.class, ViewComponent.class}, modules = PresenterModule.class)
public interface PresenterComponent {
    Presenter getPresenter();
}
