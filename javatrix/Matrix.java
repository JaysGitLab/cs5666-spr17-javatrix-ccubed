package javatrix;
/**
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
        for(int i = 0; i < rowCt; i++){
            if(i > 0 && matrixA[i].length != colCt){
                throw new IllegalArgumentException();
            }
            colCt = matrixA[i].length;
            a[i] = new double[colCt];
            for(int j = 0; j < colCt; j++){
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
        int rowCt = matrixA.length;
        rowCt = rowCt < m ? rowCt : m;
        for (int i = 0; i < rowCt; i++)
        {
            double[] row = matrixA[i];
            int colCt = row.length;
            colCt = colCt < n ? colCt : n;
            a[i] = new double[n];
            for (int j = 0; j < colCt; j++)
            {
                a[i][j] = matrixA[i][j];
            }
        }
    }
    /**
     * [Matrix description].
     * @param  vals          double[] [description]
     * @param  m             int      [description]
     */
    public Matrix(double[] vals, int m)
    {
	    this(new double[0][], 0, 0);
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
        this(m,n);
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
        return null;
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
        return null;
    }
    /**
     * [arrayRightDivideEquaqals description].
     * @param matrixB             Matrix [description]
     * @return        [description]
     */
    public Matrix arrayRightDivideEquaqals(Matrix matrixB)
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
        return null;
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
     * [get description].
     * @param  i             int [description]
     * @param  j             int [description]
     * @return     [description]
     */
    public double get(int i, int j)
    {
        return 0;
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
     * [getColumnDimension description].
     * @return [description]
     */
    public int getColumnDimension()
    {
        return 0;
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
     * [getRowDimension description].
     * @return [description]
     */
    public int getRowDimension()
    {
        return 0;
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
        return null;
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
        return null;
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
        return null;
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
}
