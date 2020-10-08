package pjatk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> studenci = new ArrayList();

        for (int i = 0; i < 20; i++) {
            studenci.add(new Student(i));
        }

        List<Integer> listaIndexow = studenci.stream()
                .map(Student::getLuckyNumber)
                .filter(integer -> integer > 10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(listaIndexow);

    }
}


