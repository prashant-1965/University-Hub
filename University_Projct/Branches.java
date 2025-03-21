package University_Projct;

import java.util.ArrayList;

class Branches extends AcademicUnit
{
    public void addSection(UniversityNode root, String bcode, BranchNode node)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(bcode))
            {
                i.branchList.add(node);
                break;
            }
        }
    }
    public void facultyUpdate(UniversityNode root, String bcode, String secCode, String name)
    {
        for(UniversityNode i:root.universityBranch)
        {
            if(i.branchCode.equalsIgnoreCase(bcode))
            {
                for(BranchNode j:i.branchList)
                {
                    if(j.sectionCode.equalsIgnoreCase(secCode))
                    {
                        j.facultyInCharge = name;
                    }
                }
            }
        }
    }
    @Override
    public ArrayList<String> listOfActivities(ArrayList<String> classItems)
    {
        classItems.add("Add section 1");
        classItems.add("Update section in charge 2");
        classItems.add("Section list 3");
        return classItems;
    }
}