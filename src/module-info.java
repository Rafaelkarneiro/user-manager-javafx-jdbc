module user_manager_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
	opens application to javafx.graphics, javafx.fxml;
	exports gui to javafx.fxml;

	opens gui to javafx.fxml;
}
