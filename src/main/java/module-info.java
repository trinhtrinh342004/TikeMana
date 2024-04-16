module com.example.tikemana {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;

    opens com.example.tikemana to javafx.fxml;
    exports com.example.tikemana;
    exports com.example.tikemana.Controllers;
    exports com.example.tikemana.Controllers.Admin;
    exports com.example.tikemana.Controllers.Manager;
    exports com.example.tikemana.Controllers.Staff;
    exports com.example.tikemana.Models;
    exports com.example.tikemana.Views;
}