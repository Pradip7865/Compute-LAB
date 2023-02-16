// Name :- Shah Rakeshkumar Shankar
// Class :- B.tech (cse(se))
// Enrollment :- 202103103510464




class Stack {
    int top;
    int maxSize;
    int[] stack;
    
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top == maxSize-1) {
            System.out.println("Stack is full.");
        } else {
            top++;
            stack[top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            int item = stack[top];
            top--;
            return item;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }
    
    public void change(int pos, int newValue) {
        if (pos > top) {
            System.out.println("Invalid position. Stack does not have that many elements.");
        } else {
            stack[pos] = newValue;
        }
    }
    
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class Main{
    public static void main(String args[]){
        Stack stack = new Stack(5);
        System.out.println("Pushing the values into stack\n");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Peeking into the stack");
        System.out.println(stack.peek()); // prints 30
        System.out.println("Displaying the stack");
        stack.display(); // prints the entire stack elements
        System.out.println("Changing the element value at given index into stack");
        stack.change(1, 15);
        stack.display(); // prints the entire stack elements
        System.out.println("Poping element from the stack");
        System.out.println(stack.pop()); // prints 30
        System.out.println("Poping element from the stack");
        System.out.println(stack.pop()); // prints 15
    }
}