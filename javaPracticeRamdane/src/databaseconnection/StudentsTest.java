package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentsTest {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ramdane2?serverTimezone=UTC";
        String user = "root";
        String password = "RootRoot1985";

        Connection connection = null;
        Statement statement = null;


        Students shakir = new Students(111, "Shakir", "Jahangir", "8776633373", "AAA");
        Students joney = new Students(222, "Joney", "Hossain", "23333355", "AAB");

        Students mobin = new Students(333, "Mobin", "Abdullah", "11111111111", "ABA");

        Students ramdan = new Students(444, "Ramdane", "amure", "7777777777", "ACA");
        Students sumeta = new Students(555, "Sumetro", "pnt", "222222", "AAD");
        Students lemlem = new Students(777, "LemLem", "oncall", "888888", "AAC");


//        System.out.println(ramdan.getFirstName());
//        System.out.println(ramdan.getLastName());
//        System.out.println(mobin.getFirstName());

        ArrayList<Students> stu = new ArrayList<>();

        stu.add(shakir);
        stu.add(joney);
        stu.add(mobin);
        stu.add(ramdan);
        stu.add(sumeta);
        stu.add(lemlem);

        try {
            connection = DriverManager.getConnection(url, user, password);//creating connection to database
            statement = connection.createStatement();//

            for (Students st : stu) {
               String query = "insert into students(id, firstName, lastName, contactNumber,grades) " +
                        "   values(" + st.getId() + ",'" + st.getFirstName() + "','" + st.getLastName()
                        + "','" + st.getContactNumber() + "','"+st.getGrades()+"')      ";
//                String query1 = "update students set firstname='king' where id = 111 ;";
//                String query2 = "update students set contactnumber='xxxxxxxxxx' where id = 777 ;";
//                statement.execute(query1);
//                statement.execute(query2);

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("SQLIntegrityConstraintViolationException");


        } finally {

            statement.close();
            connection.close();

        }
    }

}