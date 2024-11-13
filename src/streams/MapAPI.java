package streams;

import streams.data.Student;
import streams.data.StudentDataBase;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Sahil on 11/11/2024
 */
public class MapAPI {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList()).toArray()));
    }
}
