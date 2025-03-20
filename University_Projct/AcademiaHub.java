package University_Projct;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademiaHub
{
    public static void main(String... args)
    {
        AcademicUnit academicUnit = new University();
        University university = new University();
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations to work with: ");
        System.out.println("Update University name/location/Branch: 1");
        System.out.println("Branches changes: 2");
        System.out.println("Sections changes: 3");
        int choice = sc.nextInt();
        int ch;
        switch (choice)
        {
            case 1:
            {
                // Verify yourself (Implementation to be done)
                ArrayList<String> classActivities = new ArrayList<>();
                commonTask task = new commonTask();
                ch = task.eachClassActivity(academicUnit.listOfActivities(classActivities));

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
                        System.out.println();
                        System.out.print("Enter Branch HOD: ");
                        String name = sc.nextLine();
                        UniversityNode node = new UniversityNode(code,name);
                        university.addBranch(node);
                        break;
                    }
                    case 4:
                    {
                        UniversityNode universityRoot = university.getRoot();
                        commonTask commonTask = new commonTask();
                        commonTask.displayBranchList(universityRoot);
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
                UniversityNode universityRoot = university.getRoot();
                commonTask commonTask = new commonTask();
                System.out.println("All available branch list:- ");
                commonTask.displayBranchList(universityRoot);
                ArrayList<String> classActivities = new ArrayList<>();
                ch = commonTask.eachClassActivity(academicUnit.listOfActivities(classActivities));
                System.out.print("Enter Branch code : ");
                String code = sc.nextLine();
                if(ch==1) {
                    if(commonTask.isBranchValid(universityRoot, code))
                    {
                        System.out.println("Your Branch is empty! Please add section and assign faculty incharge");
                        System.out.println("Enter Section code");
                        String sectioncode = sc.nextLine();
                        System.out.println("Enter name of faculty incharge");
                        String name = sc.nextLine();
                        BranchNode branchNode = new BranchNode(sectioncode,name);
                        commonTask.treeTraversing(universityRoot,code,branchNode);
                        System.out.println("You have successfully added the section!");
                    }
                    else
                    {
                        System.out.println("Invalid Branch Code");
                    }
                }
                else if(ch==2)
                {
                    if(commonTask.isBranchValid(universityRoot, code))
                    {
                        System.out.print("Enter Section code: ");
                        String sectioncode = sc.nextLine();
                        System.out.print("Enter faculty name ");
                        String name = sc.nextLine();
                        commonTask.treeTraversing(universityRoot,code,sectioncode,name);
                        System.out.println("Name updated successfully!");
                    }
                    else
                    {
                        System.out.println("Invalid Branch Code");
                    }
                }
                else if(ch==3)
                {
                    if(commonTask.isBranchValid(universityRoot, code))
                    {
                        System.out.print("Enter Section code: ");
                        String sectioncode = sc.nextLine();
                        commonTask.treeTraversing(universityRoot,code,sectioncode);
                    }
                    else
                    {
                        System.out.println("Invalid Branch Code");
                    }
                }

            }
            case 3:
            {
                // will be implemented
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
