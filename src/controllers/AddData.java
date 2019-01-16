package controllers;

import DataBase.RequestInsert;
import DataBase.RequestSelect;
import University.SpecUniversity;
import getInfo.StudentInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.*;
import sample.RandomData;

import java.sql.SQLException;

//Контроллер диалогового окна AddData
public class AddData extends Init {


    private static ObservableList<String> specialty = FXCollections.observableArrayList(
          "Architecture", "Programming", "Engeenering", "Linguistics"
    );

    @FXML
    private void initialize(){
        comboSpec.setItems(specialty);
    }

    public void Add(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String fio = fio_st.getText();
        int birthday = Integer.parseInt(birthday_st.getText());
        String spec = comboSpec.getValue();

        int idGroup = SpecUniversity.getGroupId(spec);
        if(idGroup == 0){
            DialogWindow.showErrorDialog("Такой специальности нет в универститете");
        }
        else {
            StudentInfo newStudent = new StudentInfo(fio, birthday, spec, idGroup);
            RequestInsert.addNewStudent(newStudent);
            RequestInsert.AddKarma(newStudent);
            MainController.student.clear();
            RequestSelect.StudTable();
            MainController.groups.clear();
            RequestSelect.GroupTable();
            MainController.karma.clear();
            RequestSelect.KarmaTable();
            MainController.result.clear();
            RequestSelect.ResultTable();
            CloseWindow(actionEvent);
        }
    }

    public void CloseWindow(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.hide();
    }

    public void FillData(ActionEvent actionEvent) {
        fio_st.setText(RandomData.randomString());
        birthday_st.setText(String.valueOf(RandomData.randomNumber(2000, 2005)));
    }
}
