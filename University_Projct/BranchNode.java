package University_Projct;

import java.util.ArrayList;

public class BranchNode {
    public String sectionCode;
    public String facultyInCharge;
    public ArrayList<StudentNode> studentList;
    public BranchNode(String sectionCode, String facultyInCharge)
    {
        this.sectionCode = sectionCode;
        this.facultyInCharge = facultyInCharge;
        this.studentList = new ArrayList<>();
    }
}
