package University_Projct;

import java.util.ArrayList;

class Branches extends AcademicUnit
{
    @Override
    public ArrayList<String> listOfActivities(ArrayList<String> classItems)
    {
        classItems.add("Add section 1");
        classItems.add("Update section in charge 2");
        classItems.add("Section list 2");
        return classItems;
    }
}