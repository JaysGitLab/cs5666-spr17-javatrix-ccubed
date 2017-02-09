package junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;
import javatrix.Matrix;
import java.lang.IllegalArgumentException;

public class MatrixTest{
    //Matrix(double[][] A){}

    //Matrix(double[][] A, int m, int n){}
    // when constructor is passed an m x n matrix, 
    // getArray should return an array equal to it.
    @Test
    public void baseCtorSameLength(){
	double[][] array = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	Matrix m = new Matrix(array, 3, 3);
	double[][] array2 = m.getArray();
        assertEquals(array, array2);

    }
    // Underlying array should not be same object as array past to constructor
    @Test
    public void baseCtorNotSameObj(){
	double[][] array = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	Matrix m = new Matrix(array, 3, 3);
	double[][] array2 = m.getArray();
        assertNotSame(array, array2);
    }
    // constructor should make m x n  array even if some rows are longer
    @Test
    public void tooLong(){
        double[][] array = {
            {1,2,3},
            {4,5,6, 6.5},
            {7,8,9}
        };
        Matrix m = new Matrix(array, 3, 3);

        double[][] array2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        assertEquals(array2, m.getArray());
    }
    // rows less than n long should be padded with 0 on right
    @Test
    public void tooShort(){
        double[][] array = {
            {1,2,3},
            {4,5,},
            {7,8,9}
        };
        Matrix m = new Matrix(array, 3, 3);
        
        double[][] array2 = {
            {1,2,3},
            {4,5,0},
            {7,8,9}
        };
        assertEquals(array2, m.getArray());
    }
    //Matrix(double[] vals, int m){}
    
    /**
     * testMatrixConstructor3a -Tests the third matrix constructor with valid parameters as specified in issue #7.
    **/
    @Test
    public void testMatrixConstructor3a() {
        //initialize m (num rows).
        int m = 5;
        //initialize n (num cols).
        int n = 6;
        double[][] correctMatrix = {{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},
            {0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}};
        Matrix matrix = new Matrix(m,n);
        assertEquals(matrix.getArray(), correctMatrix);
    }
    /**
     * testMatrixConstructor3b -Tests the third matrix constructor with illegal arguments as specified in issue #7.
    **/
    @Test(expected=IllegalArgumentException.class)
    public void testMatrixConstructor3b() {
        //intialize m (num rows).
        int m = 0;
        //intialize n (num cols).
        int n = 5;
        Matrix matrix = new Matrix(m,n);
    }
    /**
     * testMatrixConstructor3c -Tests the third matrix constructor with illegal arguments as specified in issue #7.
    **/
    @Test(expected=IllegalArgumentException.class)
    public void testMatrixConstructor3c() {
        //intialize m (num rows).
        int m = -3;
        //intialize n (num cols).
        int n = -5;
        Matrix matrix = new Matrix(m,n);
    }        
    //Matrix(int m, int n, double s){}
    /**
    testCtorFillWithConst tests the Matrix constructor that fills a
    matrix of m by n with constant s.
    */
    public void testCtorFillWithConst()
    {
        double fill = 3.14;
        int rows = 3;
        int cols = 2;
        Matrix matrixA = new Matrix(rows, cols, fill);
        arrA = matrixA.getArray();
        assertEquals(arrA.length, rows);
        assertEquals(arrA[0].length, cols);
        for (int i = 0; i < arrA.length; i++)
        {
            for (int k = 0; k < arrA[i].length; k++)
            {
                assertEquals(arrA[i][k], fill);
            }
        }
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

    //double get(int i, int j){return 0;}

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

    //void print(java.io.PrintWriter output, java.text.NumberFormat format, int width){}

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

    //Matrix uminus(){return null;}
}

