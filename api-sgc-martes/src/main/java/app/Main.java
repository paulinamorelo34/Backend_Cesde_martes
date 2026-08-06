package app;

import models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students(1L, "Jhon","Doe","Jhon@gmail.com", "123456789"));
        students.add(new Students(2L, "Jane","Smith","Jane@gmail.com", "2345678901" ));
        students.add(new Students(3L, "Mario","Cardenas","Mario@gmail.com", "3456789012" ));
        students.add(new Students(4L, "Maria","Gonzales","Maria@gmail.com","4567890123" ));
        students.add(new Students(5L, "Maria","Gonzales","Maria@gmail.com", "5678901234" ));


        System.out.println("List of Students:");

        for (Students student: students ){
            System.out.println("ID:"+ student.getId()+ ",Name:"+student.getFirstName()+""
                    +student.getLastName() + ",Email:" + student.getEmail() + ", Phone:"+ student.getPhone());
        }





    }
}
