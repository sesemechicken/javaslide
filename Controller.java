package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.util.regex.Pattern;

public class Controller {
    @FXML
    private Slider slide;
    @FXML
    private Text text;
    @FXML
    private RadioButton r14;
    @FXML
    private RadioButton r12;
    @FXML
    private RadioButton r10;
    @FXML
    private RadioButton r8;
    @FXML
    private RadioButton r6;
    @FXML
    private RadioButton r4;
    @FXML
    private RadioButton r2;
    @FXML
    private RadioButton r0;
    @FXML
    private ToggleGroup rgroup;


    @FXML
    protected void setheight() {

        Object height;
        if (rgroup.selectedToggleProperty().getValue()==null){
            height=slide.getValue();
            height = height.toString().split(Pattern.quote("."))[0];
        }else {
            height=rgroup.getSelectedToggle().toString().split("[']")[1].split(" ")[0];
        }
        text.setText(height.toString()+" ft");
        System.out.println(height);
    }

    public void cleartoggle() {
        rgroup.selectToggle(null);
        setheight();
    }
}