package ExceptionEdureka;

public class SampleExcecption {
    public static void main(String[] args) {
        String str = null;
//        System.out.println(str.length());
//        This will give us exception because the string is null and we are trying to retrieve the length of the string
//        It will throw the null pointer exception  bcz the length of the string is null
        try{
            int a = 30 ,b=0;
            int c = a/b;
            System.out.println("result "+ c);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide a number by zero");
        }
//        first our program throws the exception and after that the catch will handle that exception
        try{
            int num  =Integer.parseInt("Dipndra");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        try {
            int a[]= new int[5];
            a[7] = 9; // this will cause the ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception");
        }

//        Nested try method
        System.out.println("Nested try catch has started running");
        try{
            try{
                int num  =Integer.parseInt("Dipndra");
                System.out.println(num);
            }
            catch(NumberFormatException e){
                System.out.println("Number Format Exception");
            }
            try{
                int a[]= new int[5];
                a[7] =8;

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception Handeled");
            }
            System.out.println("Other statement");
        }
        catch (Exception e ){
            System.out.println("Handeled and recovered");
        }

        System.out.println("MultiCatche exception");
        try{
            int num  =Integer.parseInt("Dipndra");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        catch(Exception e){
            System.out.println("Handeled");
        }
        System.out.println("Other Statement");
    }
}
