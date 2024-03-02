public class PR27_MatrixCalc {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] matrixB = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};

        Matrix A = new Matrix(matrixA);
        Matrix B = new Matrix(matrixB);

        Matrix sum = A.add(B);
        System.out.println("Matrix Addition: ");
        sum.display();

        Matrix product = A.multiply(B);
        System.out.println("Matrix Multiplication: ");
        product.display();
    }
}

class Matrix{
    private final int rows;
    private final int columns;
    private final int[][] data;

    public Matrix(int[][] data){
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = data;
    }

    public Matrix add(Matrix other){
        if(this.rows != other.rows || this.columns != other.columns){
            System.out.println("Matrix must have same dimensions for addition");
        }

        int[][] resultData = new int[rows][columns];

        for (int i=0; i<rows; i++){
            for(int j=0; j<other.columns; j++){
                resultData[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(resultData);
    }

    public Matrix multiply(Matrix other){
        if(this.columns != other.rows){
            System.out.println("Number of columns in the first matrix must " +
                    "be equal to the number of rows in second matrix for multiplication.");
        }

        int[][] resultData = new int[this.rows][other.columns];

        for (int i=0; i<this.rows; i++){
            for(int j=0; j<this.columns; j++){
                for (int k=0; k<this.columns; k++){
                    resultData[i][j] = resultData[i][j] + this.data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(resultData);
    }

    public void display(){
        for(int i=0; i <rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}


