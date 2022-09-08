module com.example.listenersdemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.listenersdemo to javafx.fxml;
    exports com.example.listenersdemo;
}