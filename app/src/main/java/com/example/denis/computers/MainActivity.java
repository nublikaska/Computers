package com.example.denis.computers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.MVP.Interfaces.Presenter;
import com.example.denis.computers.MVP.ModelImpl;
import com.example.denis.computers.MVP.PresenterImpl;
import com.example.denis.computers.MVP.ViewImpl;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    public MainActivity() {

    }

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.editText)
    EditText editText;

    @BindView(R.id.ButtonRefresh)
    Button buttonRefresh;

    Presenter presenter;

    private int count = 0;
    private int totalPage = 574;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        presenter = App.getPresenterComponent(editText, textView).getPresenter();

//        com.example.denis.computers.MVP.Interfaces.View view = new ViewImpl(editText, textView);
//        Model model = new ModelImpl();
//        PresenterImpl presenter = new PresenterImpl(view, model);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id.ButtonRefresh):
                        presenter.RefreshPage();
                        break;
                }
            }
        };

        buttonRefresh.setOnClickListener(onClickListener);

    }
}
