# Difference Between ArrayList and LinkedList in Java

## ArrayList
- Elements cannot be added or removed in the middle without shifting other elements.
- Adding more elements may require creating a new, larger array and copying all elements.
- Faster traversal and less memory usage compared to LinkedList.

## LinkedList
- Elements can be added or removed in the middle efficiently, without shifting other elements.
- Uses pointers to connect nodes, making insertions and deletions easier.

### Types of LinkedList
- **Singly Linked List**: Each node contains data and a pointer to the next node.
- **Doubly Linked List**: Each node contains data, a pointer to the next node, and a pointer to the previous node.
  - In Java's `java.util` package, `LinkedList` is a doubly linked list.

#### Structure
- The first node is called the **head**.
- The last node is called the **tail** and points to `null`.

#### Example
- To add an element (e.g., 10) between 9 and 11:
  - 9's tail points to 10's head.
  - 10's tail points to 11's head.

### Disadvantages of Doubly Linked List
1. Requires extra space for two pointers in each node.
2. Traversal can be slower due to checking both pointers.

---

## When to Use Which?
- Use **LinkedList** if your application requires frequent insertions or deletions in the middle of the list.
- Use **ArrayList** if you need faster traversal and less memory usage. 
## Or in more simple words,
- Based on the above explanation we can say that if our application requires more of such operations like adding or deleting the elements in between then we should go for linked list otherwise arrayList is better as it takes less space and is faster in traversing.