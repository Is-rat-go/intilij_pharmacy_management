module com.example.pharmacy_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pharmacy_management to javafx.fxml;
    exports com.example.pharmacy_management;
}