module com.example.dictionarysandeep11dec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictionarysandeep11dec to javafx.fxml;
    exports com.example.dictionarysandeep11dec;
}