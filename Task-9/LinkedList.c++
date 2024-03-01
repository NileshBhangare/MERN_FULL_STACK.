//Linked List

#include <iostream>

struct Node {
    int data;
    Node* next;
    Node(int d) : data(d), next(nullptr) {}
};

class LinkedList {
public:
    LinkedList() : head(nullptr) {}
    void append(int data) {
        if (!head) {
            head = new Node(data);
            return;
        }
        Node* current = head;
        while (current->next) {
            current = current->next;
        }
        current->next = new Node(data);
    }

private:
    Node* head;
};

// Example usage
int main() {
    LinkedList linkedList;
    linkedList.append(1);
    linkedList.append(2);
    linkedList.append(3);

    // Print the elements of the linked list
    Node* current = linkedList.head;
    while (current != nullptr) {
        std::cout << current->data << " ";
        current = current->next;
    }
    std::cout << std::endl;

    return 0;
}

