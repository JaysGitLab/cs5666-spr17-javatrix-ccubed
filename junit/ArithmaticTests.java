package junit;
import javatrix.Matrix;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArithmaticTests{
    /**
    * Test byElement(Matrix, Matrix, Operator).
    */
    @Test
    public void byElementTest1(){
        double[][] a1 = {
            {  1,   2,   3,   4}, 
            {  5,   6,   7,   8}, 
            {  9,  10,  11,  12}
        };
        Matrix m1 = new Matrix(a1);
        double[][] a2 = {
            { -3,  -4,  -5,  -6}, 
            { -7,  -8,  -9, -10}, 
            {-11, -12, -13, -14}
        };
        Matrix m2 = new Matrix(a2);
        double[][] answer = {
            { -2, -2, -2, -2},
            { -2, -2, -2, -2},
            { -2, -2, -2, -2}
        };
        Matrix m3 = Matrix.byElement(m1, m2, (a, b) -> a + b);
        assertEquals(answer, m3.getArray());
    }

    /**
    * Test byElement(Matrix, Matrix, Operator). Different dimensions
    */
    @Test(expected = IllegalArgumentException.class)
    public void byElementTest2(){
        double[][] a1 = {
            {  1,   2,   3,   4}, 
            {  5,   6,   7,   8}, 
            {  9,  10,  11,  12}
        };
        Matrix m1 = new Matrix(a1);
        double[][] a2 = {
            { -3,  -4,  -5}, 
            { -7,  -8,  -9}, 
            {-11, -12, -13}
        };
        Matrix m2 = new Matrix(a2);
        Matrix m3 = Matrix.byElement(m1, m2, (a, b) -> a + b);
    }
   /*
    * test arrayLeftDivide. No zero denominators
    **/
    @Test
    public void arrayLeftDivideTest1(){
        double[][] a1 = {
            {21, 15},
            {18, 30},
            {27, 10}
        };
        double[][] a2 = {
            { 3, 5},
            { 9, 6},
            { 3, 2}
        };
        double[][] answer = {
            { 7, 3},
            { 2, 5},
            { 9, 5}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix1.arrayLeftDivide(matrix2);
        assertEquals(answer, matrix3.getArray());
    }
   /*
    * test arrayRightDivide. No zero denominators
    **/
    @Test
    public void arrayRightDivideTest1(){
        double[][] a1 = {
            {21, 15},
            {18, 30},
            {27, 10}
        };
        double[][] a2 = {
            { 3, 5},
            { 9, 6},
            { 3, 2}
        };
        double[][] answer = {
            { 7, 3},
            { 2, 5},
            { 9, 5}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix2.arrayRightDivide(matrix1);
        assertEquals(answer, matrix3.getArray());
    }
}
