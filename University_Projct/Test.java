package University_Projct;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AcademicUnit academicUnit = new University();
        University university = new University();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nTesting Operations:");
            System.out.println("1. Test University details update");
            System.out.println("2. Test Branches management");
            System.out.println("3. Test Sections management");
            System.out.println("Enter any other number to exit.");
            System.out.print("Enter Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Exiting...");
                break;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: {
                    System.out.println("\nTesting University Details Update...");
                    ArrayList<String> classActivities = new ArrayList<>();
                    commonTask task = new commonTask();
                    int options = task.eachClassActivity(academicUnit.listOfActivities(classActivities));

                    switch (options) {
                        case 1:
                            university.nameSet("Test University");
                            System.out.println("Set University Name: " + university.nameGet());
                            break;
                        case 2:
                            university.setLocation("Test City");
                            System.out.println("Set University Location: " + university.getLocation());
                            break;
                        case 3:
                            UniversityNode node = new UniversityNode("CS101", "Dr. Smith");
                            university.addBranch(node);
                            System.out.println("Added New Branch: " + university.lastAddedBranch());
                            break;
                        case 4:
                            commonTask commonTask = new commonTask();
                            commonTask.displayBranchList(university.getRoot());
                            break;
                        default:
                            System.out.println("Invalid Option.");
                    }
                    break;
                }

                case 2: {
                    System.out.println("\nTesting Branch Management...");
                    UniversityNode universityRoot = university.getRoot();
                    Branches branches = new Branches();
                    AcademicUnit academicUnit1 = new Branches();
                    commonTask commonTask = new commonTask();

                    commonTask.displayBranchList(universityRoot);

                    ArrayList<String> branchActivities = new ArrayList<>();
                    int branchChoice = commonTask.eachClassActivity(academicUnit1.listOfActivities(branchActivities));

                    System.out.print("Enter Branch code: ");
                    String bcode = sc.nextLine();

                    if (branchChoice == 1) {
                        BranchNode branchNode = new BranchNode("S1", "Prof. Johnson");
                        branches.addSection(universityRoot, bcode, branchNode);
                        System.out.println("Section Added Successfully!");
                    } else if (branchChoice == 2) {
                        branches.facultyUpdate(universityRoot, bcode, "S1", "Prof. Updated");
                        System.out.println("Faculty Updated Successfully!");
                    } else if (branchChoice == 3) {
                        commonTask.getSectionList(universityRoot, bcode);
                    } else {
                        System.out.println("Invalid Branch Option.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("\nTesting Sections Management...");
                    System.out.println("This feature is not fully implemented yet.");
                    break;
                }

                default: {
                    System.out.println("Thanks for testing. Exiting...");
                    return; // Exit the program
                }
            }
        }
        sc.close();
    }
}
