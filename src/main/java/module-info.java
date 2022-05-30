module br.com.iterasys.priemeiro {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencsv;


    opens br.com.iterasys.priemeiro to javafx.fxml;
    exports br.com.iterasys.priemeiro;
}