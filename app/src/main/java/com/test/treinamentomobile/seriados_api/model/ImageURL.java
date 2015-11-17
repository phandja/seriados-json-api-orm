package com.test.treinamentomobile.seriados_api.model;

import java.io.Serializable;

/**
 * Created by treinamentomobile on 11/17/15.
 */
public class ImageURL implements Serializable {

    private String medium;
    private String original;

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
