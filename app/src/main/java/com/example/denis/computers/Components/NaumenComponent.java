package com.example.denis.computers.Components;

import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.MVP.ModelImpl;
import com.example.denis.computers.MainActivity;
import com.example.denis.computers.Modules.NaumenModule;
import com.example.denis.computers.Modules.RetrofitModule;

import dagger.Component;

/**
 * Created by Denis on 19.02.2018.
 */
@MyScope
@Component(dependencies = RetrofitComponent.class, modules = NaumenModule.class)
public interface NaumenComponent {
    void inject(ModelImpl model);
}
