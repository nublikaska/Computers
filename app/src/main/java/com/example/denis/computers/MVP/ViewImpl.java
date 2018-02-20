package com.example.denis.computers.MVP;

import android.widget.EditText;
import android.widget.TextView;

import com.example.denis.computers.MVP.Interfaces.View;
import com.example.denis.computers.model.Computer;
import com.example.denis.computers.model.Computers;

import javax.inject.Inject;

/**
 * Created by Denis on 18.02.2018.
 */

public class ViewImpl implements View {
    private EditText editText;
    private TextView textView;

    @Inject
    public ViewImpl(EditText editText, TextView textView) {
        this.editText = editText;
        this.textView = textView;
    }

    @Override
    public int getPage() {
        return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void showPage(Computers computers) {
        textView.setText(computers.getComputers().get(0).getName());
    }
}
