package DataBase;

import University.ResultUniversity;
import getInfo.KarmaInfo;

import java.sql.SQLException;
import java.util.List;

public class RequestUpdate {

    public static void UpdateKarma(KarmaInfo karma) throws SQLException {
        Connect.statmt.execute("update Karma set count = count +" + karma.getKarma() + " where idStud =="
                + RequestSelect.getIdStud() + ";");
    }

    public static void updateGrade(KarmaInfo karmaInfo) throws SQLException{
        double grade = ResultUniversity.Grade(karmaInfo);
        Connect.statmt.execute("update Karma set grade == " + grade + " where idStud == '"
                + RequestSelect.getIdStud3(karmaInfo.getFio()) + "';");
    }

    public static void clearKarma() throws SQLException{
        Connect.statmt.execute("update Karma set count = 0;");
    }

    public static void  clearGrades() throws SQLException{
        Connect.statmt.execute("update Karma set grade = 0");
    }



}
