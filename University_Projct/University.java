package University_Projct;

import java.util.*;

class UniversityNode
{
    public String branchCode;
    public ArrayList<UniversityNode> branchList;
    public UniversityNode(String branchCode)
    {
        this.branchCode = branchCode;
        this.branchList = new ArrayList<>();
    }
}
class University extends AcademicUnit  implements interfaceList
{
    private String U_name;
    private String Location;
    private String lastBranchCode;
    private final UniversityNode defaultBranch;

    public University()
    {
        this.defaultBranch = new UniversityNode("U0001");
        this.lastBranchCode = "U0001";
    }

    @Override
    public void nameSet(String u_name)
    {
        this.U_name = U_name;
    }
    public void setLocation(String Location)
    {
        this.Location = Location;
    }
    @Override
    public String nameGet()
    {
        return U_name;
    }
    public String getLocation()
    {
        return Location;
    }
    public void addBranch(UniversityNode node)
    {
        defaultBranch.branchList.add(node);
        lastBranchCode = node.branchCode;
        System.out.println("Branch Added Successfully!");
    }

    public void displayAlLBranch()
    {
        for(UniversityNode i:defaultBranch.branchList)
        {
            System.out.println(i.branchCode);
        }
    }
    public String lastAddedBranch()
    {
        return lastBranchCode;
    }
    @Override
    public ArrayList<String> listOfActivities(ArrayList<String> classItems)
    {
        classItems.add("U_name 1");
        classItems.add("Location 2");
        classItems.add("Add branch 3");
        classItems.add("Display all available branches 4");
        return classItems;
    }
}