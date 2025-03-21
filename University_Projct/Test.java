package University_Projct;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AcademicUnit academicUnit = new University();
        University university = new University();
        Scanner sc = new Scanner(System.in);

        System.out.println("Testing University Project Functionalities");

        System.out.println("Testing University Name Set and Get:");
        university.nameSet("Test University");
        System.out.println("Expected: Test University, Got: " + university.nameGet());

        System.out.println("Testing University Location Set and Get:");
        university.setLocation("Test Location");
        System.out.println("Expected: Test Location, Got: " + university.getLocation());

        System.out.println("Testing Adding a Branch:");
        UniversityNode branchNode = new UniversityNode("CS101", "Dr. Smith");
        university.addBranch(branchNode);
        System.out.println("Last Added Branch: " + university.lastAddedBranch());

        System.out.println("Testing Branch List Display:");
        UniversityNode universityRoot = university.getRoot();
        commonTask commonTask = new commonTask();
        commonTask.displayBranchList(universityRoot);

        System.out.println("Testing Section Addition:");
        Branches branches = new Branches();
        BranchNode sectionNode = new BranchNode("S1", "Prof. Johnson");
        branches.addSection(universityRoot, "CS101", sectionNode);
        System.out.println("Section Added Successfully");

        System.out.println("Testing Faculty Update:");
        branches.facultyUpdate(universityRoot, "CS101", "S1", "Dr. Watson");
        System.out.println("Faculty Updated Successfully");
    }
}
