class Matrix
{
    final double[][] a;
    
    Matrix(double[][] A)
    {
	this(A,0,0);
    }
    Matrix(double[][] A, int m, int n)
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
    Matrix(double[] vals, int m)
    {
	    this(new double[0][],0,0);
    }
    Matrix(int m, int n)
    {
	    this(new double[0][],0,0);
    }
    Matrix(int m, int n, double s)
    {
	    this(new double[0][],0,0);
    }

    Matrix arrayLeftDivide(Matrix B)
    {
        return null;
    }
    Matrix arrayLeftDivideEquals(Matrix B)
    {
        return null;
    }
    Matrix arrayRightDivide(Matrix B)
    {
        return null;
    }
    Matrix arrayRightDivideEquaqals(Matrix B)
    {
        return null;
    }
    Matrix arrayTimes(Matrix B)
    {
        return null;
    }
    Matrix arrayTimesEquals(Matrix B)
    {
        return null;
    }
    protected java.lang.Object clone()
    {
        return null;
    }
    static Matrix constructWithCopy(double[][] A)
    {
        return null;
    }
    Matrix copy()
    {
        return null;
    }
    double get(int i, int j)
    {
        return 0;
    }
    double[][] getArray()
    {
        return a;
    }
    double[][] getArrayCopy()
    {
        return null;
    }
    int getColumnDimension()
    {
        return 0;
    }
    double[] getColumnPackedCopy()
    {
        return null;
    }
    Matrix getMatrix(int[] r, int[] c)
    {
        return null;
    }
    Matrix getMatrix(int[] r, int j0, int j1)
    {
        return null;
    }
    Matrix getMatrix(int i0, int i1, int[] c)
    {
        return null;
    }
    Matrix getMatrix(int i0, int i1, int j0, int j1)
    {
        return null;
    }
    int getRowDimension()
    {
        return 0;
    }
    double[] getRowPackedCopy()
    {
        return null;
    }
    static Matrix identity(int m, int n)
    {
        return null;
    }
    Matrix minus(Matrix B)
    {
        return null;
    }
    Matrix minusEquals(Matrix B)
    {
        return null;
    }
    double norm1()
    {
        return 0;
    }
    double normF()
    {
        return 0;
    }
    double normInf()
    {
        return 0;
    }
    Matrix plus(Matrix B)
    {
        return null;
    }
    Matrix plusEquals(Matrix B)
    {
        return null;
    }
    void print(int w, int d)
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
    static Matrix random(int m, int n)
    {
        return null;
    }
    static Matrix read(java.io.BufferedReader input)
    {
        return null;
    }
    void set(int i, int j, double s)
    {
    }
    void setMatrix(int[] r, int[] c, Matrix X)
    {
    }
    void setMatrix(int[] r, int j0, int j1, Matrix X)
    {
    }
    void setMatrix(int i0, int i1, int[] c, Matrix X)
    {
    }
    void setMatrix(int i0, int i1, int j0, int j1, Matrix X)
    {
    }
    Matrix times(double s)
    {
        return null;
    }
    Matrix times(Matrix B)
    {
        return null;
    }
    Matrix timesEquals(double s)
    {
        return null;
    }
    double trace()
    {
        return 0;
    }
    Matrix transpose()
    {
        return null;
    }
    Matrix uminus()
    {
        return null;
    }
}


