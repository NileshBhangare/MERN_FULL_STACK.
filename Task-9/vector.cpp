//vector

#include <iostream>
#include <vector>

int main() {
    // Create a vector of integers
    std::vector<int> myVector;

    // Add elements to the vector
    myVector.push_back(10);
    myVector.push_back(20);
    myVector.push_back(30);

    // Access elements by index
    std::cout << "Element at index 0: " << myVector[0] << std::endl;

    // Iterate over the vector and print its contents
    std::cout << "Elements in the vector: ";
    for (int i = 0; i < myVector.size(); ++i) {
        std::cout << myVector[i] << " ";
    }
    std::cout << std::endl;

    // Modify elements in the vector
    myVector[1] = 25;

    // Print the modified vector
    std::cout << "Modified vector: ";
    for (int num : myVector) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    // Remove an element from the vector
    myVector.pop_back();

    // Print the vector after removal
    std::cout << "Vector after removal: ";
    for (int num : myVector) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
