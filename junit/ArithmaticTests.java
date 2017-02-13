package junit;
import javatrix.Matrix;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javatrix.Matrix.Operator;

/**
 * Class to test non-in place arithmetic methods.
 * @author B. Clint Hall
 *  @version 1
 **/
public class ArithmaticTests
{
    /**
    * Test byElement(Matrix, Matrix, Operator).
    */
    @Test
    public void byElementTest1()
    {
        double[][] a1 = {
            {1.0,   2.0,   3.0,   4.0}, 
            {5.0,   6.0,   7.0,   8.0}, 
            {9.0,  10.0,  11.0,  12.0}
        };
        Matrix m1 = new Matrix(a1);
        double[][] a2 = {
            {-3.0,  -4.0,  -5.0,  -6.0}, 
            {-7.0,  -8.0,  -9.0, -10.0}, 
            {-11.0, -12.0, -13.0, -14.0}
        };
        Matrix m2 = new Matrix(a2);
        double[][] answer = {
            {-2.0, -2.0, -2.0, -2.0},
            {-2.0, -2.0, -2.0, -2.0},
            {-2.0, -2.0, -2.0, -2.0}
        };
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a + b;
            }
        };
        Matrix m3 = m1.byElement(m2, false, op);
        assertEquals(answer, m3.getArray());
    }

    /**
    * Test byElement(Matrix, Matrix, Operator). Different dimensions
    */
    @Test(expected = IllegalArgumentException.class)
    public void byElementTest2()
    {
        double[][] a1 = {
            {1.0,   2.0,   3.0,   4.0}, 
            {5.0,   6.0,   7.0,   8.0}, 
            {9.0,  10.0,  11.0,  12.0}
        };
        Matrix m1 = new Matrix(a1);
        double[][] a2 = {
            {-3.0,  -4.0,  -5.0}, 
            {-7.0,  -8.0,  -9.0}, 
            {-11.0, -12.0, -13.0}
        };
        Matrix m2 = new Matrix(a2);
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a + b;
            }
        };
        Matrix m3 = m1.byElement(m2, false, op);
    }
   /**
    * test arrayLeftDivide. No zero denominators
    **/
    @Test
    public void arrayLeftDivideTest1()
    {
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            {3.0, 5.0},
            {9.0, 6.0},
            {3.0, 2.0}
        };
        double[][] answer = {
            {21.0 / 3.0, 15.0 / 5.0},
            {18.0 / 9.0, 30.0 / 6.0},
            {27.0 / 3.0, 10.0 / 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix2.arrayLeftDivide(matrix1);
        assertEquals(answer, matrix3.getArray());
    }
   /**
    * test arrayRightDivide. No zero denominators
    **/
    @Test
    public void arrayRightDivideTest1()
    {
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            {3.0, 5.0},
            {9.0, 6.0},
            {3.0, 2.0}
        };
        double[][] answer = {
            {21.0 / 3.0, 15.0 / 5.0},
            {18.0 / 9.0, 30.0 / 6.0},
            {27.0 / 3.0, 10.0 / 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix1.arrayRightDivide(matrix2);
        assertEquals(answer, matrix3.getArray());
    }

   /**
    * test arrayTimes.
    **/
    @Test
    public void arrayTimesTest1()
    {
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            {3.0, 5.0},
            {9.0, 6.0},
            {3.0, 2.0}
        };
        double[][] answer = {
            {21.0 * 3.0, 15.0 * 5.0},
            {18.0 * 9.0, 30.0 * 6.0},
            {27.0 * 3.0, 10.0 * 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix1.arrayTimes(matrix2);
        assertEquals(answer, matrix3.getArray());
    }
   /**
    * test plus.
    **/
    @Test
    public void plusTest1()
    {
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            {3.0, 5.0},
            {9.0, 6.0},
            {3.0, 2.0}
        };
        double[][] answer = {
            {21.0 + 3.0, 15.0 + 5.0},
            {18.0 + 9.0, 30.0 + 6.0},
            {27.0 + 3.0, 10.0 + 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix1.plus(matrix2);
        assertEquals(answer, matrix3.getArray());
    }
   /**
    * test minus. 
    **/
    @Test
    public void minusTest1()
    {
        double[][] a1 = {
            {21.0, 15.0},
            {18.0, 30.0},
            {27.0, 10.0}
        };
        double[][] a2 = {
            {3.0, 5.0},
            {9.0, 6.0},
            {3.0, 2.0}
        };
        double[][] answer = {
            {21.0 - 3.0, 15.0 - 5.0},
            {18.0 - 9.0, 30.0 - 6.0},
            {27.0 - 3.0, 10.0 - 2.0}
        };
        Matrix matrix1 = new Matrix(a1);
        Matrix matrix2 = new Matrix(a2);
        Matrix matrix3 = matrix1.minus(matrix2);
        assertEquals(answer, matrix3.getArray());
    }
}

