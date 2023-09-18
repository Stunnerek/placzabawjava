module com.example.placzabaw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.placzabaw to javafx.fxml;
    exports com.example.placzabaw;
}