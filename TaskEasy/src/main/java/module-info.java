module com.mycompany.taskeasy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.taskeasy to javafx.fxml;
    exports com.mycompany.taskeasy;
}
