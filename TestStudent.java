package xay_dung_lop_chi_ghi_trong_java;
class Student{
    private String name = "John";
    private String classes = "CO2";

    Student(){
    }
    String getName(){
        return name;
    }
    String getClasses(){
        return classes;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }

}
public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("st1's name : " + st1.getName());
        System.out.println("st1's class : " + st1.getClasses());
        Student st2 = new Student();
        st2.setName("Kelvin");
        st2.setClasses("BO2");
        System.out.println("st2's name : " + st2.getName() );
        System.out.println("st2's class : " + st2.getClasses() );
    }
}
