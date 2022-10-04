package assignment6;

import assignment6.Form.FormController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<Subject> table;

    @FXML
    private TableColumn<Subject, Integer> idColumn;

    @FXML
    private TableColumn<Subject, String> nameColumn;

    private ObservableList<Subject> subjectsList;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;


    @FXML
    private AnchorPane ap;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        subjectsList = FXCollections.observableArrayList(
                new Subject(1, "Chau"),
                new Subject(2, "Chuong")
        );
        idColumn.setCellValueFactory(new PropertyValueFactory<Subject, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Subject, String>("name"));
        table.setItems(subjectsList);
    }

    public void add (ActionEvent e){
        Subject newSubject = new Subject();
        newSubject.setId(Integer.parseInt(txtId.getText()));
        newSubject.setName(txtName.getText());
        subjectsList.add(newSubject);
    }


    public void changeSceneSubjectDetail(ActionEvent e) throws IOException {
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../Form/FormFx.fxml"));
        Parent subjectViewParent = loader.load();
        Scene scene = new Scene(subjectViewParent);
        FormController controller = loader.getController();
        Subject selected = table.getSelectionModel().getSelectedItem();
        controller.setSubject(selected);
        stage.setScene(scene);
    }

}