module com.example.driveven {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.driveven to javafx.fxml;
    exports com.example.driveven;
}