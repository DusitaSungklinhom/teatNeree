public class Main {
    public static void main(String[] args) {
        // format ชื่อ class blank ชื่อ object = new constructure
        Employees emp1=new Employees();
        Employees emp2=new Employees();
        Employees emp3=new Employees();
        Employees emp4=new Employees();
        Employees emp5=new Employees();

        emp1.id= "neree1234";
        emp1.name= "Neree";
        emp1.salary=100000.00;
        emp2.id= "jeffrey2345";
        emp2.name= "Jeffrey";
        emp2.salary=88888.00;
        emp3.id= "dion1234";
        emp3.name= "Dion";
        emp3.salary=120000.00;
        emp4.id= "carlos1234";
        emp4.name= "Carlos";
        emp4.salary=30000.00;
        emp5.id= "genvy1234";
        emp5.name= "Genvy";
        emp5.salary=22000.00;
        System.out.println("Employee id: "+emp1.id);
        System.out.println("Employee name: "+emp1.name);
        System.out.println("Employee salary: "+emp1.salary);
        System.out.println("Employee id: "+emp2.id);
        System.out.println("Employee name: "+emp2.name);
        System.out.println("Employee salary: "+emp2.salary);
        System.out.println("Employee id: "+emp3.id);
        System.out.println("Employee name: "+emp3.name);
        System.out.println("Employee salary: "+emp3.salary);
        System.out.println("Employee id: "+emp4.id);
        System.out.println("Employee name: "+emp4.name);
        System.out.println("Employee salary: "+emp4.salary);
        System.out.println("Employee id: "+emp5.id);
        System.out.println("Employee name: "+emp5.name);
        System.out.println("Employee salary: "+emp5.salary);
    }
}
//การบ้าน สร้าง object 5 object ให้ค่าแตกต่างกัน 