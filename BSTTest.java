package Test;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class BSTTest extends TestCase {
    BST tree;

    @Override
    protected void setUp() throws Exception {
        tree = new BST();
    }

    @Test
    public void testRemoveNodeWithOneChildAtRight() throws Exception {
        tree.add(15);
        tree.add(20);
        tree.add(10);
        tree.remove(20);
        assertTrue(tree.contains(15));
        assertFalse(tree.contains(20)); //removed
        assertTrue(tree.contains(10));
    }

    @Test
    public void testRemoveNodeWithOneChildAtLeft() throws Exception {
        tree.add(20);
        tree.add(15);
        tree.add(30);
        tree.remove(15);
        assertFalse(tree.contains(15));
        assertTrue(tree.contains(20));
        assertTrue(tree.contains(30));
    }


    @Test
    public void testRemoveNodeWithTwoChildren() throws Exception {
        tree.add(15);
        tree.add(20);
        tree.add(45);
        tree.add(2);
        tree.add(180);
        tree.add(17);
        tree.add(90);
        tree.add(31);
        tree.remove(20);
        assertEquals("Replaced 20 to 31.", new Integer(31), tree.root.getRight().getData());
        assertEquals("Tree is ...", "2 15 17 31 45 90 180 ", tree.toString());
    }
}
