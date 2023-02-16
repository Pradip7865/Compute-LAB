#Name :- Shah Rakeshkumar Shankar
#Class :- B.tech (cse(se))
#Enrollment :- 202103103510464



class ArrayOperations:
    def __init__(self, size):
        self.size = size
        self.arr = [None] * size
        self.count = 0

    # INSERT operation
    def insert(self, value):
        if self.count < self.size:
            self.arr[self.count] = value
            self.count += 1
        else:
            print("Array is full!")

    # DELETE operation
    def delete(self, index):
        if index < self.count:
            for i in range(index, self.count-1):
                self.arr[i] = self.arr[i+1]
            self.count -= 1
        else:
            print("Index out of bounds!")
    
    # SEARCH operation
    def search(self, value):
        for i in range(self.count):
            if self.arr[i] == value:
                return i
        return -1

    # UPDATE operation
    def update(self, index, value):
        if index < self.count:
            self.arr[index] = value
        else:
            print("Index out of bounds!")

#create object of the class
arrOps = ArrayOperations(5)

# Insert values
print("Inserting into the array is completed here.")
arrOps.insert(1)
arrOps.insert(2)
arrOps.insert(3)
arrOps.insert(4)
arrOps.insert(5)

# Delete value at index 3
print("Deleting 3 from the arary")
arrOps.delete(3)

# Search for value 3
print("Searching the 3 position and showing it")
print(arrOps.search(3))

# Update value at index 2 to be 7
print("Updating the 2nd index value to 8")
arrOps.update(2, 7)
