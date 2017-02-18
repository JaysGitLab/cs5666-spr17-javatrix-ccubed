package junit;
import javatrix.Matrix;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javatrix.Matrix.Operator;

/**
 * Class to test in place arithmetic methods.
 * @author B. Clin tHall
 * @version 1
 **/
public class InPlaceArithmaticTests
{
    /**
    * Test byElementInPlace(Matrix, Matrix, boolean, Operator).
    */
    @Test
    public void byElementInPlaceTest1()
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
        m1.byElement(m2, true, op);
        assertEquals(answer, m1.getArray());
    }

    /**
    * Test byElementInPlace(Matrix, Matrix, boolean, Operator).
    * Different dimensions
    */
    @Test(expected = IllegalArgumentException.class)
    public void byElementInPlaceTest2()
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
        m1.byElement(m2, true, op);
    }
   /**
    * test arrayLeftDivide. No zero denominators
    **/
    @Test
    public void arrayLeftDivideEqualsTest1()
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
        matrix2.arrayLeftDivideEquals(matrix1);
        assertEquals(answer, matrix2.getArray());
    }
   /**
    * test arrayRightDivide. No zero denominators
    **/
    @Test
    public void arrayRightDivideEqualsTest1()
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
        matrix1.arrayRightDivideEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }

   /**
    * test arrayTimes.
    **/
    @Test
    public void arrayTimesEqualsTest1()
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
        matrix1.arrayTimesEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }
   /**
    * test plus.
    **/
    @Test
    public void plusEqualsTest1()
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
        matrix1.plusEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }
   /**
    * test minus. 
    **/
    @Test
    public void minusEqualsTest1()
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
        matrix1.minusEquals(matrix2);
        assertEquals(answer, matrix1.getArray());
    }

    /**
     * testMinusEquals -Tests the matrix subtraction operation A - B.
     */
    @Test
    public void testMinusEquals() 
    {
        double[][] matrixA = {
            {2, 4},
            {6, 8},
            {10, 12}
        };
        double[][] matrixB = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        //correct matrix for A - B
        double[][] correctMatrix = {
            {1, 2},
            {3, 4}, 
            {5, 6}
        };
        Matrix testMatrixA = new Matrix(matrixA);
        Matrix testMatrixB = new Matrix(matrixB);
        testMatrixA = testMatrixA.minusEquals(testMatrixB);
        assertEquals(testMatrixA.getArray(), correctMatrix);
    }
    /**
     * testMinusEquals2 -Test the matrix subtraction operation B - A. 
     */
    @Test
    public void testMinusEquals2() 
    {
        double[][] matrixA = {
            {2, 4},
            {6, 8},
            {10, 12}
        };
        double[][] matrixB = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        //correct matrix for B - A
        double[][] correctMatrix = {
            {-1, -2},
            {-3, -4}, 
            {-5, -6}
        };
        Matrix testMatrixA = new Matrix(matrixA);
        Matrix testMatrixB = new Matrix(matrixB);
        testMatrixB = testMatrixB.minusEquals(testMatrixA);
        assertEquals(testMatrixB.getArray(), correctMatrix);
    }

}

