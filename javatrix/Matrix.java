package javatrix;
/**
 * Matrix -Implementation of the matrix api in java. 
 * @author Chris Campell
 * @author Chris Waldon
 * @author Clint Hall
 * @version 0.1
 */
public class Matrix
{
    final double[][] a;

    /**
     * Matrix -Constructs a matrix from the provided 2dArray.
     * @param matrixA -The provided 2d array.
     */
    public Matrix(double[][] matrixA)
    {
        int rowCt = matrixA.length;
        int colCt = 0;
        a = new double[rowCt][];
        for (int i = 0; i < rowCt; i++)
        {
            if (i > 0 && matrixA[i].length != colCt)
            {
                throw new IllegalArgumentException();
            }
            colCt = matrixA[i].length;
            a[i] = new double[colCt];
            for (int j = 0; j < colCt; j++)
            {
                a[i][j] = matrixA[i][j];
            }
        }
    }

        
    /**
     * Construct a matrix quickly without checking arguments.
     * @param  matrixA                  Two-dimensional array of doubles. 
     * @param  m                        Number of rows
     * @param  n                        Number of columns
     */
    public Matrix(double[][] matrixA, int m, int n)
    {
        a = new double[m][];
        for (int i = 0; i < m; i++)
        {
            a[i] = new double[n];
            if (matrixA.length > i)
            {
                double[] row = matrixA[i];
                int colCt = row.length;
                colCt = colCt < n ? colCt : n;
                for (int j = 0; j < colCt; j++)
                {
                    a[i][j] = matrixA[i][j];
                }
            }
        }
    }
    /**
     * Construct a matrix from a one-dimensional packed array.
     * @param  vals -One-dimensional array of doubles, 
     *  packed by columns (ala Fortran).
     * @param  m -Number of rows.
     * @throws java.lang.IllegalArgumentException 
     *  -Array length must be a multiple of m.
     */
    public Matrix(double[] vals, int m) throws IllegalArgumentException
    {
        int length = vals.length;
        if (length % m != 0) 
        {
            throw new IllegalArgumentException(
                "double[] vals Array length must be a multiple of int m"
            );
        }
        int columnCount = length / m;
        int valIndex = 0;
        a = new double[m][];
        for (int i = 0; i < m; i++)
        {
            double[] row = new double[columnCount];
            a[i] = row;
            for (int j = 0; j < columnCount; j++)
            {
                row[j] = vals[valIndex];
                valIndex++;
            }
        }
    }
    /**
     * Matrix -Constructor for objects of type Matrix.
     * @param m -The number of desired rows for the matrix. 
     * @param n -The number of desired columns for the matrix.
     * @throws IllegalArgumentException -If m or n is 0 or negative.
     */
    public Matrix(int m, int n) throws IllegalArgumentException
    {
        if (m <= 0 || n <= 0) 
        {
            throw new IllegalArgumentException();
        } 
        else 
        {
            this.a = new double[m][n]; 
        }
    }
    /**
     * Constructs a Matrix of size m by n filled with the value s.
     * @param  m             int    Number of rows in the matrix
     * @param  n             int    Number of columns in the matrix
     * @param  s             double The initial value of every matrix element
     * @throws IllegalArgumentException -If m or n is 0 or negative.
     */
    public Matrix(int m, int n, double s) throws IllegalArgumentException
    {
        this(m, n);
        for (int i = 0; i < m; i++)
        {
            for (int k = 0; k < n; k++)
            {
                this.a[i][k] = s;
            }
        }
    }
    /**
     * [arrayLeftDivide description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayLeftDivide(Matrix matrixB)
    {
        return byElement(this, matrixB, (a, b) -> a / b);
    }
    /**
     * [arrayLeftDivideEquals description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayLeftDivideEquals(Matrix matrixB)
    {
        return null;
    }
    /**
     * [arrayRightDivide description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayRightDivide(Matrix matrixB)
    {
        return byElement(this, matrixB, (a, b) -> b / a);
    }
    /**
     * [arrayRightDivideEquaqals description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayRightDivideEquals(Matrix matrixB)
    {
        return null;
    }
    /**
     * [arrayTimes description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayTimes(Matrix matrixB)
    {
        return byElement(this, matrixB, (a, b) -> a * b);
    }
    /**
     * [arrayTimesEquals description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayTimesEquals(Matrix matrixB)
    {
        return null;
    }
    /**
     * [clone description].
     * @return [description]
     */
    public java.lang.Object clone()
    {
        return null;
    }
    /**
     * [constructWithCopy description].
     * @param  matrixA             double[][] [description]
     * @return            [description]
     */
    public static Matrix constructWithCopy(double[][] matrixA)
    {
        return null;
    }
    /**
     * [copy description].
     * @return [description]
     */
    public Matrix copy()
    {
        return null;
    }
    /**
     * get -Returns the element at the specified index.
     * @param i -The row of the matrix to access.
     * @param j -The column of the matrix to access.
     * @return     [description]
     * @throws IndexOutOfBoundsException -Throws exception
     *  if i or j is out of bounds.
     */
    public double get(int i, int j) throws IndexOutOfBoundsException
    {
        if (i < 0 || i >= a.length) 
        {
            throw new IndexOutOfBoundsException();
        }
        else if (j < 0 || j >= a[i].length) 
        {
            throw new IndexOutOfBoundsException();
        }
        else 
        {
            return a[i][j];
        }
    }
    /**
     * Access the internal two-dimensional array.
     * @return   Pointer to the two-dimensional array of matrix elements. 
     */
    public double[][] getArray()
    {
        return a;
    }
    /**
     * getArrayCopy -TODO: methdod descriptor.
     * @return null -TODO: return type descriptor.
     */
    public double[][] getArrayCopy()
    {
        return null;
    }
    /**
     * getColumnDimension -Returns the number of columns (n) in the matrix.
     * @return numCols -The number of columns in the matrix.
     */
    public int getColumnDimension()
    {
        return a[0].length;
    }
    /**
     * getColumnPackedCopy -TODO: method descriptor.
     * @return null -TODO: return type descriptor.
     */
    public double[] getColumnPackedCopy()
    {
        return null;
    }
    /**
     * [getMatrix description].
     * @param  r             int[] [description]
     * @param  c             int[] [description]
     * @return       [description]
     */
    public Matrix getMatrix(int[] r, int[] c)
    {
        return null;
    }
    /**
     * [getMatrix description].
     * @param  r             int[] [description]
     * @param  j0            int   [description]
     * @param  j1            int   [description]
     * @return       [description]
     */
    public Matrix getMatrix(int[] r, int j0, int j1)
    {
        return null;
    }
    /**
     * [getMatrix description].
     * @param  i0            int   [description]
     * @param  i1            int   [description]
     * @param  c             int[] [description]
     * @return       [description]
     */
    public Matrix getMatrix(int i0, int i1, int[] c)
    {
        return null;
    }
    /**
     * [getMatrix description].
     * @param  i0            int [description]
     * @param  i1            int [description]
     * @param  j0            int [description]
     * @param  j1            int [description]
     * @return     [description]
     */
    public Matrix getMatrix(int i0, int i1, int j0, int j1)
    {
        return null;
    }
    /**
     * getRowDimension -Returns the number of rows (m) in the matrix.
     * @return numRows -The number of rows in the matrix.
     */
    public int getRowDimension()
    {
        int numRows = a.length;
        return numRows;
    }
    /**
     * getRowPackedCopy -TODO: Method descriptor.
     * @return -TODO: Return type descriptor.
     */
    public double[] getRowPackedCopy()
    {
        return null;
    }
    /**
     * [identity description].
     * @param  m             int [description]
     * @param  n             int [description]
     * @return     [description]
     */
    public static Matrix identity(int m, int n)
    {
        return null;
    }
    /**
     * [minus description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix minus(Matrix matrixB)
    {
        return byElement(this, matrixB, (a, b) -> a - b);
    }
    /**
     * [minusEquals description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix minusEquals(Matrix matrixB)
    {
        return null;
    }
    /**
     * [norm1 description].
     * @return [description]
     */
    public double norm1()
    {
        return 0;
    }
    /**
     * [normF description].
     * @return [description]
     */
    public double normF()
    {
        return 0;
    }
    /**
     * [normInf description].
     * @return [description]
     */
    public double normInf()
    {
        return 0;
    }
    /**
     * [plus description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix plus(Matrix matrixB)
    {
        return byElement(this, matrixB, (a, b) -> a + b);
    }
    /**
     * [plusEquals description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix plusEquals(Matrix matrixB)
    {
        return null;
    }
    /**
     * [print description].
     * @param w int [description]
     * @param d int [description]
     */
    public void print(int w, int d)
    {
    }
    /**
     * [print description].
     * @param format java.text.NumberFormat [description]
     * @param width  int                    [description]
     */
    void print(java.text.NumberFormat format, int width)
    {
    }
    /**
     * [print description].
     * @param output java.io.PrintWriter [description]
     * @param w      int                 [description]
     * @param d      int                 [description]
     */
    void print(java.io.PrintWriter output, int w, int d)
    {
    }
    /**
     * [print description].
     * @param output java.io.PrintWriter    [description]
     * @param format java.text.NumberFormat [description]
     * @param width  int                    [description]
     */
    void print(java.io.PrintWriter output, 
            java.text.NumberFormat format, int width)
    {
    }
    /**
     * [random description].
     * @param  m             int [description]
     * @param  n             int [description]
     * @return     [description]
     */
    public static Matrix random(int m, int n)
    {
        return null;
    }
    /**
     * [read description].
     * @param  input         java.io.BufferedReader [description]
     * @return                        [description]
     */
    public static Matrix read(java.io.BufferedReader input)
    {
        return null;
    }
    /**
     * [set description].
     * @param i int    [description]
     * @param j int    [description]
     * @param s double [description]
     */
    public void set(int i, int j, double s)
    {
        a[i][j] = s;
    }
    /**
     * [setMatrix description].
     * @param r int[]  [description]
     * @param c int[]  [description]
     * @param matrixX Matrix [description]
     */
    public void setMatrix(int[] r, int[] c, Matrix matrixX)
    {
    }
    /**
     * [setMatrix description].
     * @param r  int[]  [description]
     * @param j0 int    [description]
     * @param j1 int    [description]
     * @param matrixX  Matrix [description]
     */
    public void setMatrix(int[] r, int j0, int j1, Matrix matrixX)
    {
    }
    /**
     * [setMatrix description].
     * @param i0 int    [description]
     * @param i1 int    [description]
     * @param c  int[]  [description]
     * @param matrixX  Matrix [description]
     */
    public void setMatrix(int i0, int i1, int[] c, Matrix matrixX)
    {
    }
    /**
     * [setMatrix description].
     * @param i0 int    [description]
     * @param i1 int    [description]
     * @param j0 int    [description]
     * @param j1 int    [description]
     * @param matrixX  Matrix [description]
     */
    public void setMatrix(int i0, int i1, int j0, int j1, Matrix matrixX)
    {
    }
    /**
     * [times description].
     * @param  s             double [description]
     * @return        [description]
     */
    public Matrix times(double s)
    {
        return null;
    }
    /**
     * [times description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix times(Matrix matrixB)
    {
        return byElement(this, matrixB, (a, b) -> a * b);
    }
    /**
     * [timesEquals description].
     * @param  s             double [description]
     * @return        [description]
     */
    public Matrix timesEquals(double s)
    {
        return null;
    }
    /**
     * [trace description].
     * @return [description]
     */
    public double trace()
    {
        return 0;
    }
    /**
     * [transpose description].
     * @return [description]
     */
    public Matrix transpose()
    {
        return null;
    }
    /**
     * [uminus description].
     * @return [description]
     */
    public Matrix uminus()
    {
        return null;
    }


    //////////////////////////////////////////////////////
    // helper methods
    //////////////////////////////////////////////////////

    @FunctionalInterface
    public static interface Operator{
        double apply(double a, double b);
    }
    public static Matrix byElement(Matrix matrixA, Matrix matrixB, Operator op){
        int rowCt = matrixA.getRowDimension();
        int colCt = matrixA.getColumnDimension();
        if(matrixB.getRowDimension() != rowCt ||
           matrixB.getColumnDimension() != colCt)
        {
            throw new IllegalArgumentException("Matrices must have same dimensions");
        }
        Matrix matrixC = new Matrix(rowCt, colCt);
        for(int i = 0; i < rowCt; i++){
            for (int j = 0; j < colCt; j++){
                matrixC.set(i, j, op.apply(matrixA.get(i,j), matrixB.get(i,j)));
            }
        }
        return matrixC;
        
    }
}
