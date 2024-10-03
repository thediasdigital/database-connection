module com.example.databaseconnection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.databaseconnection to javafx.fxml;
    exports com.example.databaseconnection;
}