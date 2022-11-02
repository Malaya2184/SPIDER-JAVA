import java.util.*;
import java.util.stream.Collector;

class Employee{
    Integer id;
    String name;
    int age;
    Employee(Integer id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Emp[" + this.id + " " + this.name + " " + this.age + "]";
    };
    
}
public class LamdaExpression2 {
    public static void main(String[] args) {
        
        List<Employee> li = new ArrayList<>();
        li.add(new Employee(1, "a", 10));
        li.add(new Employee(2, "b", 9));
        li.add(new Employee(3, "c", 8));

        // Collections.sort(li, (x,y) -> -x.id.compareTo(y.id));
        // System.out.println(li);
        
        Collections.sort(li, new Comparator<Employee>(){
            
            public int compare(Employee x, Employee y){
                return -x.id.compareTo(y.id);
            }
        });
        System.out.println(li);


    //   li.stream().sorted((x,y) -> -x.name.compareTo(y.name)).forEach((x)-> System.out.println(x));;
        // System.out.println(li2);
        
    }
}
