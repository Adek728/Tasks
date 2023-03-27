package Task2;

public class Student implements Comparable<Student> {
    private String FullName;
    private int Age;
    private int Gpa;
    
    public Student(String FullName, int Age, int Gpa) {
        this.FullName = FullName;
        this.Age = Age;
        this.Gpa = Gpa;
    }

    int getGpa() {
        return Gpa;
    }
    
    int getAge() {
        return Age;
    }

    String getFullName() {
        return FullName;
    }

    @Override
    public int compareTo(Student s1) {
        int t = 1;
        int f = -1;
        int o = 0;
        if(this.getGpa() < s1.getGpa())
            return t;
        else if(this.getGpa() > s1.getGpa())
            return f;    
        else if(this.getGpa() == s1.getGpa()) {
            String first = this.getFullName().split(" ")[1];
            String second = s1.getFullName().split(" ")[1];
        
            if(first.charAt(0) > second.charAt(0))
                return t;
            else if(first.charAt(0) < second.charAt(0))
                return f;
            else if(first.charAt(0) == second.charAt(0)) {
                if(this.getAge() > s1.getAge())
                    return t;
                else if(this.getAge() < s1.getAge())
                    return f;       
            }   
        }
        return o;
    }
}
