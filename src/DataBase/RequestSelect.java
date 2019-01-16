package DataBase;

import controllers.Init;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import controllers.MainController;
import getInfo.GroupInfo;
import getInfo.KarmaInfo;
import getInfo.StudentInfo;

public class RequestSelect extends Init {

    //Тут запросы для отображения данных в TableView
    public static void  StudTable() throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select * from Student ;");
            while(resultSet.next()){
                MainController.student.add(new StudentInfo(
                        resultSet.getString("FIO"),
                        resultSet.getInt("Birthday"),
                        resultSet.getString("NSpec"),
                        resultSet.getInt("idGroup"))
                );
            }
    }

    public static void GroupTable() throws SQLException {
        ResultSet resultSet = Connect.statmt.executeQuery("select NGroup, FIO from Student natural join Grp " +
                "where NSpec == NSpec;");

        while(resultSet.next()){
            MainController.groups.add(new GroupInfo(
                    resultSet.getString("NGroup"),
                    resultSet.getString("FIO")

            ));
        }

    }

    public static void KarmaTable() throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select FIO, NDisc, count, NGroup from Karma " +
                "natural join Student natural join Disc natural join Grp;");
        while(resultSet.next()){
            MainController.karma.add(new KarmaInfo(
                    resultSet.getString("FIO"),
                    resultSet.getString("NDisc"),
                    resultSet.getString("NGroup"),
                    resultSet.getInt("count"))
            );

        }
    }

    public static void ResultTable() throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select FIO, NDisc, grade, NGroup from Karma " +
                "natural join Student natural join Disc natural join Grp;");

        while(resultSet.next()){
            MainController.result.add(new KarmaInfo(
                    resultSet.getString("FIO"),
                    resultSet.getString("NDisc"),
                    resultSet.getString("NGroup"),
                    resultSet.getFloat("grade"))
            );
        }
    }

    //хехе немного покостылим
    public static int getIdStud() throws SQLException {
        ResultSet resultSet = Connect.statmt.executeQuery("select idStud from Student;");
        List<Integer> listIdStud = new ArrayList<>();
        while (resultSet.next()) {
            int idStud = resultSet.getInt("idstud");
            listIdStud.add(idStud);
        }
        Random generator = new Random();
        int randomIndex = generator.nextInt(listIdStud.size());
        return listIdStud.get(randomIndex);
    }

    public static int getIdStud(StudentInfo student) throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select idStud from Student where FIO == '"
                + student.getFio() +"';");

        return resultSet.getInt("idStud");



    }

    public static int getIdStud2(StudentInfo student) throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select idStud from Student where FIO == '"
                + student.getFio() +"';");

       while(resultSet.next()){
          int id = resultSet.getInt("idStud");

          return id;

       }
      return 0;
    }

    public static int getIdStud3(String fio) throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select idStud from Student where FIO == '"
                + fio +"';");

        return resultSet.getInt("idStud");
    }


    public static int getMaxCount(KarmaInfo karmaInfo) throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select max(count) from Karma natural join Grp " +
                "natural join Disc where NGroup ==" +
                "'" + karmaInfo.getNameGroup() + "';");
       return resultSet.getInt("max(count)");


    }

    public static int getCount(KarmaInfo karmaInfo) throws SQLException{
        ResultSet resultSet = Connect.statmt.executeQuery("select count from Karma natural join Student" +
                " where FIO == '" + karmaInfo.getFio() + "';");
        return resultSet.getInt("count");
    }





}

