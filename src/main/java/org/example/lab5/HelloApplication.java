package org.example.lab5;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        // vbox
        VBox vbox = new VBox();

        //label
        Label l1 = new Label("Census");
        root.getChildren().add(l1);


        HBox hbox1 = new HBox();

        //label
        Label l2 = new Label("Enter Your Name");
        root.getChildren().add(l2);

        //text field
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        //button
        Button button2 = new Button("Save Name");
        button2.setOnAction(event -> buttonClicked2(nameField.getText()));

        hbox1.getChildren().add(nameField);
        hbox1.getChildren().add(button2);


        VBox vbox1 = new VBox();
        //label
        Label l5 = new Label("Enter Your age");
        vbox1.getChildren().add(l5);

        //text field
        TextField ageField = new TextField();
        nameField.setPromptText("Enter your age");

        //button
        Button button3= new Button("Save age");
        button3.setOnAction(event -> buttonClicked3(ageField.getText()));

        HBox hbox2 = new HBox();
        hbox2.getChildren().add(ageField);
        hbox2.getChildren().add(button3);


        //label
        Label l3 = new Label("What is your preferred gender");
        vbox.getChildren().add(l3);

        //radio button
        final ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Male");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);

        RadioButton rb2 = new RadioButton("Female");
        rb2.setToggleGroup(group);

        RadioButton rb3 = new RadioButton("Non-binary");
        rb3.setToggleGroup(group);

        RadioButton rb4 = new RadioButton("Other");
        rb4.setToggleGroup(group);

        vbox.getChildren().addAll(rb1, rb2, rb3, rb4);


        //label
        Label l4 = new Label("");
        vbox.getChildren().add(l4);




        // check boxw

        HBox hbox = new HBox();
        CheckBox checkBox = new CheckBox("Is this the first time filling out this census form(check if yes)");
        checkBox.setSelected(false);
        checkBox.setOnAction(event -> {
            System.out.println("This is your first time filling this form out! " + checkBox.isSelected());
        });
        checkBox.setOnAction(this::checkBox);
        hbox.getChildren().add(checkBox);

        root.getChildren().addAll(hbox1,vbox1,hbox2,  vbox, hbox);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();


    }

    public void buttonClicked2(String text) {
        System.out.println("Your name is: " + text);
    }
    public void buttonClicked3(String text) {
        System.out.println("Your age is: " + text);
    }
    private void checkBox(ActionEvent event) {
        System.out.println("This is your first time filling this form out!");
    }
    public static void main(String[] args) {
        launch();
    }
}