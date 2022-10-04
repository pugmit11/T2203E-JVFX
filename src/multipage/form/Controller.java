package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {
    public void goToList(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/1.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm môn học ");
        Main.rootStage.setScene(listScene);
    }
}
