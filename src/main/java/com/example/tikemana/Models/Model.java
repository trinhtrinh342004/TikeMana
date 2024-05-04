package com.example.tikemana.Models;

import com.example.tikemana.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    private Model(){
        this.viewFactory = new ViewFactory();
    }

    public static synchronized Model getInstance(){
        if (model == null){
            model = new Model();
        }

        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
