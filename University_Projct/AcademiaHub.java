package University_Projct;

import java.util.Scanner;
import java.util.Set;

public class AcademiaHub {
    public static void main(String...args) {
        AcademicUnit academicUnit = new University();
        Scanner sc= new Scanner(System.in);
        System.out.println("Operations to work with: ");
        System.out.println("University changes: 1");
        System.out.println("Branches changes: 2");
        System.out.println("Sections changes: 3");
        int choice = sc.nextInt();
        if(choice==1) {
            // Verify yourself (Implementation to be done)
            University university = new University();
            if(academicUnit.nameGet().isEmpty())
            {
                System.out.println("Set Name of your University");
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                academicUnit.nameSet(name);
            }
            System.out.println("Name of the University: "+academicUnit.nameGet());
            if(university.getLocation().isEmpty())
            {
                System.out.println("Set Location of your University");
                System.out.print("Enter Location: ");
                String name = sc.nextLine();
                university.setLocation(name);
            }
            System.out.println("University location: "+university.getLocation());
            //List of activities to perform
            Task task = new Task();
            task.eachClassActivity(university);
        }
        else if(choice==2)
        {}
        else if (choice==3)
        {
            AcademicUnit sections = new Sections();
            Task task = new Task();
            int ch = task.eachClassActivity(sections);
            Sections sections1 = new Sections();
            String section_code = sc.nextLine();
            if(ch==1)
            {
                sections1.setSection(section_code);
                System.out.print("Enter Branch Code into which section will be added: ");
                String b_code = sc.nextLine();
                Branches branches = new Branches();
                branches.setBranch(b_code,sections1);
            }
            else if(ch==2)
            {
                sections1.getSection(section_code);
            }
            else
            {
                String id = sc.nextLine();
                sections1.setFaculty(section_code,id);
            }
        }
        else
        {
            System.out.println("Thanks for your Interest");
        }
    }
}
