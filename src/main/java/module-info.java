module cloud.tamk.days.dayshelper {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;

    opens cloud.tamk.days.dayshelper to javafx.fxml;
    exports cloud.tamk.days.dayshelper;
}