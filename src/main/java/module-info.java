module com.example.interfaces_graphique_javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.interfaces_graphique_javafx to javafx.fxml;
    exports com.example.interfaces_graphique_javafx;
}