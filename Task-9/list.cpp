
//List
#include <iostream>

struct Node {
    int data;
    Node* next;
    
    Node(int d) : data(d), next(nullptr) {}
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() : head(nullptr) {}

    // Insertion at the end of the list
    void insertAtEnd(int data) {
        Node* newNode = new Node(data);
        if (!head) {
            head = newNode;
            return;
        }
        Node* temp = head;
        while (temp->next) {
            temp = temp->next;
        }
        temp->next = newNode;
    }

    // Insertion at the beginning of the list
    void insertAtBeginning(int data) {
        Node* newNode = new Node(data);
        newNode->next = head;
        head = newNode;
    }

    // Insertion after a given node
    void insertAfter(Node* prevNode, int data) {
        if (!prevNode) {
            std::cout << "Previous node cannot be null\n";
            return;
        }
        Node* newNode = new Node(data);
        newNode->next = prevNode->next;
        prevNode->next = newNode;
    }

    // Printing the list
    void printList() {
        Node* temp = head;
        while (temp) {
            std::cout << temp->data << " ";
            temp = temp->next;
        }
        std::cout << std::endl;
    }

    // Reversing the list
    void reverse() {
        Node *prev = nullptr, *current = head, *next = nullptr;
        while (current) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
};

int main() {
    LinkedList myList;
    myList.insertAtEnd(10);
    myList.insertAtEnd(20);
    myList.insertAtEnd(30);
    myList.insertAtBeginning(5);
    myList.insertAfter(myList.head->next, 15);

    std::cout << "Original list: ";
    myList.printList();

    std::cout << "Reversed list: ";
    myList.reverse();
    myList.printList();

    return 0;
}
