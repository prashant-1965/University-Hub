package University_Projct;
import java.util.ArrayList;

class Student extends AcademicUnit
{
    @Override
    public ArrayList<String> listOfActivities(ArrayList<String> classItems)
    {
        classItems.add("Add new Student 1");
        classItems.add("Get Section details 2");
        return classItems;
    }
}