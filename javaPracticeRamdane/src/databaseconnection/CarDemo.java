package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class CarDemo {
    public static void main (String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ramdane2?serverTimezone=UTC";
        String user ="root";
        String password ="RootRoot1985";

        Connection connection =null;
        Statement statement =null;
        Car toyota = new Car(001,"corola",2020,100);
        Car honda = new Car(002,"civic",2019,100);
        Car kia = new Car(003,"rio",2017,100);
        Car hyundai = new Car(004,"sonata",2016,100);

        ArrayList<Car>Cars = new ArrayList<>();

        Cars.add(toyota);
        Cars.add(honda);
        Cars.add(kia);
        Cars.add(hyundai);
        try{
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            for (Car cr:Cars) {
                String query = "insert into car(id, model, year, numOfHorses) " +
                        "   values(" + cr.getId() + ",'" + cr.getModel() + "',"  + cr.getYear() +
                        "," + cr.getNumOfHorses()+") ";
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

