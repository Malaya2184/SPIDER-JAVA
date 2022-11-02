import java.util.*;

class Employee{
    Integer id;
    String name;
    Integer age;
    Employee(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Emp[" + this.id + " " + this.name + " " + this.age + "]";
    };
    
}

// while creating custom comparator never ever forget to add type generic to the comparator otherwise it will show some error
class MyComparator implements Comparator<Employee>{

    public int compare(Employee e1, Employee e2){

        return e1.age.compareTo(e2.age);
    }
}
public class LamdaExpression3 {

    public static void main(String[] args) {

        List<Employee> li = new ArrayList<>();
        li.add(new Employee(1, "a", 10));
        li.add(new Employee(2, "b", 9));
        li.add(new Employee(3, "c", 8));

        // by directly creating comparator
        // Collections.sort(li, new Comparator<Employee>(){
            
        //     public int compare(Employee x, Employee y){
        //         return -x.id.compareTo(y.id);
        //     }
        // });
        // System.out.println(li);

        // by using lamda expression
        // Collections.sort(li, (x,y) -> -x.id.compareTo(y.id));
        // System.out.println(li);

        Collections.sort(li,new MyComparator());
        System.out.println(li);
        
    }
    
}
