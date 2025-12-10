package StreamAPI;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {

    // Created this class to use the stream for better understanding of maps along with filter
    static class Employee{
        private String name;
        private double salary;

        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }

        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        @Override
        public String toString(){
            return "Employee{name='" + name + "', salary=" + salary + '}';
        }
    }


    public static void main(String[] args) {

        // filter(Predicate)
            // boolean value function based on it filter method will filter it else it will skip it
            // e-> { return true false } or e -> e > 10 return true if true

        // map(Function) this will return value to a new stream.
        /*
        each element operation
        ex- if say we have a list and we want to square each elements present in it
        then map will return it
         */

        //Ex - List to take out the names in a list starts with character "A".
        List<String> names = List.of("Aman", "Ankit", "Abhilash", "Amit", "Rishav", "Deepak", "Aamir");
        List<String> stream1 = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(stream1);

        // Take out the names longer than charter 12 into a new list.
        List<String> names2 = List.of("Pranav Bakliwal", "Manasa Addepalli", "Neenu Joseph", "Karan Dua", "Rahul Kaushik");
        List<String> result1 =
                names2.stream()
                        //.filter(e -> !names2.isEmpty())
                        .filter(e -> e.length()>12)
                        .collect(Collectors.toList());
        System.out.println(result1);
        //result1.forEach(System.out::println);

        //Number greater than 10 in the list along with removal of duplicates and count how many duplicates will be removed
        List<Integer> num = List.of(5,34,6,3,5,3,45,5,67,6,5,435);
        long originalCount = num.size();
        long uniqueCount = num.stream().distinct().count();
        long duplicateRemoved = originalCount - uniqueCount;
        List<Integer> result2 =
                num.stream()
                        .distinct()
                        .filter(e -> e > 10)
                        .toList();

        System.out.println("Final List" + result2);
        System.out.println("Duplicate Removed: " + duplicateRemoved);

        // Even Numbers
        List<Integer> result3 =
                num.stream()
                        .filter(e -> e % 2 == 0)
                        .toList();
        System.out.println(result3);

        // Odd Numbers
        List<Integer> result4 =
                num.stream()
                        .distinct()
                        .filter(e -> e%2 !=0)
                        .toList();
        System.out.println("Odd number from the list" + result4);

        // Names containing letter i in them, using the above list "names"
        List<String> result5 =
                names.stream()
                        .filter(e -> e.contains("i"))
                        .toList();
        System.out.println(result5);

        // Numbers between 10 and 20
        List<Integer> nums = List.of(34,23,15,6,12,35,20);
        List<Integer> result6 =
                nums.stream()
                        .filter(e -> e >= 10 && e <= 20)
                        .toList();
        System.out.println(result6);

        // Names ending with h, using the above list "names"
        List<String> result7 =
                names.stream()
                        .filter(e -> e.endsWith("h"))
                        .toList();
        System.out.println(result7);


        // Ignore the empty strings
        List<String> data = List.of("Java", "", "Python", "", "API");
        List<String> result8 = data.stream().filter(e -> !e.isEmpty()).toList();
        System.out.println(result8);

        List<String> result9 =
                names2.stream()
                        .filter(e -> !e.startsWith("A"))
                        .toList();
        System.out.println(result9);



        //==============================================================================================================================


        // Use of map, when we have to transform/change the number given in the list

        // Squaring the number in the list
        List<Integer> number1 = List.of(2,4,5,6,7,8);
        List<Integer> result10 = number1.stream().map(n -> n*n).toList();
        System.out.println(result10);

        // name starts with "A" convert it to upper case, first use filer because there is no need to change those which is not required.
        List<String> result11 =
                names.stream()
                        .filter(name -> name.startsWith("A"))
                        .map(name -> name.toUpperCase())
                        .toList();
        System.out.println(result11);


        //Convert numbers to double their value, using above num list
        List<Integer> result12 =
                num.stream()
                        .map(n -> n*2)
                        .toList();
        System.out.println(result12);

        //Convert name to UPPERCASE, using names2 lost from above
        List<String> result13 =
                names2.stream()
                        .map(name -> name.toUpperCase())
                        .toList();
        System.out.println(result13);

        //Get length of each name
        List<Integer> result14 =
                names2.stream()
                        .map(name -> name.length())
                        .toList();
        System.out.println(result14);

        //Add Gst of 18%
        List<Double> prices = List.of(100.0,250.0,500.50);
        List<Double> result15 =
                prices.stream()
                        .map(p-> p+(p*0.18))
                        .toList();
        System.out.println(result15);


        //convert numbers to String format
        List<String> result16 =
                num.stream()
                        .map( n -> "Numbers: " + n )
                        .toList();
        System.out.println(result16);


        //employee salary > 30K -> increase by 10% using both filter and map

        //Numbers>10 -> square them
        List<Integer> result =
                num.stream()
                        .filter(i -> i > 10)
                        .map(i->i*i)
                        .toList();
        System.out.println(result);

        List<Employee> employees = List.of(
                new Employee("Aman", 25000),
                new Employee("Ravi", 40000),
                new Employee("Neha", 32000),
                new Employee("Sumit", 28000)
        );

        List<Employee> updatedSalary =
                employees.stream()
                        .filter(emp -> emp.getSalary() > 30000)
                        //Note map decides the OUTPUT TYPE of the stream here it becomes Employee instead of Double because to get the employee name map uses new Employee (object of Employee in it)
                        .map(emp -> new Employee(
                                emp.getName(),
                                emp.getSalary() * 1.10))
                        .toList();

        System.out.println(updatedSalary);


    }
}
