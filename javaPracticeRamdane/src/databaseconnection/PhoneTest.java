package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args)throws Exception {

        String url = "jdbc:mysql://localhost:3306/ramdane2?serverTimezone=UTC";
        String user ="root";
        String password ="RootRoot1985";

        Connection connection = null;
        Statement statement = null;

        Phone iPhone = new Phone(001,"apple","8inches",1400);
        Phone samsung  = new Phone(002,"samsung","7inches",1200);
        Phone lg = new Phone(003,"lg","7inches",1100);
        Phone nokia = new Phone(004,"nokia","7inches",1000);

        ArrayList<Phone>phones = new ArrayList<>();


        phones.add(iPhone);
        phones.add(samsung);
        phones.add(lg);
        phones.add(nokia);

        try{
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            for (Phone ph:phones) {
                String query = "insert into Phone(id, phoneBrand, phoneSize, phonePrice) " +
                        "   values(" + ph.getId() + ",'"  + ph.getPhoneBrand() +
                        "','" + ph.getPhoneSize()+"', " + ph.getPhonePrice() + ") ";
                statement.execute(query);

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }

    }
}
