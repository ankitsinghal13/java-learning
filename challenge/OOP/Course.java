public class Course{
// belongs to class
    static int maxCapacity;

    String courseName;
    int enrolledStudents;


//constructor
    Course(String courseName){
        this.courseName = courseName;
    }

//normal block - runs everytime an object is created
    {
        enrolledStudents = 0;
    }

// belongs to class - accessed by the class name with . operator
    static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }

// non static mehtods - accessed with the object name with . operator
    void enrollStudent(String studentName){

        enrolledStudents++;
    }

    void unenrollStudent(String studentName){

        enrolledStudents--;
    }

    public static void main(String[] args){

        Course bca = new Course("bca");
        Course.setMaxCapacity(60);
        bca.enrollStudent("ankit");
        bca.enrollStudent("varun");
        System.out.println(bca.enrolledStudents);

        bca.unenrollStudent("varun");
        System.out.println(bca.enrolledStudents);
        System.out.println(maxCapacity);
        System.out.println(bca.courseName);
    }

}