/*
Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/
class Teacher {
    String designation = "ComputerTeacher";
    String collegeName = "IIT";

    void work() {
        System.out.println("Designation : " + designation);
        System.out.println("College : " + collegeName);
    }
}

class ComputerTeacher extends Teacher {

}

public class Teachers {
    public static void main(String[] args) {
        ComputerTeacher ct = new ComputerTeacher();
        ct.work();
    }
}