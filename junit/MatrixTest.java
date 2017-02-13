package junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;
import javatrix.Matrix;
import java.util.Random;

/**
 * MatrixTest
 * Junit tests for the Matrix class.
 * @author Chris Campell
 * @author Chris Waldon
 * @author Clint Hall
 * @version 2/9/2017
 */
public class MatrixTest
{
    //Matrix(double[][] A){}
    /**
     * when constructor is passed an m x n matrix, 
     * getArray should return an array equal to it.
     */
    @Test
    public void testMatrixConstructor1a()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix m = new Matrix(array);
        double[][] array2 = m.getArray();
        assertEquals(array, array2);
    }
    /**
     *  Underlying array should not be
     *  same object as array past to constructor.
     */
    @Test
    public void testMatrixContructor1b()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix m = new Matrix(array);
        double[][] array2 = m.getArray();
        assertNotSame(array, array2);
    }
    /**
     * Constructor should throw java.lang.IllegalArgumentException if 
     * rows get longer. 
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMatrixConstructor1c()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5, 6, 7}
        };
        Matrix m = new Matrix(array);
    }
    /**
     * Constructor should throw java.lang.IllegalArgumentException if 
     * rows get shorter.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMatrixConstructor1d()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5}
        };
        Matrix m = new Matrix(array);
    }
    /**
     * baseCtorSameLength -When constructor is passed an m x n matrix, 
     *  getArray should return an array equal to it.
     */
    @Test
    public void baseCtorSameLength()
    {
        double[][] array = 
        {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix m = new Matrix(array, 2, 3);
        double[][] array2 = m.getArray();
        assertEquals(array, array2);
    }
    /**
     * baseCtorNotSameObj -Underlying array should not be the
     *  same object as array past to constructor.
     */
    @Test
    public void baseCtorNotSameObj()
    {
        double[][] array = {
    	    {1, 2, 3},
    	    {4, 5, 6}
        };
        Matrix m = new Matrix(array, 2, 3);
        double[][] array2 = m.getArray();
        assertNotSame(array, array2);
    }
    /**
     * tooLong -Constructor should make m x n array even 
     *  if some rows are longer.
     */
    @Test
    public void tooLong()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5, 6, 6.5}
        };
        Matrix m = new Matrix(array, 2, 3);

        double[][] array2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertEquals(array2, m.getArray());
    }
    /**
     * tooShort -Rows less than n long should be padded with 0 on right.
     */
    @Test
    public void tooShort()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5}
        };
        Matrix m = new Matrix(array, 2, 3);
        
        double[][] array2 = {
            {1, 2, 3},
            {4, 5, 0}
        };
        assertEquals(array2, m.getArray());
    }
    /**
     * tooSmall -Matrix should be m x n even if provided array is smaller.
     */
    @Test
    public void tooSmall()
    {
        double[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix m = new Matrix(array, 3, 4);
        double[][] array2 = {
            {1, 2, 3, 0},
            {4, 5, 6, 0},
            {0, 0, 0, 0}
        };
        assertEquals(array2, m.getArray());
    }
    //Matrix(double[] vals, int m){}
    /**
     * testConstructor3a -Try to get right answer for easy case.
    */
    @Test
    public void testConstructor3a()
    {
        double[][] correctAnswer = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix m = new Matrix(new double[]{1, 2, 3, 4, 5, 6}, 2);
        assertEquals(correctAnswer, m.getArray());
    }
    /**
     * testConstructor3b -Try to get right answer for easy case.
    */
    @Test
    public void testConstructor3b()
    {
        double[][] correctAnswer = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        Matrix m = new Matrix(new double[]{1, 2, 3, 4, 5, 6}, 3);
        assertEquals(correctAnswer, m.getArray());
    }
    /**
     * Get error for array length not divisible by row count.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor3c()
    {
        Matrix m = new Matrix(new double[]{1, 2, 3, 4, 5, 6}, 4);
    }
    //Matrix(int m, int n)
    /**
     * testMatrixConstructor4a -Tests the fourth matrix constructor
     * with valid parameters as specified in issue #7.
    **/
    @Test
    public void testMatrixConstructor4a()
    {
        //initialize m (num rows).
        int m = 5;
        //initialize n (num cols).
        int n = 6;
        double[][] correctMatrix = {
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
        };
        Matrix matrix = new Matrix(m, n);
        assertEquals(matrix.getArray(), correctMatrix);
    }
    /**
     * testMatrixConstructor3b -Tests the third matrix constructor,
     *  with illegal arguments as specified in issue #7.
    **/
    @Test(expected = IllegalArgumentException.class)
    public void testMatrixConstructor4b()
    {
        //intialize m (num rows).
        int m = 0;
        //intialize n (num cols).
        int n = 5;
        Matrix matrix = new Matrix(m, n);
    }
    /**
     * testMatrixConstructor3c -Tests the third matrix constructor,
     *  with illegal arguments as specified in issue #7.
    **/
    @Test(expected = IllegalArgumentException.class)
    public void testMatrixConstructor4c()
    {
        //intialize m (num rows).
        int m = -3;
        //intialize n (num cols).
        int n = -5;
        Matrix matrix = new Matrix(m, n);
    }        
    //Matrix(int m, int n, double s){}
    /**
    testCtorFillWithConst tests the Matrix constructor that fills a
    matrix of m by n with constant s.
    */
    @Test
    public void testCtorFillWithConst()

    {
        double fill = 3.14;
        int rows = 3;
        int cols = 2;
        Matrix matrixA = new Matrix(rows, cols, fill);
        double[][] arrA = matrixA.getArray();
        assertEquals(arrA.length, rows);
        assertEquals(arrA[0].length, cols);
        for (int i = 0; i < arrA.length; i++)
        {
            for (int k = 0; k < arrA[i].length; k++)
            {
                assertEquals(arrA[i][k], fill, 0.0);
            }
        }
    }
    /**
    testCtorFillWithConst tests the Matrix constructor that fills a
    matrix of m by n with constant s.
    */
    @Test(expected = IllegalArgumentException.class)
    public void testCtorFillWithConsta()
    {
        double fill = 3.14;
        int rows = 0;
        int cols = 1;
        Matrix matrixA = new Matrix(rows, cols, fill);
    }
    /**
    *testCtorFillWithConst tests the Matrix constructor that fills a
    *   matrix of m by n with constant s.
    */
    @Test(expected = IllegalArgumentException.class)
    public void testCtorFillWithConstb()
    {
        double fill = 3.14;
        int rows = 3;
        int cols = -1;
        Matrix matrixA = new Matrix(rows, cols, fill);
    }

    /**
     * testGetRowDim -Tests the getRowDim getter method.
     */
    @Test
    public void testGetRowDim() 
    {
        Random rand = new Random();
        int numRows = rand.nextInt(10) + 1;
        int numCols = rand.nextInt(10) + 1;
        Matrix matrix = new Matrix(numRows, numCols);
        assertEquals(numRows, matrix.getRowDimension());
        //TODO: What about jagged matrices? 
    }

    //Matrix arrayLeftDivide(Matrix B){return null;}

    //Matrix arrayLeftDivideEquals(Matrix B){return null;}

    //Matrix arrayRightDivide(Matrix B){return null;}

    //Matrix arrayRightDivideEquaqals(Matrix B){return null;}

    //Matrix arrayTimes(Matrix B){return null;}

    //Matrix arrayTimesEquals(Matrix B){return null;}

    //protected java.lang.Object clone(){return null;}

    //static Matrix constructWithCopy(double[][] A){return null;}

    //Matrix copy(){return null;}

    /**
     * testGet -Tests the functionality of the get method
     *  in retrieving the element at the specified index.
     */
    @Test
    public void testGet() 
    {
        double[][] testMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Matrix matrix = new Matrix(testMatrix);
        int[] testIndex = new int[2];
        Random rand = new Random();
        //create the index 'i' for which to test equivalency
        testIndex[0] = rand.nextInt(2);
        //create the index 'j' for which to test equivalency
        testIndex[1] = rand.nextInt(3); 
        assertEquals(testMatrix[testIndex[0]][testIndex[1]], 
            matrix.get(testIndex[0], testIndex[1]), .1);
    }

    /**
     * testGetException -Tests the functionality of the get method
     *  in throwing an IndexOutOfBoundsException.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetException() 
    {
        double[][] testMatrix = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}
        };
        Matrix matrix = new Matrix(testMatrix);
        int[] testIndex = new int[2];
        //create the index 'i' for which to test equivalency
        testIndex[0] = testMatrix.length;
        //create the index 'j' for which to test equivalency
        testIndex[1] = -1; 
        matrix.get(testIndex[0], testIndex[1]);
    }

    //double[][] getArray(){return null;}

    //double[][] getArrayCopy(){return null;}

    //int getColumnDimension(){return 0;}

    //double[] getColumnPackedCopy(){return null;}

    //Matrix getMatrix(int[] r, int[] c){return null;}%

    //Matrix getMatrix(int[] r, int j0, int j1){return null;}

    //Matrix getMatrix(int i0, int i1, int[] c){return null;}

    //Matrix getMatrix(int i0, int i1, int j0, int j1){return null;}

    //int getRowDimension(){return 0;}

    //double[] getRowPackedCopy(){return null;}

    //static Matrix identity(int m, int n){return null;}

    //Matrix minus(Matrix B){return null;}

    //Matrix minusEquals(Matrix B){return null;}

    //double norm1(){return 0;}

    //double normF(){return 0;}

    //double normInf(){return 0;}

    //Matrix plus(Matrix B){return null;}

    //Matrix plusEquals(Matrix B){return null;}

    //void print(int w, int d){}

    //void print(java.text.NumberFormat format, int width){}

    //void print(java.io.PrintWriter output, int w, int d){}

    //void print(java.io.PrintWriter output, 
    //  java.text.NumberFormat format, int width){}

    //static Matrix random(int m, int n){return null;}

    //static Matrix read(java.io.BufferedReader input){return null;}

    //void set(int i, int j, double s){}

    //void setMatrix(int[] r, int[] c, Matrix X){}

    //void setMatrix(int[] r, int j0, int j1, Matrix X){}

    //void setMatrix(int i0, int i1, int[] c, Matrix X){}

    //void setMatrix(int i0, int i1, int j0, int j1, Matrix X){}

    //Matrix times(double s){return null;}

    //Matrix times(Matrix B){return null;}

    //Matrix timesEquals(double s){return null;}

    //double trace(){return 0;}

    //Matrix transpose(){return null;}
    /**
     * test transpose on an example.
     **/
    @Test
    public void transposeTest1()
    {
        double[][] a1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] answer = {
            {1, 4},
            {2, 5},
            {3, 6}
        };
        Matrix m1 = new Matrix(a1);
        Matrix m2 = m1.transpose();
        assertEquals(answer, m2.getArray());
    }
    

    //Matrix uminus(){return null;}
}

