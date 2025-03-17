package University_Projct;
import java.lang.reflect.Array;
import java.util.*;
class University extends AcademicUnit
{
    private String U_name;
    private String Location;
    private ArrayList<Branches> Branch_list;
    public University()
    {
        this.U_name = "";
        this.Location = "";
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
    public String getLocation()
    {
        return Location;
    }
    @Override
    public String nameGet()
    {
        return U_name;
    }
    @Override
    public ArrayList<String> listOfactivities(ArrayList<String> classItems)
    {   classItems.add("U_name");
        classItems.add("Location");
        classItems.add("Branch List");
        return classItems;
    }
}