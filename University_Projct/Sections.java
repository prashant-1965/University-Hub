package University_Projct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Sections extends AcademicUnit
{
    private final Map<String,ArrayList<String>> section_instructorList;
    public Sections()
    {
        section_instructorList = new HashMap<>();
    }
    public void setSection(String section_code)
    {
        if(section_instructorList.containsKey(section_code))
        {
            System.out.println("Section Already exists");
        }
        else
        {
            ArrayList<String> temp = new ArrayList<>();
            section_instructorList.put(section_code,temp);
            System.out.println("Section added Successfully");
        }
    }
    public void getSection(String section_code)
    {
        if(section_instructorList.containsKey(section_code))
        {
            Set<String> temp = section_instructorList.keySet();
            if(temp.size()==1)
            {
                System.out.println("ans no faculty has assigned");
            }
            else
            {
                for (String i : temp) {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("No section found!");
            setSection(section_code);
        }
    }
    public void setFaculty(String section_code, String id)
    {
        if(section_instructorList.containsKey(section_code))
        {
            section_instructorList.get(section_code).add(id);
            System.out.println("Faculty Added Successfully!");
        }
        else
        {
            System.out.println("No section has been found");
        }
    }
    @Override
    public ArrayList<String> listOfActivities(ArrayList<String> classItems)
    {
        classItems.add("Add new Section 1");
        classItems.add("Get Section details 2");
        classItems.add("Add new Faculty 3");
        return classItems;
    }
}