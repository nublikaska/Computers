package com.example.denis.computers;

import android.app.Application;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.denis.computers.Components.DaggerModelComponent;
import com.example.denis.computers.Components.DaggerNaumenComponent;
import com.example.denis.computers.Components.DaggerPresenterComponent;
import com.example.denis.computers.Components.DaggerRetrofitComponent;
import com.example.denis.computers.Components.DaggerViewComponent;
import com.example.denis.computers.Components.ModelComponent;
import com.example.denis.computers.Components.NaumenComponent;


import com.example.denis.computers.Components.PresenterComponent;
import com.example.denis.computers.Components.RetrofitComponent;
import com.example.denis.computers.Components.ViewComponent;
import com.example.denis.computers.Modules.ModelModule;
import com.example.denis.computers.Modules.NaumenModule;
import com.example.denis.computers.Modules.PresenterModule;
import com.example.denis.computers.Modules.RetrofitModule;
import com.example.denis.computers.Modules.ViewModule;


/**
 * Created by Denis on 15.02.2018.
 */
public class App extends Application {
    private static NaumenComponent naumenComponent;
    private static RetrofitComponent retrofitComponent;
    private static PresenterComponent presenterComponent;
    private static ModelComponent modelComponent;
    private static ViewComponent viewComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofitComponent = DaggerRetrofitComponent.builder()
                .retrofitModule(new RetrofitModule("http://testwork.nsd.naumen.ru/"))
                .build();

        naumenComponent = DaggerNaumenComponent.builder()
                .retrofitComponent(retrofitComponent)
                .naumenModule(new NaumenModule())
                .build();

        modelComponent = DaggerModelComponent.builder()
                .modelModule(new ModelModule())
                .build();
    }


    public static NaumenComponent getNaumenComponent() {
        return naumenComponent;
    }

    public static RetrofitComponent getRetrofitComponent() {
        return retrofitComponent;
    }

    public static PresenterComponent getPresenterComponent(EditText editText, TextView textView) {

        viewComponent = DaggerViewComponent.builder()
                .viewModule(new ViewModule(editText, textView))
                .build();

        presenterComponent = DaggerPresenterComponent.builder()
                .modelComponent(modelComponent)
                .viewComponent(viewComponent)
                .presenterModule(new PresenterModule())
                .build();

        return presenterComponent;
    }
}
