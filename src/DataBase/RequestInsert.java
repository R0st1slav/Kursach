package DataBase;
import controllers.DialogWindow;
import getInfo.StudentInfo;
import java.sql.*;

public class RequestInsert {


    //Добавление в таблицу данных
    public static void addNewStudent(StudentInfo student) throws SQLException{
        Connect.statmt.execute("insert into Student (FIO, Birthday, NSpec, idGroup)"+
                "values ('"+ student.getFio() + "'," + student.getBirthday() + ",'" + student.getSpec() + "'," +
                 student.getIdGroup() + ");");

    }



    public static void AddKarma(StudentInfo student) throws SQLException{

        int id = RequestSelect.getIdStud(student);

        if(student.getIdGroup() == 10){
            Connect.statmt.execute("insert into Karma values (0, 0, "+ id + ", 7);" );
            Connect.statmt.execute("insert into Karma values (0, 0, "+ id + ", 8);" );

        }
        else if(student.getIdGroup() == 11){
            Connect.statmt.execute("insert into Karma values (0, 0,"+ id + ", 1);" );
            Connect.statmt.execute("insert into Karma values (0, 0,"+ id + ", 2);" );
        }

        else if(student.getIdGroup() == 12){
            Connect.statmt.execute("insert into Karma values (0, 0, "+ id + ", 3);" );
            Connect.statmt.execute("insert into Karma values (0, 0, "+ id + ", 4);" );
        }
        else if(student.getIdGroup() == 13){
            Connect.statmt.execute("insert into Karma values (0, 0, "+ id + ", 5);" );
            Connect.statmt.execute("insert into Karma values (0, 0,"+ id + ", 6);" );
        }
        else{
            DialogWindow.showErrorDialog("Такой группы нет");
        }
    }


}
