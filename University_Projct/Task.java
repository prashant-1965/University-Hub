package University_Projct;
import java.util.ArrayList;

class Task{
    public void eachClassActivity (AcademicUnit classObjects) {
        ArrayList<String> activities = new ArrayList<>();
        classObjects.listOfactivities(activities);
        System.out.println("Activities to perform");
        for (String i : activities) {
            System.out.println(i);
        }
    }
}
