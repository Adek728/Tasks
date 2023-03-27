package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Task {
    public static void main(String[] args) {
        
        List<Student> students= new ArrayList<>();
        students.add(new Student("David Goodman", 23, 88));
        students.add(new Student("Mark Rose", 25, 82));
        students.add(new Student("Jane Doe", 22, 90));
        students.add(new Student("Jane Dane", 25, 90));
        
        System.out.println(sort(students));
    }
    
    public static String sort(List<Student> lista) {
        String text = "";
        Collections.sort(lista);
        for(int i = 0; i < lista.size(); i++) {
            text += lista.get(i).getFullName();
            if(i != lista.size() - 1)
                text += ", "; 
        }
        return text;
    }
}
