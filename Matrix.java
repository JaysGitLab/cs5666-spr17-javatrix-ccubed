public class Matrix
{
    final double[][] a;
    
    public Matrix(double[][] A)
    {
	    this(A,0,0);
    }
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
    public Matrix(double[] vals, int m)
    {
	    this(new double[0][],0,0);
    }
    public Matrix(int m, int n)
    {
	    this(new double[0][],0,0);
    }
    public Matrix(int m, int n, double s)
    {
	    this(new double[0][],0,0);
    }

    public Matrix arrayLeftDivide(Matrix B)
    {
        return null;
    }
    public Matrix arrayLeftDivideEquals(Matrix B)
    {
        return null;
    }
    public Matrix arrayRightDivide(Matrix B)
    {
        return null;
    }
    public Matrix arrayRightDivideEquaqals(Matrix B)
    {
        return null;
    }
    public Matrix arrayTimes(Matrix B)
    {
        return null;
    }
    public Matrix arrayTimesEquals(Matrix B)
    {
        return null;
    }
    public java.lang.Object clone()
    {
        return null;
    }
    public static Matrix constructWithCopy(double[][] A)
    {
        return null;
    }
    public Matrix copy()
    {
        return null;
    }
    public double get(int i, int j)
    {
        return 0;
    }
    public double[][] getArray()
    {
        return a;
    }
    public double[][] getArrayCopy()
    {
        return null;
    }
    public int getColumnDimension()
    {
        return 0;
    }
    public double[] getColumnPackedCopy()
    {
        return null;
    }
    public Matrix getMatrix(int[] r, int[] c)
    {
        return null;
    }
    public Matrix getMatrix(int[] r, int j0, int j1)
    {
        return null;
    }
    public Matrix getMatrix(int i0, int i1, int[] c)
    {
        return null;
    }
    public Matrix getMatrix(int i0, int i1, int j0, int j1)
    {
        return null;
    }
    public int getRowDimension()
    {
        return 0;
    }
    public double[] getRowPackedCopy()
    {
        return null;
    }
    public static Matrix identity(int m, int n)
    {
        return null;
    }
    public Matrix minus(Matrix B)
    {
        return null;
    }
    public Matrix minusEquals(Matrix B)
    {
        return null;
    }
    public double norm1()
    {
        return 0;
    }
    public double normF()
    {
        return 0;
    }
    public double normInf()
    {
        return 0;
    }
    public Matrix plus(Matrix B)
    {
        return null;
    }
    public Matrix plusEquals(Matrix B)
    {
        return null;
    }
    public void print(int w, int d)
    {
    }
    void print(java.text.NumberFormat format, int width)
    {
    }
    void print(java.io.PrintWriter output, int w, int d)
    {
    }
    void print(java.io.PrintWriter output, java.text.NumberFormat format, int width)
    {
    }
    public static Matrix random(int m, int n)
    {
        return null;
    }
    public static Matrix read(java.io.BufferedReader input)
    {
        return null;
    }
    public void set(int i, int j, double s)
    {
    }
    public void setMatrix(int[] r, int[] c, Matrix X)
    {
    }
    public void setMatrix(int[] r, int j0, int j1, Matrix X)
    {
    }
    public void setMatrix(int i0, int i1, int[] c, Matrix X)
    {
    }
    public void setMatrix(int i0, int i1, int j0, int j1, Matrix X)
    {
    }
    public Matrix times(double s)
    {
        return null;
    }
    public Matrix times(Matrix B)
    {
        return null;
    }
    public Matrix timesEquals(double s)
    {
        return null;
    }
    public double trace()
    {
        return 0;
    }
    public Matrix transpose()
    {
        return null;
    }
    public Matrix uminus()
    {
        return null;
    }
}


