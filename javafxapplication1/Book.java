/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Book extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Experiment");
        
        Label label1 = new Label("Book Name: ");
        Label label2 = new Label("Student: ");
        Label label3 = new Label("Roll No: ");
        Label label4 = new Label("ISBN: ");
        Label label5 = new Label("Books_Borrowed: ");
        Label label6 = new Label("Books_Returned: ");
        
        TextField textfield1 = new TextField();
        TextField textfield2 = new TextField();
        TextField textfield3 = new TextField();
        TextField textfield4 = new TextField();
        TextField textfield5 = new TextField();
        TextField textfield6 = new TextField();
        
        Button submit = new Button("Submit");

        GridPane gridPane = new GridPane();

        gridPane.add(label1,       1, 0);
        gridPane.add(textfield1,   2, 0);
        gridPane.add(label2,       1, 1);
        gridPane.add(textfield2,   2, 1);
        gridPane.add(label3,       1, 2);
        gridPane.add(textfield3,   2, 2);
        gridPane.add(label4,       1, 3);
        gridPane.add(textfield4,   2, 3);
        gridPane.add(label5,       1, 4);
        gridPane.add(textfield5,   2, 4);
        gridPane.add(label6,       1, 5);
        gridPane.add(textfield6,   2, 5);
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.add(submit,       2, 7);

        Scene gridscene = new Scene(gridPane, 500, 500);
        primaryStage.setScene(gridscene);
        primaryStage.show();
       
        
       
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
