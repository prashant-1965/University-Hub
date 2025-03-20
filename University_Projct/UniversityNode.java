package University_Projct;

import java.util.*;

public class UniversityNode
{
    public String branchCode;
    public String branchHOD;
    public List<UniversityNode> universityBranch;
    public List<BranchNode> branchList;
    public UniversityNode(String branchCode)
    {
        this.branchCode = branchCode;
        this.universityBranch = new ArrayList<>();
    }
    public UniversityNode(String branchCode, String branchHOD)
    {
        this.branchCode = branchCode;
        this.branchHOD = branchHOD;
        this.branchList = new ArrayList<>();
    }
}
