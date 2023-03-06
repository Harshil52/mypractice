module com.example.mypractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mypractice to javafx.fxml;
    exports com.example.mypractice;
}