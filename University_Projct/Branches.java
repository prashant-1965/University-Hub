package University_Projct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class BranchNode
{
    private String Branch_code;
    private String HOD_code;
    private ArrayList<BranchNode> sectionList;
}

class Branches extends AcademicUnit
{
    private String Branch_code;
    private String HOD_code;
    private Map<String,ArrayList<Sections>> branchList;
    public Branches()
    {
        branchList = new HashMap<>();
    }
    public void setBranch(String b_code, Sections sec)
    {
        ArrayList<Sections> temp;
        if(branchList.containsKey(b_code))
        {
            temp = branchList.get(b_code);
            temp.add(sec);
        }
        else
        {
            temp = new ArrayList<>();
            temp.add(sec);
            branchList.put(b_code,temp);
        }
        System.out.println("Section added successfully");
    }
    @Override
    public ArrayList<String> listOfActivities(ArrayList<String> classItems)
    {   classItems.add("Add new Branch_name, Branch_HOD and sectionsList 1");
        classItems.add("Add new Branch_HOD 2");
        classItems.add("sectionsList 3");
        return classItems;
    }
}