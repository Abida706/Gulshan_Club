module com.example.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;



    opens com.example.gulshan_club to javafx.fxml, javafx.base;

    opens com.example.gulshan_club.CommonClass to javafx.fxml;
    exports com.example.gulshan_club.CommonClass;


    opens com.example.gulshan_club.Marketing_Manager.Controller to javafx.fxml;
    exports com.example.gulshan_club.Marketing_Manager.Controller;

    opens com.example.gulshan_club.Marketing_Manager.Model to javafx.fxml;
    exports com.example.gulshan_club.Marketing_Manager.Model;



    opens com.example.gulshan_club.Security_Supervisor.Model to javafx.fxml;
    exports com.example.gulshan_club.Security_Supervisor.Model;

    opens com.example.gulshan_club.Security_Supervisor.Controller to javafx.fxml;
    exports com.example.gulshan_club.Security_Supervisor.Controller;

    opens com.example.gulshan_club.AccountsManager.Controller to javafx.fxml;
    exports com.example.gulshan_club.AccountsManager.Controller;

    opens com.example.gulshan_club.HRManager.Controller to javafx.fxml;
    exports com.example.gulshan_club.HRManager.Controller;


    exports com.example.gulshan_club;



}