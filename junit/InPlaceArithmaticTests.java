package junit;
import javatrix.Matrix;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InPlaceArithmaticTests{
    /**
    * Test byElementInPlace(Matrix, Matrix, boolean, Operator).
    */
    @Test
    public void byElementInPlaceTest1(){
        double[][] a1 = {
            {  1.0,   2.0,   3.0,   4.0}, 
            {  5.0,   6.0,   7.0,   8.0}, 
            {  9.0,  10.0,  11.0,  12.0}
        };
        Matrix m1 = new Matrix(a1);
        double[][] a2 = {
            { -3.0,  -4.0,  -5.0,  -6.0}, 
            { -7.0,  -8.0,  -9.0, -10.0}, 
            {-11.0, -12.0, -13.0, -14.0}
        };
        Matrix m2 = new Matrix(a2);
        double[][] answer = {
            { -2.0, -2.0, -2.0, -2.0},
            { -2.0, -2.0, -2.0, -2.0},
            { -2.0, -2.0, -2.0, -2.0}
        };
        m1.byElement(m2, true, (a, b) -> a + b);
        assertEquals(answer, m1.getArray());
    }

    /**
    * Test byElementInPlace(Matrix, Matrix, boolean, Operator). Different dimensions
    */
    @Test(expected = IllegalArgumentException.class)
    public void byElementInPlaceTest2(){
        double[][] a1 = {
            {  1.0,   2.0,   3.0,   4.0}, 
            {  5.0,   6.0,   7.0,   8.0}, 
            {  9.0,  10.0,  11.0,  12.0}
        };
        Matrix m1 = new Matrix(a1);
        double[][] a2 = {
            { -3.0,  -4.0,  -5.0}, 
            { -7.0,  -8.0,  -9.0}, 
            {-11.0, -12.0, -13.0}
        };
        Matrix m2 = new Matrix(a2);
        m1.byElement(m2, true, (a, b) -> a + b);
    }
   /*
    * test arrayLeftDivide. No zero denominators
    **/
    @Test
    public void arrayLeftDivideEqualsTest1(){
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            { 3.0, 5.0},
            { 9.0, 6.0},
            { 3.0, 2.0}
        };
        double[][] answer = {
            {21.0 / 3.0, 15.0 / 5.0},
            {18.0 / 9.0, 30.0 / 6.0},
            {27.0 / 3.0, 10.0 / 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        matrix2.arrayLeftDivideEquals(matrix1);
        assertEquals(answer, matrix2.getArray());
    }
   /*
    * test arrayRightDivide. No zero denominators
    **/
    @Test
    public void arrayRightDivideEqualsTest1(){
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            { 3.0, 5.0},
            { 9.0, 6.0},
            { 3.0, 2.0}
        };
        double[][] answer = {
            {21.0 / 3.0, 15.0 / 5.0},
            {18.0 / 9.0, 30.0 / 6.0},
            {27.0 / 3.0, 10.0 / 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        matrix1.arrayRightDivideEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }

   /*
    * test arrayTimes.
    **/
    @Test
    public void arrayTimesEqualsTest1(){
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            { 3.0, 5.0},
            { 9.0, 6.0},
            { 3.0, 2.0}
        };
        double[][] answer = {
            {21.0 * 3.0, 15.0 * 5.0},
            {18.0 * 9.0, 30.0 * 6.0},
            {27.0 * 3.0, 10.0 * 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        matrix1.arrayTimesEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }
   /*
    * test plus.
    **/
    @Test
    public void plusEqualsTest1(){
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            { 3.0, 5.0},
            { 9.0, 6.0},
            { 3.0, 2.0}
        };
        double[][] answer = {
            {21.0 + 3.0, 15.0 + 5.0},
            {18.0 + 9.0, 30.0 + 6.0},
            {27.0 + 3.0, 10.0 + 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        matrix1.plusEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }
   /*
    * test minus. 
    **/
    @Test
    public void minusEqualsTest1(){
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            { 3.0, 5.0},
            { 9.0, 6.0},
            { 3.0, 2.0}
        };
        double[][] answer = {
            {21.0 - 3.0, 15.0 - 5.0},
            {18.0 - 9.0, 30.0 - 6.0},
            {27.0 - 3.0, 10.0 - 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        matrix1.minusEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }


}
