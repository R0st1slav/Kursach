package University;

import DataBase.RequestSelect;
import getInfo.KarmaInfo;

import java.sql.SQLException;

import java.lang.Math;

public class ResultUniversity {


    public static double Grade(KarmaInfo karmaInfo) throws SQLException{
        double maxCount = (double)RequestSelect.getMaxCount(karmaInfo);
        int count = RequestSelect.getCount(karmaInfo);
        return 5.0 * (Math.abs(count/maxCount));
    }

}
