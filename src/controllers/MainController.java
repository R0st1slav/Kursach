package controllers;

import DataBase.*;
import University.KarmaCount;
import University.ResultUniversity;
import getInfo.DisciplineInfo;
import getInfo.GroupInfo;
import getInfo.KarmaInfo;
import getInfo.StudentInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

import java.io.IOException;


//Основной контроллер приложения
public class MainController extends Init {
        public static ObservableList<StudentInfo> student = FXCollections.observableArrayList();
        public static ObservableList<GroupInfo> groups = FXCollections.observableArrayList();
        public static ObservableList<KarmaInfo> karma = FXCollections.observableArrayList();
        public static ObservableList<KarmaInfo> result = FXCollections.observableArrayList();



   @FXML
   private void initialize() throws SQLException, ClassNotFoundException {
      Connect.Conn();
      RequestSelect.StudTable();
      columnFio.setCellValueFactory(new PropertyValueFactory<>("fio"));
      columnBirthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));
      columnSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
      students.setItems(student);

      RequestSelect.GroupTable();
      columnFIO.setCellValueFactory(new PropertyValueFactory<>("studentFio"));
      columnGroup.setCellValueFactory(new PropertyValueFactory<>("nameGroup"));
      Group.setItems(groups);

      RequestSelect.KarmaTable();
      karmaStudent.setCellValueFactory(new PropertyValueFactory<>("fio"));
      karmaDiscipline.setCellValueFactory(new PropertyValueFactory<>("nameDisc"));
      karmaGroup.setCellValueFactory(new PropertyValueFactory<>("nameGroup"));
      karmaCount.setCellValueFactory(new PropertyValueFactory<>("karma"));
      Karma.setItems(karma);

      RequestSelect.ResultTable();
      resultStudent.setCellValueFactory(new PropertyValueFactory<>("fio"));
      resultDiscipline.setCellValueFactory(new PropertyValueFactory<>("nameDisc"));
      resultGroup.setCellValueFactory(new PropertyValueFactory<>("nameGroup"));
      resultGrade.setCellValueFactory(new PropertyValueFactory<>("grade"));
      Result.setItems(result);


   }


   public void AddData(ActionEvent actionEvent) throws IOException {
      DialogWindow dialogWindow = new DialogWindow();
      dialogWindow.showDialog(actionEvent, "../fxml/AddData.fxml");
   }

   public void DeleteData(ActionEvent actionEvent) throws SQLException{
      StudentInfo selectedStudent = students.getSelectionModel().getSelectedItem();
      try{
         RequestDelete.deleteStudent(selectedStudent);
         RequestDelete.deleteKarm(selectedStudent);


      }
      catch(NullPointerException e){
         DialogWindow.showErrorDialog("Выберите студента из таблицы");
      }

      student.clear();
      RequestSelect.StudTable();
      groups.clear();
      RequestSelect.GroupTable();
      karma.clear();
      RequestSelect.KarmaTable();


   }

   public void nextDay(ActionEvent actionEvent) throws SQLException {
      int randomKarma = KarmaCount.getKarma();
      KarmaInfo newKarma = new KarmaInfo(randomKarma);
      RequestUpdate.UpdateKarma(newKarma);
      karma.clear();
      RequestSelect.KarmaTable();

   }

   public void btnKarma(ActionEvent actionEvent) throws SQLException{

      KarmaInfo selectedKarma = Karma.getSelectionModel().getSelectedItem();

      try{
         RequestUpdate.updateGrade(selectedKarma);

         result.clear();
         RequestSelect.ResultTable();

      }catch(NullPointerException e){
         DialogWindow.showErrorDialog("Выберите значение из таблицы 'Начисление кармы' ");
      }

   }


   public void Clear(ActionEvent actionEvent) throws SQLException {
      RequestUpdate.clearGrades();
      result.clear();
      RequestSelect.ResultTable();
   }

   public void ClearKarma(ActionEvent actionEvent) throws SQLException {
      RequestUpdate.clearKarma();
      karma.clear();
      RequestSelect.KarmaTable();
   }

   public void goodBye(ActionEvent actionEvent) throws SQLException{
      RequestDelete.goodByeStudent();
      result.clear();
      RequestSelect.ResultTable();
   }

}