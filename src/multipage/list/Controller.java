package multipage.list;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import multipage.Main;

import java.awt.event.ActionEvent;
import java.util.Stack;

public class Controller {


    public void goToForm(javafx.event.ActionEvent actionEvent)throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/2.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm môn học ");
        Main.rootStage.setScene(listScene);

    }
}
