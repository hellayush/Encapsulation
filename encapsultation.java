 class hello 
 {
    private   String name ;
    private double age ;

    void getdata()
    {
        name = "Ayush";
        age = 18;
    }
    void showdata()
    {
        System.out.println(  name +" " + age);
    }
 }



public class encapsultation {
    public static void main(String[] args) {
        hello obj = new hello();
        obj.getdata();
        obj.showdata();
    }
}
