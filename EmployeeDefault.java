class Employee_details{
    int empid;
    String empname;
    int empsalary;
    Employee_details(){
        empid = 101;
        empname  = "sakshi";
        empsalary = 50000;
    }
    void putdata(){
        System.out.println(" employee id: = "+  empid +  " employee name:  "+  empname +  " employee salary " +  empsalary);
    }
}
    public class EmployeeDefault {
        public static void main(String[] args){
            Employee_details e = new Employee_details();
            e.putdata();
    }
 }






