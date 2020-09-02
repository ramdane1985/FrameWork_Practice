package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class CarDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ramdane2?serverTimezone=UTC";
        String user ="root";
        String password ="RootRoot1985";

        Connection connection = null;
        Statement statement = null;

       Car number1 = new Car(001,"corola",2018,100);
        Car number2 = new Car(002,"accord",2019,120);
        Car number3 = new Car(003,"rio",2016,80);
        Car number4 = new Car(004,"sonata",2020,200);

        ArrayList<Car>Cars = new ArrayList<>();

        Cars.add(number1);
        Cars.add(number2);
        Cars.add(number3);
        Cars.add(number4);

        try{
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Car cr:Cars) {

                String query = "insert into car(id, model, year, numOfHorses) " +
                        "   values(" + cr.getId() + ",'" + cr.getModel() + "'," + + cr.getYear() +
                        "','" + cr.getNumOfHorses()+"') ";

            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }



    }
}
