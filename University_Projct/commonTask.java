package University_Projct;
import java.util.ArrayList;
import java.util.Scanner;

class commonTask {
    public int eachClassActivity (ArrayList<String> activities) {
        System.out.println("Activities to perform");
        for (String i : activities) {
            System.out.println("              "+i);
        }
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter you choice: ");
        int num = sca.nextInt();
        sca.nextLine();  // Consume the leftover newline
        return num;
    }
    public void displayBranchList(UniversityNode root)
    {
        if(root.universityBranch==null)
        {
            System.out.println("No branch Has been Added yet!");
        }
        else
        {
            for (UniversityNode i : root.universityBranch) {
                System.out.println("Branch code: " +i.branchCode+" Branch HOD: " + i.branchHOD);
            }
        }
    }

    public boolean isBranchValid(UniversityNode root, String code)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(code))
            {
                return  true;
            }
        }
        return  false;
    }

    public void getSectionList(UniversityNode root, String bcode)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(bcode))
            {
                for(BranchNode j:i.branchList)
                {
                    System.out.println(j.sectionCode+" "+j.facultyInCharge);
                }
            }
        }
    }

}
