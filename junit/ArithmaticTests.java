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
}
