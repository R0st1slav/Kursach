package DataBase;
import java.sql.*;
import java.util.Scanner;

public class Connect {
    public static Connection conn;
    public static Statement statmt;

    //Соединение с базой данных
    public static void Conn() throws ClassNotFoundException, SQLException{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:tables.db");
            statmt = conn.createStatement();
            System.out.println("Connected");

    }
    //Хз зачем он нужен и где его вызывать но это закрытие БД
    public static void Close() throws ClassNotFoundException, SQLException{
        conn.close();
        System.out.println("DataBase closed");
    }


}