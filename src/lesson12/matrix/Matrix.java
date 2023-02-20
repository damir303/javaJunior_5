package lesson12.matrix;

public class Matrix implements IMatrix {
    private double[][] m;

    public Matrix() {
        m = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int a, int b) {
        m = new double[a][b];
    }

    public Matrix(double[][] d) {
        m = d;
    }

    @Override
    public int getRows() {
        return m.length;
    }

    @Override
    public int getColumns() {
        return m[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return m[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        m[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getColumns() == otherMatrix.getColumns()
                && this.getRows() == otherMatrix.getRows()) {
            Matrix res = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    res.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
                }
            }
            return res;
        }
        return null;
    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() == otherMatrix.getColumns()
                && this.getRows() == otherMatrix.getRows()) {
            Matrix res = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    res.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
                }
            }
            return res;
        }
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//        if (this.getRows() == otherMatrix.getColumns()) {
//            Matrix res = new Matrix(this.getColumns(), otherMatrix.getRows());
////            for (int i = 0; i < this.getRows(); i++) {
////                for (int j = 0; j < this.getColumns(); j++) {
////                    res.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(i, j));
////                }
////            }
//
//            for (int i = 0; i < this.getColumns(); i++) {
//                for (int j = 0; j < otherMatrix.getRows(); j++) {
//                    for (int k = 0; k < th; k++) {
//
//                    }
//                }
//
//            }
//            return res;
//        }
        return null;


    }

    @Override
    public IMatrix mul(double value) {
        Matrix res = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                res.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
            return res;
        }
        return null;
    }


    @Override
    public IMatrix transpose() {
        Matrix res = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                res.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return res;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {       // для матрицы 3х3
        double summa = 0;
        if (isSquareMatrix()) {          // проверяем что квадрат
            isNullMatrix();             // проверяем что не пустая
            summa = this.getValueAt(0, 0) * this.getValueAt(1, 1) * this.getValueAt(2, 2) + this.getValueAt(0, 1) * this.getValueAt(1, 2) * this.getValueAt(2, 0) + this.getValueAt(0, 2) * this.getValueAt(1, 0) * this.getValueAt(2, 1) - this.getValueAt(0, 2) * this.getValueAt(1, 1) * this.getValueAt(2, 0) - this.getValueAt(0, 1) * this.getValueAt(1, 0) * this.getValueAt(2, 2) - this.getValueAt(0, 0) * this.getValueAt(1, 2) * this.getValueAt(2, 1);
        }

        return summa;
    }

    @Override
    public boolean isNullMatrix() {
        for (double[] doubles : m) {
            for (double aDouble : doubles) {
                if (aDouble != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < m.length; i++) {
            if (m[i][i] != 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        int i = 0;
        while (m.length > i) {
            if (m.length == m[i].length) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
