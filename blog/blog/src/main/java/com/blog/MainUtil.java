package com.blog;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MainUtil {

    public static void main(String[] args) {

    }
}
//        List<Employee> data = Arrays.asList(new Employee("ayesha", "blore", 1000),
//                new Employee("naaz", "blore", 2000),
//                new Employee("muddu", "kerebilchi", 2000));
//        Map<Integer, List<Employee>> map = data.stream().collect(Collectors.groupingBy(Employee::getSalary));
//
//        for (Map.Entry<Integer, List<Employee>> entry:map.entrySet()
//             ) {
//            int salary = entry.getKey();
//            System.out.println("salary of employee: "+salary);
//            List<Employee> employeeList = entry.getValue();
//            for (Employee e:employeeList
//                 ) {
//                System.out.println(e.getName());
//            }

       // }
        //key=vlaue
        //1000=ayesha
        //2000=muddu,naaz



//        List<Integer> list = Arrays.asList(200, 300, 500, 2, 4, 80);
//        Integer maxVal = list.stream().max(Integer::compareTo).get();
//        System.out.println(maxVal);
//        Integer minVal = list.stream().min(Integer::compareTo).get();
//        System.out.println(minVal);
//        List<Integer> data4 = Arrays.asList(2,2,2, 4, 5, 6, 7);
//        List<Integer> collect2 = data4.stream().distinct().collect(Collectors.toList());
////        System.out.println(collect2);
//    }
//}

        //example for comparator0 and comparable using classes A ,Aname,Ayear
//     A a1 = new A("A",8,2023);
//     A a2 = new A("C",5,1999);
//     A a3 = new A("B",9,2002);
//
//        ArrayList<A> list = new ArrayList<>();
//        list.add(a1);
//        list.add(a2);
//        list.add(a3);
//        AYear aYear=new AYear();
//        AName aName=new AName();
//
//        Collections.sort(list,aName);
//        for (A a:list
//             ) {
//            System.out.println(a.getName());
//            System.out.println(a.getYear());
//            System.out.println(a.getRate());



//        Employee emp1 = new Employee();
//        emp1.setName("ayesha");
//        emp1.setCity("blore");
//        emp1.setSalary("0");
//
//        Employee emp2 = new Employee();
//        emp2.setName("muddu mudassir");
//        emp2.setCity("kerebilchi");
//        emp2.setSalary("0");
//
//        Employee emp3 = new Employee();
//        emp3.setName("ayesha");
//        emp3.setCity("blore");
//        emp3.setSalary("0");

        //predicate-when comparing something and returning a boolean value
        //consumer-
        //producer-
        //functioal and functioal interface-
//        Predicate<Integer> condition = y->y>1110;
//        boolean test = condition.test(100);
//        System.out.println(test);
        //to give data>20
//        List<Integer> data = Arrays.asList(10,20,30,4,50,100);
//        List<Integer> newData=data.stream().filter(x->x>20).collect(Collectors.toList());
//        System.out.println(newData);
        //names that start with 'm'
//        List<String> data = Arrays.asList("mike", "muddu", "aisha", "naaz", "lilly");
//        List<String> newData = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newData);
//
//        List<String> data1 = data.stream().filter(x -> x.endsWith("n")).collect(Collectors.toList());
//        System.out.println(data1);
//        List<String> data2 = data.stream().filter(x -> x.equals("mike")).collect(Collectors.toList());
//
//        List<Employee> list = Arrays.asList(emp1, emp2, emp3);
//        List<Employee> kerebilchi = list.stream().filter(e -> e.getCity().equalsIgnoreCase("kerebilchi")).collect(Collectors.toList());
//        for (Employee e : kerebilchi
//        ) {
//            System.out.println(e.getCity());
//
//            List<Integer> data3 = Arrays.asList(2, 4, 5, 6, 7);
//            List<Integer> collect = data3.stream().map(x -> x + x).collect(Collectors.toList());
//            System.out.println(collect);
//
//            List<Double> divide = Arrays.asList(2.0, 4.4, 5.8, 7.4, 8.9);
//            List<Double> d = divide.stream().map(x -> x / 2).collect(Collectors.toList());
//            System.out.println(d);
//
//            List<String> list1 = Arrays.asList("Ayesha", "naaz", "muddu", "sofia");
//            List<String> collect1 = list1.stream().sorted().collect(Collectors.toList());
//            System.out.println(collect1);
//

// the below code is when multiple entity objects are created how to put it into dto object
//        Post post1= new Post();
//        post1.setId(1);
//        post1.setTitle("aaa");
//        post1.setContent("aaaa");
//
//        Post post2= new Post();
//        post2.setId(2);
//        post2.setTitle("bbb");
//        post2.setContent("abbb");
//
//        Post post3= new Post();
//        post3.setId(3);
//        post3.setTitle("ccc");
//        post3.setContent("cccc");
//one way
//        mapToDto(post1);
//        mapToDto(post2);
//        mapToDto(post3);

//        //second way if entity objects are many
//        List<Post> list = Arrays.asList(post1, post2, post3);
//       //call method using class reference
//       // List<PostDto> dtos =list.stream().map(MainUtil::mapToDto).collect(Collectors.toList());
//       // or
//        List<PostDto> Dtos = list.stream().map(post -> mapToDto(post)).collect(Collectors.toList());
//        System.out.println(Dtos);
//
//    }
//
//       static PostDto mapToDto(Post post){
//        PostDto dto =new PostDto();
//           dto.setId(post.getId());
//           dto.setTitle(post.getTitle());
//           dto.setContent(post.getContent());
//           return dto;
//       }



