package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AdminHomeFormController {
    public Button btnRecordAttendance;
    public Button btnViewReports;
    public Button btnUserProfile;
    public Button btnManageUsers;
    public Button btnBackupRestore;
    public Button btnSignOut;
    public Label lblGreeting;
    public Label lblHover;

    public void initialize(){
        final String initialText = lblHover.getText();

        btnRecordAttendance.setOnMouseEntered(event -> displayHoveringText((Button) event.getSource()));
        btnViewReports.setOnMouseEntered(event -> displayHoveringText((Button) event.getSource()));
        btnUserProfile.setOnMouseEntered(event -> displayHoveringText((Button) event.getSource()));
        btnManageUsers.setOnMouseEntered(event -> displayHoveringText((Button) event.getSource()));
        btnBackupRestore.setOnMouseEntered(event -> displayHoveringText((Button) event.getSource()));
        btnSignOut.setOnMouseEntered(event -> displayHoveringText((Button) event.getSource()));

        btnRecordAttendance.setOnMouseExited(event -> lblHover.setText(initialText));
        btnViewReports.setOnMouseExited(event -> lblHover.setText(initialText));
        btnUserProfile.setOnMouseExited(event -> lblHover.setText(initialText));
        btnManageUsers.setOnMouseExited(event -> lblHover.setText(initialText));
        btnBackupRestore.setOnMouseExited(event -> lblHover.setText(initialText));
        btnSignOut.setOnMouseExited(event -> lblHover.setText(initialText));


    }

    private void displayHoveringText(Button source) {
        lblHover.setText(source.getAccessibleText());
    }

    public void btnSignOut_OnAction(ActionEvent actionEvent) {
    }

    public void btnBackupRestore_OnAction(ActionEvent actionEvent) {
    }

    public void btnManageUsers_OnAction(ActionEvent actionEvent) {
    }

    public void btnUserProfile_OnAction(ActionEvent actionEvent) {
    }

    public void btnViewReports_OnAction(ActionEvent actionEvent) {
    }

    public void btnRecordAttendance_OnAction(ActionEvent actionEvent) {
    }
}
