package Advance_Java_Learning;
import java.sql.*;
import java.util.Scanner;

import static java.lang.Class.forName;
class B{
    static int y=10;
    static {
        System.out.println("B is loaded...");
    }
}
class  A {
    static B b;
    static int x = 20;
    static {
        System.out.println("CLass A is loading"+b.y);
    }
}
public class MyFirstJdbc{
//    static A a;
//    static {
//        System.out.println("MyFirstJdbc is loaded.....");

//    }
    public static void main(String[] args) {
        Connection con=null;
        try{
//
//            01. REGISTERING THE DRIVER MANGER WITH THE DRIVER BY LOADING THE DRIVER CLASS DYNAMICALLY


//            System.out.println("enter the name of driver ");
//            String driver = sc.next();
//            Class.forName(driver);
            Class.forName("com.mysql.cj.jdbc.Driver"); //DYNAMICALLY
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());  //MANUALLY (we cannot change it at runtime)
//            02.GET THE CONNECION ACCORDING TO THE DRIVER
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/androjavatech4u",
                    "root","1234");
//            03.GETTING HTE REQUIRED STATEMENT

            Statement s = con.createStatement();
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


//            04. EXECUTE THE QUERY



//          //
            //long i =s.executeUpdate("insert into employee values(1,'Manoj Jawariya','Police department',40000,'Kanadiya " +
//                    "police line')");
            PreparedStatement  preparedStatement= con.prepareStatement("inset into employee value(?,?,?,?,?)");
//            After running setInt() method we pushhed th data into the buffer memory not in the database
//            Because prepared statement is precompiled means compile once use again and again
//            we execute the executeUpdate() to execute in the database
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,department);
            preparedStatement.setFloat(4,salary);
            preparedStatement.setString(5,address);
            int i =preparedStatement.executeUpdate();
            if(i>0){
                System.out.println("Record Inserted");
            }
            else{
                System.out.println("SomeTHing went wrong");
            }
            ResultSet rs = s.executeQuery("select * from employee");
//            resultset is a interface whose implementation is provided by different different vendors accordingly
//            An implementing object of these inteface is responsible for creating a db specific buffer by which we
//            can traverse the data one by one
//                iNTERNALLY RESULTSET USES THE CONCEPT OF RECORD POINTER TO TRAVERS THE ELEMENT
            while (rs.next()){
                    System.out.println(rs.getInt("emp_id"));
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("department"));
                    System.out.println(rs.getFloat("salary"));
                    System.out.println(rs.getString("address"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
//        05.CLOSE THE CONNECTION
        finally{
            try{
                con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}
