package University_Projct;
import java.util.ArrayList;
import java.util.Scanner;

class commonTask {
    public int eachClassActivity (ArrayList<String> activities) {
        System.out.println("Activities to perform");
        for (String i : activities) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        sc.close();
        return ch;
    }
    public void displayBranchList(UniversityNode root)
    {
        for(UniversityNode i:root.universityBranch)
        {
            System.out.println("Branch code: "+i.branchCode+"Branch HOD: "+i.branchHOD);
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
    public void treeTraversing(UniversityNode root, String code, BranchNode node)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(code))
            {
                root.branchList.add(node);
                break;
            }
        }
    }
    public void treeTraversing(UniversityNode root, String code, String secCode, String name)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(code))
            {
                for(BranchNode j:root.branchList)
                {
                    if(j.sectionCode.equalsIgnoreCase(secCode))
                    {
                        j.facultyInCharge = name;
                    }
                }
            }
        }
    }
    public void treeTraversing(UniversityNode root, String code, String secCode)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(code))
            {
                for(BranchNode j:root.branchList)
                {
                    System.out.println(j.sectionCode+" "+j.facultyInCharge);
                }
            }
        }
    }

}
