class Programmer extends Employees { 

    static void skill(){
        System.out.println("java , python");
    } ;
        public Programmer(String id, String name, double salary) {
            super(id, name, salary); // เรียกใช้งานคอนสตรักเตอร์ของคลาสหลัก Employees
        
    }
    public Programmer(){
        System.out.println("I am Programmer");
    }
    
}
