class Student{
    String name;
    int age ;
    public void getInfo(){
        System.out.println( this.name);
        System.out.println(this.age);
    }

//    1.Non parameterized constructor  -a constructor which has no arguments is known as non- parameterized constructor
//    It is invoked at the time of creating an object.if we don't create one then it is created by the java by default
//    For parameterized constructor the the driver code will change and we take parameter in the constructor function
//        Student(String name , int age){
////            System.out.println("Constructor called");  //the constructor will be called when the object is instanciated
//                this.name = name;
//                this.age = age;
//                this.name and this.age is the name of the object and the name and age is the name of the parameters which are
//            passed
            Student(Student s1){
                this.name = s1.name;
                this.age = s1.age;
            }
            Student(){

            }

        }
//        2. In parameterzed constructor we pass the parameters and the constructor will assign those parameters to the object
//    and finally we got the information


//    3. COPY constructor -- cpp provide the copy constructor which are both user defined and default in cpp
//    but in java all the copy constructor are user defined
//    Copy constructor will take one object and put it into the another object


public class ConstructorsINjava {


    public static void main(String[] args) {
//     Student s1 = new Student("Dipendra" ,23);
//        s1.name ="Dipendra";
//        s1.age = 20;
        Student s1 = new Student();
        s1.name = "Dipendra";
        s1.age = 20;
//        s1.getInfo();

//        Student s2 = new Student("Kt kroge jaan k ",22222222); //this student() function is a constructor
//        function with non parameterized function
//        s2.name = "KYu BTAU";
//        s2.age = 34;
        Student s2 = new Student(s1);  //here for s2 we never defined the properties  we just copied the properties of s1
        s2.getInfo();
            //For A  OBJECT A CONSTRUCTOR IS CALLED ONLY ONCE

     }
}

