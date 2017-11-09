import java.util.Optional;

import javafx.application.Application;

import javafx.scene.control.TextInputDialog;

import javafx.stage.Stage;

public class Userrole extends Application {


    @Override
    public void start(Stage Primarystage) {


        int value = 0;


        TextInputDialog inputDialog = new TextInputDialog();

        inputDialog.setContentText("Please enter a number from 1 to 5 to declare one of the 5 user roles");

        Optional<String> input = inputDialog.showAndWait();

        String enteredValue = (String) (input.get());

        value = Integer.parseInt(enteredValue);


        switch (value) {

            case 1:

                System.out.println("Welcome Administrator!");

                break;

            case 2:
                System.out.println("Welcome Faculty!");
                break;

            case 3:
                System.out.println("Welcome Staff!");
                break;

            case 4:
                System.out.println("Welcome Student!");
                break;

            case 5:
                System.out.println("Welcome Guest!");
                break;

        }
    }
}
	
