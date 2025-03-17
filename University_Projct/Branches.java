package University_Projct;

import java.util.ArrayList;
import java.util.List;

class Branches extends AcademicUnit implements interfaceList
{
    private String Branch_name;
    private String Branch_HOD;
    private List<Sections> sectionsList;
    @Override
    public void nameSet(String Branch_name)
    {
        this.Branch_name = Branch_name;
    }
    @Override
    public String nameGet()
    {
        return Branch_name;
    }
    @Override
    public ArrayList<String> listOfactivities(ArrayList<String> classItems)
    {   classItems.add("Branch_name");
        classItems.add("Branch_HOD");
        classItems.add("sectionsList");
        return classItems;
    }
}