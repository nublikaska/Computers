package com.example.denis.computers.MVP;

import com.example.denis.computers.App;
import com.example.denis.computers.MVP.Interfaces.Model;
import com.example.denis.computers.MVP.Interfaces.Presenter;
import com.example.denis.computers.MVP.Interfaces.View;
import com.example.denis.computers.model.Computers;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Denis on 18.02.2018.
 */

public class PresenterImpl implements Presenter {
    Model model;

    View view;

    public PresenterImpl(View view, Model model) {
        this.view = view;
        this.model = model;
    }



    @Override
    public void RefreshPage() {
        model.getComputers(view.getPage())
                .subscribe(new Observer<Computers>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Computers computers) {
                        view.showPage(computers);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }
}
