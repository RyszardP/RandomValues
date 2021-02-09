import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    static ArrayList<Student> studentsList = new ArrayList<Student>();

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            studentsList.add(Student.createStudent());
        }

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("name: " + studentsList.get(i).getName() +
                    ", second name: " + studentsList.get(i).getSecondName());
        }


    }
}
