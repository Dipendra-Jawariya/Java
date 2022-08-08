package Advance_Java_Learning;

import java.sql.*;
import java.util.Scanner;

public class SecondJDBC_Connection {
    public static void main(String[] args) {
        Connection con =null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/androjavatech4u"
                    ,"root","1234");
//            Statement s = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the employee id");
            int id = sc.nextInt();
            System.out.println("Enter the employee name");
            String name = sc.next();
            System.out.println("Enter the employee department");
            String department = sc.next();
            System.out.println("Enter the employee salary");
            float salary = sc.nextFloat();
            System.out.println("Enter the employee address");
            String address = sc.next();

            PreparedStatement preparedStatement = con.prepareStatement("insert into employee value(?,?,?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,department);
            preparedStatement.setFloat(4,salary);
            preparedStatement.setString(5,address);
            int i =preparedStatement.executeUpdate();
            if (i>0){
                System.out.println("Record Inserted");
            }
            else{
                System.out.println("SomeThing went wrong");
            }

            ResultSet rs  =preparedStatement.executeQuery("select * from employee");
        }
        catch (Exception e){
            System.out.println(e);
        }
//        finally {
//            try{
////                con.close();
//            }
//            catch (SQLException e){
//                e.printStackTrace();
//            }
//        }

    }
}
