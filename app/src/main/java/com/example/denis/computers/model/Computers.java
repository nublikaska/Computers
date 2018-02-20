package com.example.denis.computers.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis on 15.02.2018.
 */

public class Computers {

    @SerializedName("items")
    @Expose
    private List<Computer> computers = null;

    @SerializedName("page")
    @Expose
    private String page;

    @SerializedName("offset")
    @Expose
    private String offset;

    @SerializedName("total")
    @Expose
    private String total;

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
