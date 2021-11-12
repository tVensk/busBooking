module com.example.driveven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.driveven to javafx.fxml;
    exports com.example.driveven;
}