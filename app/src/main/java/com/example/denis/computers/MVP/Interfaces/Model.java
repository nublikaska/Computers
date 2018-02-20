package com.example.denis.computers.MVP.Interfaces;

import com.example.denis.computers.App;
import com.example.denis.computers.model.Computers;

import io.reactivex.Observable;

/**
 * Created by Denis on 18.02.2018.
 */

public interface Model {
    Observable<Computers> getComputers(int page);
}
