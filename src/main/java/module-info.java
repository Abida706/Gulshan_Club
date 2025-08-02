module com.example.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gulshan_club to javafx.fxml;
    exports com.example.gulshan_club;
}