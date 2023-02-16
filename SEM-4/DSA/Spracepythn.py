#Name :- Shah Rakeshkumar Shankar
#Class :- B.tech (cse(se))
#Enrollment :- 202103103510464


class SparseMatrix:
    def __init__(self, matrix):
        self.numRows = len(matrix)
        self.numCols = len(matrix[0])

        self.rowIndices = []
        self.colIndices = []
        self.values = []

        for i in range(self.numRows):
            for j in range(self.numCols):
                if matrix[i][j] != 0:
                    self.rowIndices.append(i)
                    self.colIndices.append(j)
                    self.values.append(matrix[i][j])
    def display(self):
        for i in range(len(self.rowIndices)):
            print("({}, {}) = {}".format(self.rowIndices[i], self.colIndices[i], self.values[i]))


if __name__ == "__main__":
    matrix = [[0,2,0,0], [0,0,0,1], [0,0,2,0],[0,0,1,0],[1,0,0,0]]
    sparseMatrix = SparseMatrix(matrix)
    sparseMatrix.display()