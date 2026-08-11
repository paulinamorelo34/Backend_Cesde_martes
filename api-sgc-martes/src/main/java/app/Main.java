package app;

import models.Students;
import models.Cursos;
import models.Matriculas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students(1L, "Jhon ","Doe","Jhon@gmail.com", "123456789"));
        students.add(new Students(2L, "Jane ","Smith","Jane@gmail.com", "2345678901" ));
        students.add(new Students(3L, "Mario ","Cardenas","Mario@gmail.com", "3456789012" ));
        students.add(new Students(4L, "Maria ","Gonzales","Maria@gmail.com","4567890123" ));
        students.add(new Students(5L, "Mariana ","Gómez","Mariana@gmail.com", "5678901234" ));

        System.out.println("List of Students:");

        for (Students student: students ){
            System.out.println("ID:"+ student.getId()+ ",Name:"+student.getFirstName()+""
                    +student.getLastName() + ",Email:" + student.getEmail() + ", Phone:"+ student.getPhone());
        }
        System.out.println("");

        List<Cursos> cursos = new ArrayList<>();

        cursos.add(new Cursos(1L, "Java", "Programación en Java", 40, 30));
        cursos.add(new Cursos(2L, "Python", "Introducción a Python", 35, 25));
        cursos.add(new Cursos(3L, "Bases de Datos", "Fundamentos de SQL", 30, 20));
        cursos.add(new Cursos(4L, "Backend", "Programación orientada a objetos", 35, 25));
        cursos.add(new Cursos(5L, "Frontend", "Python", 30, 20));

        System.out.println("Lista de Cursos:");

        for (Cursos curso : cursos) {
            System.out.println(
                    "ID: " + curso.getId()
                            + ", Nombre: " + curso.getNombre()
                            + ", Descripción: " + curso.getDescripcion()
                            + ", Duración: " + curso.getDuracion()
                            + ", Cupo: " + curso.getCupo()
            );
        }

        System.out.println("");

        List<Matriculas> matriculas = new ArrayList<>();

        matriculas.add(new Matriculas("Jhon Doe", "Java", "10/08/2026", "Activa", "Ver"));
        matriculas.add(new Matriculas("Jane Smith", "Python", "10/08/2026", "Activa", "Ver"));
        matriculas.add(new Matriculas("Mario Cardenas", "Bases de Datos", "10/08/2026", "Activa", "Ver"));
        matriculas.add(new Matriculas("Maria Gonzales", "Java", "10/08/2026", "Pendiente", "Ver"));
        matriculas.add(new Matriculas("Mariana Gómez", "Java", "10/08/2026", "Activa", "Ver"));

        System.out.println("Lista de Matriculas:");

        for (Matriculas matricula : matriculas) {
            System.out.println(
                    "Estudiante: " + matricula.getEstudiante()
                            + ", Curso: " + matricula.getCurso()
                            + ", Fecha: " + matricula.getFecha()
                            + ", Estado: " + matricula.getEstado()
                            + ", Acciones: " + matricula.getAcciones()
            );
        }


    }
}
