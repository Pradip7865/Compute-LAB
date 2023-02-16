// Name :- Shah Rakeshkumar Shankar
// Class :- B.tech (cse(se))
// Enrollment :- 202103103510464



class SpraceMatrix {
    int numRows;
    int numCols;
    int numNonZero;
    int[] rowIndices;
    int[] colIndices;
    int[] values;

    public SpraceMatrix(int[][] matrix) {
        numRows = matrix.length;
        numCols = matrix[0].length;
        numNonZero = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] != 0) {
                    numNonZero++;
                }
            }
        }
        rowIndices = new int[numNonZero];
        colIndices = new int[numNonZero];
        values = new int[numNonZero];
        int k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] != 0) {
                    rowIndices[k] = i;
                    colIndices[k] = j;
                    values[k] = matrix[i][j];
                    k++;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < numNonZero; i++) {
            System.out.println("(" + rowIndices[i] + ", " + colIndices[i] + ") = " + values[i]);
        }
    }
}

class Main{
    public static void main(String args[]){
        int[][] matrix = {{0,3,0}, {0,0,2}, {0,0,1}};
        SpraceMatrix sparseMatrix = new SpraceMatrix(matrix);
        sparseMatrix.display();
    }
}
