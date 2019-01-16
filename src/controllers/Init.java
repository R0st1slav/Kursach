package controllers;

import getInfo.DisciplineInfo;
import getInfo.GroupInfo;
import getInfo.KarmaInfo;
import getInfo.StudentInfo;
import javafx.fxml.FXML;
import javafx.scene.control.*;

//тут прописывается все что находится на граф интерфейсе
public abstract class Init {
    @FXML
    protected TextField fio_st;

    @FXML
    protected TextField birthday_st;

    @FXML
    protected ComboBox<String> comboSpec;

    @FXML
    protected Button add_button;

    @FXML
    protected TableView<StudentInfo> students;

    @FXML
    protected TableColumn<StudentInfo, String> columnFio;

    @FXML
    protected TableColumn<StudentInfo, Integer> columnBirthday;

    @FXML
    protected TableColumn<StudentInfo, String> columnSpec;

    @FXML
    protected TableView<GroupInfo> Group;

    @FXML
    protected TableColumn<GroupInfo, String> columnFIO;

    @FXML
    protected TableColumn<GroupInfo, String> columnGroup;

    @FXML
    protected TableView<KarmaInfo> Karma;

    @FXML
    protected TableColumn<KarmaInfo, String> karmaStudent;

    @FXML
    protected TableColumn<KarmaInfo, String> karmaDiscipline;

    @FXML
    protected TableColumn<KarmaInfo, String> karmaGroup;

    @FXML
    protected TableColumn<KarmaInfo, Integer> karmaCount;

    @FXML
    protected TableView<KarmaInfo> Result;

    @FXML
    protected TableColumn<KarmaInfo, String> resultStudent;

    @FXML
    protected TableColumn<KarmaInfo, String> resultDiscipline;

    @FXML
    protected TableColumn<KarmaInfo, String> resultGroup;

    @FXML
    protected TableColumn<KarmaInfo, Float> resultGrade;

    @FXML
    protected Button btnCancel;

    @FXML
    protected Button btnAdd;

    @FXML
    protected Button btnFillData;

    @FXML
    protected Button resultKarma;


}
