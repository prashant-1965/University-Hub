package University_Projct;
import java.util.ArrayList;
import java.util.Scanner;

class Task{
    public int eachClassActivity (AcademicUnit classObjects) {
        ArrayList<String> activities = new ArrayList<>();
        classObjects.listOfactivities(activities);
        System.out.println("Activities to perform");
        for (String i : activities) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        sc.close();
        return ch;
    }
}
