import java.util.*;
class Student{
    int id;
    String name;
    double marks;
    Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;

    }
    public void display(){
        System.out.println("ID:"+id+",Name: "+name+",Marks:"+marks);
    }
}
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n=======Student Management Menu======");
            System.out.println("1.Add Student");
            System.out.println("2.view Student");
            System.out.println("3.update Student");
            System.out.println("4.delete Student");
            System.out.println("0.Exit Student");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter ID:");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name:");
                String name=sc.nextLine();
                System.out.println("Enter Marks:");
                double marks=sc.nextDouble();
                studentList.add(new Student(id,name,marks));
                System.out.println("Student added successfully");
                break;
                case 2:
                System.out.println("\n----- Student List-----");
                for(Student s:studentList){
                    s.display();
                }
                break;
                case 3:
                System.out.println("Enter Student ID to Update:");
                int updateId=sc.nextInt();
                boolean found=false;
                for(Student s:studentList){
                    if(s.id==updateId){
                        sc.nextLine();
                        System.out.println("Enter New Name:");
                        s.name=sc.nextLine();
                        System.out.println("Enter New Marks");
                        s.marks=sc.nextDouble();
                        System.out.println("Student Updated Successfully");
                        found=true;;
                        break;
                    }
                }
                if(!found){
                    System.out.println("Student not found!");
                }
                break;
                case 4:
                System.out.println("Enter student id to delete:");
                int deleteId=sc.nextInt();
                found=false;
                for(Student s:studentList){
                    if(s.id==deleteId){
                        studentList.remove(s);
                        System.out.println("Student deleted Successfully");
                        found=true;
                        break;

                    }
                }
                if(!found){
                    System.out.println("Student not found");
                }
                break;
                case 0:
                System.out.println("Exiting...Thank you!");
                break;
                default:
                System.out.println("Invalid Choice! please try again...");
                }
            }while(choice!=0);
            sc.close();
        }
    }

