/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javamvp;

/**
 *
 * @author vinsfran
 */
public class Presenter {

    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void login(String password) {
        String result = "Pasword incorrecto";
        
        if(model.getPassword().equals(password)){
            result = "Pasword correcto";
            view.hideInputField();
        }
        
        view.udateStaus(result);
    }
}
