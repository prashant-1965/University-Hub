package University_Projct;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademiaHub
{
    public static void main(String... args)
    {
        AcademicUnit academicUnit = new University();
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations to work with: ");
        System.out.println("University changes: 1");
        System.out.println("Branches changes: 2");
        System.out.println("Sections changes: 3");
        int choice = sc.nextInt();
        int ch;

        switch (choice)
        {
            case 1:
            {
                // Verify yourself (Implementation to be done)
                ArrayList<String> classActivities;
                Task task = new Task();
                ch = task.eachClassActivity(academicUnit.listOfActivities(classActivities = new ArrayList<>()));
                University university = new University();

                switch (ch)
                {
                    case 1:
                    {
                        if (university.nameGet().isEmpty())
                        {
                            System.out.println("Set Name of your University");
                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();
                            university.nameSet(name);
                        }
                        System.out.println("Name of the University: " + university.nameGet());
                        break;
                    }
                    case 2:
                    {
                        if (university.getLocation().isEmpty())
                        {
                            System.out.println("Set Location of your University");
                            System.out.print("Enter Location: ");
                            String name = sc.nextLine();
                            university.setLocation(name);
                        }
                        System.out.println("University location: " + university.getLocation());
                        break;
                    }
                    case 3:
                    {
                        // Adding Branch
                        System.out.println("New Branch should be preceder of last Added branch : Last Added Brach: "+university.lastAddedBranch());
                        System.out.print("Enter Branch code: ");
                        String code = sc.nextLine();
                        UniversityNode node = new UniversityNode(code);
                        university.addBranch(node);
                        break;
                    }
                    case 4:
                    {
                        university.displayAlLBranch();
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid option. Please choose a valid option.");
                        break;
                    }
                }
                break;
            }
            case 2:
            {
                // Implementation pending
                break;
            }
            case 3:
            {
                AcademicUnit sections = new Sections();
                ArrayList<String> classActivities;
                Task task = new Task();
                ch = task.eachClassActivity(academicUnit.listOfActivities(classActivities = new ArrayList<>()));
                Sections sections1 = new Sections();
                String section_code = sc.nextLine();

                switch (ch)
                {
                    case 1:
                    {
                        sections1.setSection(section_code);
                        System.out.print("Enter Branch Code into which section will be added: ");
                        String b_code = sc.nextLine();
                        Branches branches = new Branches();
                        branches.setBranch(b_code, sections1);
                        break;
                    }
                    case 2:
                    {
                        sections1.getSection(section_code);
                        break;
                    }
                    default:
                    {
                        String id = sc.nextLine();
                        sections1.setFaculty(section_code, id);
                        break;
                    }
                }
                break;
            }
            default:
            {
                System.out.println("Thanks for your Interest");
                break;
            }
        }
    }
}
