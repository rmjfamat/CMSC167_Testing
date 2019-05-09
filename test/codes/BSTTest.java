package codes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mmcalvarez on 3/5/2019.
 */
public class BSTTest {

    BST tree = new BST();

    @Test
    public void testRemoveOneChild() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("krishia");
        tree.remove("mary");
        assertFalse(tree.contains("mary"));
        assertTrue(tree.contains("sab"));
        assertTrue(tree.contains("krishia"));
    }

    @Test
    public void testAddMany() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("krishia");
        tree.add("chez");
        tree.add("uye");
        assertEquals(tree.toString(), "chez krishia mary sab uye ");
    }

    @Test
    public void testContains() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("chez");
        tree.add("krishia");
        tree.add("dianne");
        assertTrue(tree.contains("mary"));
        assertFalse(tree.contains("cza"));
        assertEquals("Tree is ...", "chez dianne krishia mary sab ", tree.toString());
    }

}