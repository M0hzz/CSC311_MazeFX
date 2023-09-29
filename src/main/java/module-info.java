module com.example.csc311_mazefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_mazefx to javafx.fxml;
    exports com.example.csc311_mazefx;
}