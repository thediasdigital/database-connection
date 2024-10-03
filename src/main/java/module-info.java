module com.example.databaseconnection {
    requires javafx.controls;
    requires javafx.fxml;
    // Very Important to add
    requires java.sql;


    opens com.example.databaseconnection to javafx.fxml;
    exports com.example.databaseconnection;
}