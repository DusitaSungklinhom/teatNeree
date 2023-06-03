public class Employees {
    //Attribute
    private String name;
    private String id;
    private Double salary;
    
    //Default Constructor
    public Employees(String id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Method
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
    public void display(){
        System.out.println("ID :"+this.id);
        System.out.println("NAME :" + this.name);
        System.out.println("SALARY :" + this.salary);

    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

}
