import java.util.LinkedList;
import java.util.List;

public class Branch
{
    List<Branch> branches = new LinkedList<>();

    public void addBranch(Branch newBranch)
    {
        branches.add(newBranch);
    }

    //The complexity is O(n) as we are traversing all the elements one time
    // and also going up roughly half of the time
    public int getDepth()
    {
        while(branches.size() != 0)
        {
            int depth = 0;
            for (Branch b : branches)
            {
                //total depth of a one branch/path
                int belowDepth = b.getDepth();

                //take the longest depth and keep the value
                if(depth < belowDepth)
                {
                    depth = belowDepth;
                }
            }
            //if not a leaf node return depth + 1
            return depth + 1;
        }
        //return 1 if its a leaf node
        return 1;
    }

}
