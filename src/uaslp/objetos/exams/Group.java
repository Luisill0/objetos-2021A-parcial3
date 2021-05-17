package uaslp.objetos.exams;

import java.util.LinkedList;
import java.util.List;

public class Group {
    private List<Student> students;
    private int capacity;
    private int availability;

    public Group(int capacity){
        students = new LinkedList<>();
        this.capacity = capacity;
        this.availability = capacity;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student) throws GroupIsFullException {
        if(availability == 0){
            throw new GroupIsFullException();
        }else{
            students.add(student);
            availability--;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailability() {
        return availability;
    }

    public double getAverage(){
        Student student;
        double average = 0;

        for(int i = 0; i < (capacity - availability); i++){
            student = students.get(i);
            average += student.getAverage();
        }

        return average/(capacity - availability);
    }
}
