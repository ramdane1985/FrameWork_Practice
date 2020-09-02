package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieDemo {
    public static void main(String[] args) throws Exception  {
        //JBCD connection

        String url = "jdbc:mysql://localhost:3306/ramdane2?serverTimezone=UTC";
        String user ="root";
        String password ="RootRoot1985";

        Connection connection = null;
        Statement statement = null;

        Movie titanic =new Movie(5,"titanic",1997,"Romnce","PG-13");
        Movie grudge =new Movie(6,"Grudge",2003,"horror","PG-13");
        Movie inception  =new Movie(5,"Inception",2010,"Thriller","PG-13");
        Movie  fatPizza=new Movie(5,"fatPizza",2021,"scary","PG-13");

        ArrayList<Movie> movies =new ArrayList<>();
        movies.add(titanic);
        movies.add(grudge);
        movies.add(inception);
        movies.add(fatPizza);

        try{
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            for (Movie mv : movies) {
                String query = "insert into movie(id, title, release_year, genre, mpaa_rating) " +
                        "   values(" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleaseYear()
                        + ",'" + mv.getGenre() + "','" + mv.getMpaaRating() + "')      ";
                statement.execute(query);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }



    }
}
