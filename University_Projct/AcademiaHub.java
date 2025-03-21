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

        while (true)
        {
            System.out.println("\nOperations to work with:");
            System.out.println("1. Update University name/location/Branch");
            System.out.println("2. Branches changes");
            System.out.println("3. Sections changes");
            System.out.println("Enter any other number to exit.");
            System.out.print("Enter Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Exiting...");
                break;
            }

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    ArrayList<String> classActivities = new ArrayList<>();
                    commonTask task = new commonTask();
                    int options = task.eachClassActivity(academicUnit.listOfActivities(classActivities));

                    switch (options)
                    {
                        case 1:
                            if (university.nameGet().isEmpty()) {
                                System.out.println("Set Name of your University");
                                System.out.print("Enter Name: ");
                                sc.nextLine();
                                String name = sc.nextLine();
                                university.nameSet(name);
                            }
                            System.out.println("Name of the University: " + university.nameGet());
                            break;
                        case 2:
                            if (university.getLocation().isEmpty()) {
                                System.out.println("Set Location of your University");
                                System.out.print("Enter Location: ");
                                sc.nextLine();
                                String location = sc.nextLine();
                                university.setLocation(location);
                            }
                            System.out.println("University location: " + university.getLocation());
                            break;
                        case 3:
                            System.out.println("Welcome to * " + university.nameGet() + " * at " + university.getLocation());
                            System.out.println("New Branch should follow the precedence of the last added Branch: " + university.lastAddedBranch());
                            System.out.print("Enter Branch code: ");
                            sc.nextLine();
                            String code = sc.nextLine();
                            System.out.print("Enter Branch HOD: ");
                            String hodName = sc.nextLine();
                            UniversityNode node = new UniversityNode(code, hodName);
                            university.addBranch(node);
                            break;
                        case 4:
                            UniversityNode universityRoot = university.getRoot();
                            commonTask commonTask = new commonTask();
                            commonTask.displayBranchList(universityRoot);
                            break;
                        default:
                            System.out.println("Invalid option. Please choose a valid option.");
                            break;
                    }
                    break;
                }
                case 2:
                {
                    UniversityNode universityRoot = university.getRoot();
                    commonTask commonTask = new commonTask();
                    Branches branches = new Branches();
                    AcademicUnit academicUnit1 = new Branches();

                    System.out.println("All available branch list:");
                    commonTask.displayBranchList(universityRoot);

                    ArrayList<String> classActivities = new ArrayList<>();
                    int cho = commonTask.eachClassActivity(academicUnit1.listOfActivities(classActivities));
                    sc.nextLine();
                    System.out.print("Enter Branch code: ");
                    String bcode = sc.nextLine();

                    if (cho == 1) {
                        if (commonTask.isBranchValid(universityRoot, bcode)) {
                            System.out.println("Your Branch is empty! Please add a section and assign faculty in charge.");
                            System.out.print("Enter Section code: ");
                            String sectionCode = sc.nextLine();
                            System.out.print("Enter name of faculty in charge: ");
                            String facultyName = sc.nextLine();
                            BranchNode branchNode = new BranchNode(sectionCode, facultyName);
                            branches.addSection(universityRoot, bcode, branchNode);
                            System.out.println("You have successfully added the section!");
                        } else {
                            System.out.println("Invalid Branch Code.");
                        }
                    } else if (cho == 2) {
                        if (commonTask.isBranchValid(universityRoot, bcode)) {
                            System.out.print("Enter Section code: ");
                            String sectionCode = sc.nextLine();
                            System.out.print("Enter faculty name: ");
                            String facultyName = sc.nextLine();
                            branches.facultyUpdate(universityRoot, bcode, sectionCode, facultyName);
                            System.out.println("Name updated successfully!");
                        } else {
                            System.out.println("Invalid Branch Code.");
                        }
                    } else if (cho == 3) {
                        if (commonTask.isBranchValid(universityRoot, bcode)) {
                            commonTask.getSectionList(universityRoot, bcode);
                        } else {
                            System.out.println("Invalid Branch Code.");
                        }
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Sections changes will be implemented soon.");
                    break;
                }
                default:
                {
                    System.out.println("Thanks for your Interest. Exiting...");
                    return; // Exit the program
                }
            }
        }
        sc.close();
    }
}
