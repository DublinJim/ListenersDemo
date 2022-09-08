package com.example.listenersdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class HelloController implements Initializable {

    public Button btn1;
    public Label lbl1;
    public Label lbl2;


    public Pane mainStage;
    public Button btn2;
    public Button btn3;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lbl1.setText("One");
        lbl2.setText("Two");

        setUpButtons();


    }

    private void setUpButtons() {
        btn1.setText("Button 1");
        btn2.setText("Button 2");
        btn3.setText("Button 3");

        btn1.setFont(new Font("Arial", 14));
        btn2.setFont(new Font("Arial", 14));
        btn3.setFont(new Font("Arial", 14));
        Image picForButton1 = new Image("icons8-bear-24.png");
        Image picForButton2 = new Image("icons8-bear-32.png");
        Image picForButton3 = new Image("icons8-bear-50.png");

        ImageView button1Icon = new ImageView(picForButton1);
        ImageView button2Icon = new ImageView(picForButton2);
        ImageView button3Icon = new ImageView(picForButton3);

        button3Icon.setFitHeight(24);
        button3Icon.setFitWidth(24);

        button2Icon.setFitHeight(24);
        button2Icon.setFitWidth(24);

        button1Icon.setFitHeight(24);
        button1Icon.setFitWidth(24);

        btn1.setGraphic(button1Icon);
        btn2.setGraphic(button2Icon);
        btn3.setGraphic(button3Icon);
    }
}