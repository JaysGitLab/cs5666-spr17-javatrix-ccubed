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
     * [Matrix description].
     * @param  matrixA             double[][] [description]
     */
    public Matrix(double[][] matrixA)
    {
        this(matrixA, 0, 0);
    }
    /**
     * [Matrix description].
     * @param  matrixA             double[][] [description]
     * @param  m             int        [description]
     * @param  n             int        [description]
     */
    public Matrix(double[][] matrixA, int m, int n)
    {
        int rows = matrixA.length;
        m = rows < m ? rows : m;
        a = new double[m][];
        for (int i = 0; i < m; i++)
        {
            double[] row = matrixA[i];
            int rowLen = row.length;
            rowLen = rowLen < n ? rowLen : n;
            a[i] = new double[n];
            for (int j = 0; j < rowLen; j++)
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
     * [Matrix description].
     * @param  m             int [description]
     * @param  n             int [description]
     */
    public Matrix(int m, int n)
    {
        this(new double[0][], 0, 0);
    }
    /**
     * [Matrix description].
     * @param  m             int    [description]
     * @param  n             int    [description]
     * @param  s             double [description]
     */
    public Matrix(int m, int n, double s)
    {
        this(new double[0][], 0, 0);
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
     * @return    [description]
     */
    public double[][] getArray()
    {
        return a;
    }
    /**
     * @return    [description]
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
     * @return [description]
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
     * @return description
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
