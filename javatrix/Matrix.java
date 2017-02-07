package javatrix;
/**
 * Matrix.java
 * Implementation of the methods from the Matrix API. 
 * @author Chris Campell, Clint Hall, Chris Waldon
 * @version 2/7/2017
**/
public class Matrix
{
    final double[][] a;

    /**
     * [Matrix description]
     * @param  double[][] A             [description]
     * @return            [description]
     */
    public Matrix(double[][] A)
    {
	    this(A,0,0);
    }
    /**
     * [Matrix description]
     * @param  double[][] A             [description]
     * @param  int        m             [description]
     * @param  int        n             [description]
     * @return            [description]
     */
    public Matrix(double[][] A, int m, int n)
    {
        int rows = A.length;
        m = rows < m ? rows : m;
        a = new double[m][];
        for(int i=0; i<m; i++){
            double[] row = A[i];
            int rowLen = row.length;
            rowLen = rowLen < n ? rowLen : n;
            a[i] = new double[n];
            for(int j=0; j<rowLen; j++){
                a[i][j] = A[i][j];
            }
        }
    }
    /**
     * [Matrix description]
     * @param  double[] vals          [description]
     * @param  int      m             [description]
     * @return          [description]
     */
    public Matrix(double[] vals, int m)
    {
	    this(new double[0][],0,0);
    }
    /**
     * [Matrix description]
     * @param  int m             [description]
     * @param  int n             [description]
     * @return     [description]
     */
    public Matrix(int m, int n)
    {
	    this(new double[0][],0,0);
    }
    /**
     * [Matrix description]
     * @param  int    m             [description]
     * @param  int    n             [description]
     * @param  double s             [description]
     * @return        [description]
     */
    public Matrix(int m, int n, double s)
    {
	    this(new double[0][],0,0);
    }
    /**
     * [arrayLeftDivide description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix arrayLeftDivide(Matrix B)
    {
        return null;
    }
    /**
     * [arrayLeftDivideEquals description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix arrayLeftDivideEquals(Matrix B)
    {
        return null;
    }
    /**
     * [arrayRightDivide description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix arrayRightDivide(Matrix B)
    {
        return null;
    }
    /**
     * [arrayRightDivideEquaqals description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix arrayRightDivideEquaqals(Matrix B)
    {
        return null;
    }
    /**
     * [arrayTimes description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix arrayTimes(Matrix B)
    {
        return null;
    }
    /**
     * [arrayTimesEquals description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix arrayTimesEquals(Matrix B)
    {
        return null;
    }
    /**
     * [clone description]
     * @return [description]
     */
    public java.lang.Object clone()
    {
        return null;
    }
    /**
     * [constructWithCopy description]
     * @param  double[][] A             [description]
     * @return            [description]
     */
    public static Matrix constructWithCopy(double[][] A)
    {
        return null;
    }
    /**
     * [copy description]
     * @return [description]
     */
    public Matrix copy()
    {
        return null;
    }
    /**
     * [get description]
     * @param  int i             [description]
     * @param  int j             [description]
     * @return     [description]
     */
    public double get(int i, int j)
    {
        return 0;
    }
    /**
     *
     */
    public double[][] getArray()
    {
        return a;
    }
    public double[][] getArrayCopy()
    {
        return null;
    }
    /**
     * [getColumnDimension description]
     * @return [description]
     */
    public int getColumnDimension()
    {
        return 0;
    }
    /**
     *
     */
    public double[] getColumnPackedCopy()
    {
        return null;
    }
    /**
     * [getMatrix description]
     * @param  int[] r             [description]
     * @param  int[] c             [description]
     * @return       [description]
     */
    public Matrix getMatrix(int[] r, int[] c)
    {
        return null;
    }
    /**
     * [getMatrix description]
     * @param  int[] r             [description]
     * @param  int   j0            [description]
     * @param  int   j1            [description]
     * @return       [description]
     */
    public Matrix getMatrix(int[] r, int j0, int j1)
    {
        return null;
    }
    /**
     * [getMatrix description]
     * @param  int   i0            [description]
     * @param  int   i1            [description]
     * @param  int[] c             [description]
     * @return       [description]
     */
    public Matrix getMatrix(int i0, int i1, int[] c)
    {
        return null;
    }
    /**
     * [getMatrix description]
     * @param  int i0            [description]
     * @param  int i1            [description]
     * @param  int j0            [description]
     * @param  int j1            [description]
     * @return     [description]
     */
    public Matrix getMatrix(int i0, int i1, int j0, int j1)
    {
        return null;
    }
    /**
     * [getRowDimension description]
     * @return [description]
     */
    public int getRowDimension()
    {
        return 0;
    }
    /**
     *
     */
    public double[] getRowPackedCopy()
    {
        return null;
    }
    /**
     * [identity description]
     * @param  int m             [description]
     * @param  int n             [description]
     * @return     [description]
     */
    public static Matrix identity(int m, int n)
    {
        return null;
    }
    /**
     * [minus description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix minus(Matrix B)
    {
        return null;
    }
    /**
     * [minusEquals description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix minusEquals(Matrix B)
    {
        return null;
    }
    /**
     * [norm1 description]
     * @return [description]
     */
    public double norm1()
    {
        return 0;
    }
    /**
     * [normF description]
     * @return [description]
     */
    public double normF()
    {
        return 0;
    }
    /**
     * [normInf description]
     * @return [description]
     */
    public double normInf()
    {
        return 0;
    }
    /**
     * [plus description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix plus(Matrix B)
    {
        return null;
    }
    /**
     * [plusEquals description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix plusEquals(Matrix B)
    {
        return null;
    }
    /**
     * [print description]
     * @param int w [description]
     * @param int d [description]
     */
    public void print(int w, int d)
    {
    }
    /**
     * [print description]
     * @param java.text.NumberFormat format [description]
     * @param int                    width  [description]
     */
    void print(java.text.NumberFormat format, int width)
    {
    }
    /**
     * [print description]
     * @param java.io.PrintWriter output [description]
     * @param int                 w      [description]
     * @param int                 d      [description]
     */
    void print(java.io.PrintWriter output, int w, int d)
    {
    }
    /**
     * [print description]
     * @param java.io.PrintWriter    output [description]
     * @param java.text.NumberFormat format [description]
     * @param int                    width  [description]
     */
    void print(java.io.PrintWriter output, java.text.NumberFormat format, int width)
    {
    }
    /**
     * [random description]
     * @param  int m             [description]
     * @param  int n             [description]
     * @return     [description]
     */
    public static Matrix random(int m, int n)
    {
        return null;
    }
    /**
     * [read description]
     * @param  java.io.BufferedReader input         [description]
     * @return                        [description]
     */
    public static Matrix read(java.io.BufferedReader input)
    {
        return null;
    }
    /**
     * [set description]
     * @param int    i [description]
     * @param int    j [description]
     * @param double s [description]
     */
    public void set(int i, int j, double s)
    {
    }
    /**
     * [setMatrix description]
     * @param int[]  r [description]
     * @param int[]  c [description]
     * @param Matrix X [description]
     */
    public void setMatrix(int[] r, int[] c, Matrix X)
    {
    }
    /**
     * [setMatrix description]
     * @param int[]  r  [description]
     * @param int    j0 [description]
     * @param int    j1 [description]
     * @param Matrix X  [description]
     */
    public void setMatrix(int[] r, int j0, int j1, Matrix X)
    {
    }
    /**
     * [setMatrix description]
     * @param int    i0 [description]
     * @param int    i1 [description]
     * @param int[]  c  [description]
     * @param Matrix X  [description]
     */
    public void setMatrix(int i0, int i1, int[] c, Matrix X)
    {
    }
    /**
     * [setMatrix description]
     * @param int    i0 [description]
     * @param int    i1 [description]
     * @param int    j0 [description]
     * @param int    j1 [description]
     * @param Matrix X  [description]
     */
    public void setMatrix(int i0, int i1, int j0, int j1, Matrix X)
    {
    }
    /**
     * [times description]
     * @param  double s             [description]
     * @return        [description]
     */
    public Matrix times(double s)
    {
        return null;
    }
    /**
     * [times description]
     * @param  Matrix B             [description]
     * @return        [description]
     */
    public Matrix times(Matrix B)
    {
        return null;
    }
    /**
     * [timesEquals description]
     * @param  double s             [description]
     * @return        [description]
     */
    public Matrix timesEquals(double s)
    {
        return null;
    }
    /**
     * [trace description]
     * @return [description]
     */
    public double trace()
    {
        return 0;
    }
    /**
     * [transpose description]
     * @return [description]
     */
    public Matrix transpose()
    {
        return null;
    }
    /**
     * [uminus description]
     * @return [description]
     */
    public Matrix uminus()
    {
        return null;
    }
}
