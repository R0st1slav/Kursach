package DataBase;

import getInfo.StudentInfo;

import java.sql.SQLException;

public class RequestDelete {


    public static void deleteStudent(StudentInfo student) throws SQLException {
        Connect.statmt.execute("delete from Student where FIO= '" + student.getFio() + "';");
    }

    public static void deleteKarm(StudentInfo student) throws SQLException{
        int id = RequestSelect.getIdStud2(student);

        Connect.statmt.execute("delete from Karma where idStud == " + id + ";");

    }

    public static void goodByeStudent() throws SQLException{
        Connect.statmt.execute("delete from Karma where grade < 3;");
    }
}
