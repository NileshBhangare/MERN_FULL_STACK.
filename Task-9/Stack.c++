//Stack 

#include <iostream>

#define MAX_SIZE 100

class Stack {
private:
    int top;
    int arr[MAX_SIZE];

public:
    Stack() {
        top = -1;
    }

    void push(int val) {
        if (top >= MAX_SIZE - 1) {
            std::cout << "Stack Overflow\n";
            return;
        }
        arr[++top] = val;
    }

    int pop() {
        if (isEmpty()) {
            std::cout << "Stack Underflow\n";
            return -1; // Or any suitable error value
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            std::cout << "Stack is empty\n";
            return -1; // Or any suitable error value
        }
        return arr[top];
    }

    bool isEmpty() {
        return top == -1;
    }
};

int main() {
    Stack stack;
    stack.push(10);
    stack.push(20);
    stack.push(30);

    std::cout << "Top element: " << stack.peek() << std::endl;

    std::cout << "Pop: " << stack.pop() << std::endl;
    std::cout << "Pop: " << stack.pop() << std::endl;

    std::cout << "Is the stack empty? " << (stack.isEmpty() ? "Yes" : "No") << std::endl;

    return 0;
}
