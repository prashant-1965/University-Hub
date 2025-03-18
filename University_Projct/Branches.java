package University_Projct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Branches extends AcademicUnit implements interfaceList
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
    public void nameSet(String Branch_code, String HOD_code, Map<String,ArrayList<Sections>> branchList)
    {
        this.Branch_code = Branch_code;
        this.HOD_code = HOD_code;
        this.branchList = branchList;
    }
    @Override
    public String nameGet()
    {
        return Branch_name;
    }
    @Override
    public ArrayList<String> listOfactivities(ArrayList<String> classItems)
    {   classItems.add("Add new Branch_name, Branch_HOD and sectionsList 1");
        classItems.add("Add new Branch_HOD 2");
        classItems.add("sectionsList 3");
        return classItems;
    }
}