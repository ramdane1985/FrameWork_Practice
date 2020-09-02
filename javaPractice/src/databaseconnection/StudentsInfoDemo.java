package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentsInfoDemo {
    public static void main(String[] args) throws SQLException {
        //JDBC connection
        String url =  "jdbc:mysql://localhost:3306/ramdane2?serverTimezone=UTC";
        String user = "root";
        String password = "RootRoot1985";

        Connection connection = null;
        Statement statement = null;

        StudentsInfo student1 = new StudentsInfo("ramdane","ameur","90","101");
        StudentsInfo student2 = new StudentsInfo("amina","hammiche","95","102");
        StudentsInfo student3 = new StudentsInfo("mark","mark","85","103");
        StudentsInfo student4 = new StudentsInfo("robert","robert","80","104");

        ArrayList<StudentsInfo>student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);

        try{
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            //insert into tableName()
            for (StudentsInfo st:student) {
                String query = "insert into studentsInfo(first name ,last name ,score , id) " +  "   values(" + st.getFirstName() + ",'" + st.getLastName() + "'," + st.getScore()
                        + ",'" + st.getId() + "')      ";
                statement.execute(query);


            }
        }catch (Exception e){
            //e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }

    }

}
