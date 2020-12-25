package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CrTest {
	@FXML
	private TextField nametech;

	public void addTech() {
		System.out.println(nametech.getText());
	}

}
