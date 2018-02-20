package com.example.denis.computers.Modules;
import android.widget.EditText;
import android.widget.TextView;

import com.example.denis.computers.MVP.Interfaces.View;
import com.example.denis.computers.MVP.ViewImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Denis on 20.02.2018.
 */
@Module
public class ViewModule {
    EditText editText;
    TextView textView;

    public ViewModule(EditText editText, TextView textView) {
        this.textView = textView;
        this.editText = editText;
    }

    @Provides
    View provideView() {
        return new ViewImpl(editText, textView);
    }
}
