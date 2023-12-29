module com.example.navigationpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.navigationpage to javafx.fxml;
    exports com.example.navigationpage;
}