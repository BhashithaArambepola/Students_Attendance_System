package Controller;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SplashScreenController {
    public Label lblStatus;
    public void initialize() {
        establishDBConnection();
    }

private void establishDBConnection(){
        lblStatus.setText("Establishing DataBase Connection...");
        new Thread(() -> {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("\"jdbc:mysql://localhost:3306/dep8_student_attendance", "root", "78527852");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getSQLState().equals("42000")){
                    Platform.runLater(this::loadImportDBForm);
                }
            }
        });

}

private void loadImportDBForm(){
//    new Thread(() -> {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Platform.runLater(() -> {

            try {
                Stage stage = new Stage();
                AnchorPane root = FXMLLoader.load(this.getClass().getResource("/View/UserHomeForm.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.sizeToScene();
                stage.setResizable(false);
                stage.centerOnScreen();
                stage.setTitle("Student Attendance: LogIn ");
                stage.show();
                ((Stage)lblStatus.getScene().getWindow()).close();

            } catch (IOException e) {
                e.printStackTrace();
            }
//        });
//    }).start();
//
}
}

