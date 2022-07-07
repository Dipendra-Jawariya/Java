class Emp{
    String name,cmpname;
    int age;
    Emp(String name,String cmpname,int age){
        this.name = name;
        this.age = age;
        this.cmpname = cmpname;
    }
}
public String toString(){
    return name+" "+age+" "+cmpname;
}
public class arrayListMSin{
    public static void main(String[] args) {
    ArrayList<Emp> arr = new ArrayList<Emp>();
    Emp e1 = new Emp("Dipendra","Google", 20);
    Emp e2 = new Emp("Mayank","TCS", 20);
    Emp e3 = new Emp("Dev","apple", 20);
    arr.add(e1);
    arr.add(e2);
    arr.add(e3);
    }
}
