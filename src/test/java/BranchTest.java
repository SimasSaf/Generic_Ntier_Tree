import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Node ordering looks like this:
//              1
//             / \
//           2     3
//          /     /|\
//         4     5 6 7
//              /  /\
//             8  9  10
//                    \
//                     11

class BranchTest
{
    Branch node1 = new Branch();
    Branch node2 = new Branch();
    Branch node3 = new Branch();
    Branch node4 = new Branch();
    Branch node5 = new Branch();
    Branch node6 = new Branch();
    Branch node7 = new Branch();
    Branch node8 = new Branch();
    Branch node9 = new Branch();
    Branch node10 = new Branch();
    Branch node11 = new Branch();

    //Hard coding in the tree structure from the assignment, not sure if it was supposed to be like this
    //Didn't really see another solution for that specific tree structure
    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        node1.addBranch(node2);
        node1.addBranch(node3);

        node2.addBranch(node4);

        node3.addBranch(node5);
        node3.addBranch(node6);
        node3.addBranch(node7);

        node5.addBranch(node8);

        node6.addBranch(node9);
        node6.addBranch(node10);

        node9.addBranch(node11);
    }
    //I did not set up a deletion method, but it would also traverse the tree
    //and delete elements from the bottom to the top

    @Test
    void depthFromNode1AsPresentedInAssignment()
    {
        assertEquals(5, node1.getDepth());
    }

    //Some more exceptional cases:
    @Test
    void depthFromNode2()
    {
        assertEquals(2, node2.getDepth());
    }

    @Test
    void depthFromNode3()
    {
        assertEquals(4, node3.getDepth());
    }

    @Test
    void depthFromNode4()
    {
        assertEquals(1, node4.getDepth());
    }

    @Test
    void depthFromNode6()
    {
        assertEquals(3, node6.getDepth());
    }


}