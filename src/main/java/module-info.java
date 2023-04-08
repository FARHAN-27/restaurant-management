module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens classes to javafx.fxml;
    exports classes;
    exports controller;
    opens controller to javafx.fxml;
}