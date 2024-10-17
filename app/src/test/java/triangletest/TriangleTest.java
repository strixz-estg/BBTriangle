import triangle.Triangle;  // Caminho correto para a classe Triangle
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        Triangle tester = new Triangle(3, 3, 3);
        assertEquals("equilateral", tester.classify());
        assertTrue(tester.isEquilateral());
        assertFalse(tester.isImpossible());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle tester = new Triangle(2, 3, 4);
        assertEquals("scalene", tester.classify());
        assertTrue(tester.isScalene());
        assertFalse(tester.isImpossible());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle tester = new Triangle(5, 5, 3);
        assertEquals("isossceles", tester.classify());
        assertTrue(tester.isIsosceles());
        assertFalse(tester.isImpossible());
    }

    @Test
    public void testRightAngledTriangle() {
        Triangle tester = new Triangle(3, 4, 5);
        assertEquals("right-angled", tester.classify());
        assertTrue(tester.isRightAngled());
        assertFalse(tester.isImpossible());
    }

    @Test
    public void testImpossibleTriangle() {
        Triangle tester = new Triangle(0, 4, 5);
        assertEquals("impossible", tester.classify());
        assertTrue(tester.isImpossible());
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.001);
    }

    @Test
    public void testSetSideLengths() {
        Triangle triangle = new Triangle(3, 3, 3);
        triangle.setSideLengths(5, 5, 2);
        assertEquals("5,5,2", triangle.getSideLengths());
        assertEquals("isossceles", triangle.classify());
    }

}