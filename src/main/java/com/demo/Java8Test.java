package com.demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Test {


    private static Employee[] arrayEmp =
            {
                    new Employee(1001, "sam", 2000.00),
                    new Employee(1004, "ram", 5000.00),
                    new Employee(1003, "tam", 6000.00),
            };



    public static void main(String ar[]) {
        /*Map<Integer, String> hasMap = new HashMap();
        hasMap.put(1,"vijaya");
        hasMap.put(2,"Srinivas");
        hasMap.put(4,"venkata");
        hasMap.put(5,"vikasini");

        hasMap.forEach((k,v)->System.out.println("Key:" + k + " "+ "values:"+v));*/

        List<Employee> list= Stream.of(arrayEmp)
                .filter(employee ->employee.getEmpSal()>=5000)
                .filter(employee -> employee.getEmpName().equalsIgnoreCase("tam"))
                .collect(Collectors.toList());
                  System.out.println(list);

                  List<List<String>> nestedList = Arrays.asList(
                          Arrays.asList("vijaya","varthya"),
                          Arrays.asList("srinivas","gudarada"),
                          Arrays.asList("venkata","naga"),
                          Arrays.asList("vikasini","vennella"));

                  List<String> flatteredList = nestedList.stream()
                          .flatMap(Collection::stream).limit(2)
                          .collect(Collectors.toList());
                  System.out.println("FlatteredList: \n "+
                          flatteredList);


      //  Stream.of(arrayEmp).forEach(employees -> System.out.println(employees.getEmpId()));

       /* List<Employee> list1= Arrays.asList(arrayEmp);
        List<Employee> list2 =new ArrayList();
        for(Employee employee : list1)
        {
            if(employee.getEmpSal()>=5000)

             list2.add(employee);


        }
        System.out.println("Employees list:"+list2);*/
    }
}