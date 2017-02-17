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
     * @throws IllegalArgumentException -If either input matrix dimension is
     * zero or if the input array is jagged.
     */
    public Matrix(double[][] matrixA) throws IllegalArgumentException
    {
        if (matrixA.length == 0)
        {
            throw new IllegalArgumentException("Matrix cannot have 0 rows.");
        }
        if (matrixA[0].length == 0)
        {
            throw new IllegalArgumentException("Matrix cannot have 0 columns.");
        }
        int rowCt = matrixA.length;
        int colCt = 0;
        for (int i = 0; i < rowCt; i++)
        {
            if (i > 0 && matrixA[i].length != colCt)
            {
                throw new IllegalArgumentException();
            }
            colCt = matrixA[i].length;
        }
        this.a = matrixA;
    }

        
    /**
     * Construct a matrix quickly without checking arguments.
     * @param  matrixA                  Two-dimensional array of doubles. 
     * @param  m                        Number of rows
     * @param  n                        Number of columns
     */
    public Matrix(double[][] matrixA, int m, int n)
    {
        if (m <= 0 || n <= 0)
        {
            throw new IllegalArgumentException("matrix must have "
                + "at lease one row and column");
        }
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
        if (length <= 0 || m == 0)
        {
            throw new IllegalArgumentException("matrix must have "
                + "at lease one row and column");
        }
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
     * Element-by-element left division. C = A.\B
     * @param matrixB        another matrix
     * @return               A.\B
     */
    public Matrix arrayLeftDivide(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return b / a;
            }
        };
        return byElement(matrixB, false, op);
    }
    /**
     * Element-by-element left division in place. A = A.\B 
     * @param matrixB       another matrix
     * @return              A.\B 
     */
    public Matrix arrayLeftDivideEquals(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return b / a;
            }
        };
        return byElement(matrixB, true, op);
    }
    /**
     * Element-by-element right division. C = A./B
     * @param matrixB        another matrix
     * @return               A./B
     */
    public Matrix arrayRightDivide(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a / b;
            }
        };
        return byElement(matrixB, false, op);
    }
    /**
     * Element-by-element right division in place. A = A./B 
     * @param matrixB          another matrix
     * @return                 A./B
     */
    public Matrix arrayRightDivideEquals(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            
            @Override
            public double apply(double a, double b)
            {
                return a / b;
            }
        };
        return byElement(matrixB, true, op);
    }
    /**
     * Element-by-element multiplication. C = A.*B
     * @param matrixB        another matrix
     * @return               A.*B
     */
    public Matrix arrayTimes(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a * b;
            }
        };
        return byElement(matrixB, false, op);
    }
    /**
     * Element-by-element multiplication in place. A = A.*B
     * @param matrixB          another matrix
     * @return                 A.*B
     */
    public Matrix arrayTimesEquals(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            
            @Override
            public double apply(double a, double b)
            {
                return a * b;
            }
        };
        return byElement(matrixB, true, op);
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
     * Construct a matrix from a copy of a 2-D array.
     * @param  matrixA      Two-dimensional array of doubles
     * @return A matrix
     * @throws IllegalArgumentException  All rows must have the same length;
     */
    public static Matrix constructWithCopy(double[][] matrixA)
        throws IllegalArgumentException
    {
        return new Matrix(copyArray(matrixA));
    }
    /**
     * Make a deep copy of the matrix.
     * @return a deep copy of the matrix.
     */
    public Matrix copy()
    {
        return new Matrix(copyArray(a));
    }
    /**
     * get -Returns the element at the specified index.
     * @param i -The row of the matrix to access.
     * @param j -The column of the matrix to access.
     * @return            [description]
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
     * getArrayCopy Copy the internal two-dimensional array.
     * @return Two-dimensional array copy of matrix elements.
     */
    public double[][] getArrayCopy()
    {
        return copyArray(a);
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
     * @return               [description]
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
     * @return               [description]
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
     * @return               [description]
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
     * @return               [description]
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
     * @return               [description]
     */
    public static Matrix identity(int m, int n)
    {
        return null;
    }
    /**
     * C = A - B.
     * @param matrixB         another matrix
     * @return                A - B
     */
    public Matrix minus(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a - b;
            }
        };
        return byElement(matrixB, false, op);
    }
    /**
     * A = A - B.
     * @param matrixB          another matrix
     * @return                 A - B
     */
    public Matrix minusEquals(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            
            @Override
            public double apply(double a, double b)
            {
                return a - b;
            }
        };
        return byElement(matrixB, true, op);
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
     * C = A + B.
     * @param matrixB          another matrix
     * @return                 A + B
     */
    public Matrix plus(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a + b;
            }
        };
        return byElement(matrixB, false, op);
    }
    /**
     * A = A + B.
     * @param matrixB          another matrix
     * @return                 A + B 
     */
    public Matrix plusEquals(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a + b;
            }
        };
        return byElement(matrixB, true, op);
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
     * @return               [description]
     */
    public static Matrix random(int m, int n)
    {
        return null;
    }
    /**
     * [read description].
     * @param  input         java.io.BufferedReader [description]
     * @return               [description]
     */
    public static Matrix read(java.io.BufferedReader input)
    {
        return null;
    }
    /**
     * Sets the element at row i and column j to value s.
     * @param i int    the row index of the element to change
     * @param j int    the column index of the element to change
     * @param s double the new value to insert at i, j
     * @throws IllegalArgumentException if the specified row and column are
     *     not valid indicies within the underlying array.
     */
    public void set(int i, int j, double s) throws IllegalArgumentException
    {
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length)
        {
            throw new IllegalArgumentException();
        }
        a[i][j] = s;
    }
    /**
     * Set a submatrix.
     * @param r  Array of row indeces.
     * @param c  Array of column indeces.
     * @param matrixX A matrix of size r.length by c.length
     *     from which replacement are taken.
     */
    public void setMatrix(int[] r, int[] c, Matrix matrixX)
    {
        if (r.length != matrixX.getRowDimension()
            || c.length != matrixX.getColumnDimension())
        {
            throw new IllegalArgumentException("For setMatrix(int[] r, "
                + "int[] c, Matrix X), must have dimensions r.length by "
                + "c.length.");
        }
        for (int i = 0; i < r.length; i++)
        {
            for (int j = 0; j < c.length; j++)
            {
                set(r[i], c[j], matrixX.get(i, j));
            }
        }
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
     * @return               [description]
     */
    public Matrix times(double s)
    {
        return null;
    }
    /**
     * [times description].
     * @param matrixB          another matrix
     * @return               [description]
     */
    public Matrix times(Matrix matrixB)
    {
        Operator op = new Operator()
        {
            @Override
            public double apply(double a, double b)
            {
                return a * b;
            }
        };
        return byElement(matrixB, false, op);
    }
    /**
     * [timesEquals description].
     * @param  s             double [description]
     * @return               [description]
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
     * Matrix transpose.
     * @return A'
     */
    public Matrix transpose()
    {
        int newRowDimension = getColumnDimension();
        int newColDimension = getRowDimension();
        double[][] a2 = new double[newRowDimension][newColDimension];
        for (int i = 0; i < newRowDimension; i++)
        {
            for (int j = 0; j < newColDimension; j++)
            {
                a2[i][j] = a[j][i];
            }
        }
        return new Matrix(a2);
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
    /**
     * This is just an array copy convenience method.
     * @param array       The array to be copied.
     * @return            A copy of the array
     **/
    private static double[][] copyArray(double[][] array)
    {
        double[][] copy = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++)
        {
            double[] row = array[i];
            for (int j = 0; j < row.length; j++)
            {
                copy[i][j] = array[i][j];
            }
        }
        return copy;
    }

    /**
     * Functional interface for use with
     * {@link #byElement(Matrix, boolean, Operator) byElement} method.
     **/
    @FunctionalInterface
    public static interface Operator
    {
        /**
         * Apply an operation to two doubles, and return a double.
         * @param a              a double
         * @param b              another double
         * @return               the result of applying the operation to a and b
         **/
        double apply(double a, double b);
    }
    /**
     * Apply an element by element operation to this and another matrix.
     * @param matrixB       the other matrix
     * @param inPlace       if true, then result of operation will
     *                      be set in this matrix
     * @param op            A lambda or instance implementing
     *                      {@link Operator Operator} to specify the operation
     * @return              The result of the operation. If inPlace = true, then
     *                      will be this Matrix.
     **/
    public Matrix byElement(Matrix matrixB, boolean inPlace, Operator op)
    {
        int rowCt = getRowDimension();
        int colCt = getColumnDimension();
        if (matrixB.getRowDimension() != rowCt
            || matrixB.getColumnDimension() != colCt)
        {
            throw new IllegalArgumentException("Matrices must "
                                               + "have same dimensions");
        }
        Matrix dest = inPlace ? this : new Matrix(rowCt, colCt);
        for (int i = 0; i < rowCt; i++)
        {
            for (int j = 0; j < colCt; j++)
            {
                dest.set(i, j, op.apply(this.get(i, j), matrixB.get(i, j)));
            }
        }
        return dest;
        
    }
}
