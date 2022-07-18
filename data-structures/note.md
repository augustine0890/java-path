# Introduction to Big-O
- Big-O notation gives an upper bound of the complexity in the worst case, helping to quantify performance as the input size becomes arbitrarily large.

# Basic Data Structures
## Arrays
- Random access means that we can access items based on their indexes in O(1) constant running time because the items are right next to each other in the memory.
- Manipulate the last item (insertion or removal): O(1) running time
- Manipulate arbitrary item (insertion or removal): O(n) running time
- Dynamic array can grow and shrink in size.

## Linked Lists
- Dynamic data structures: can acquire memory at run-time by inserting new nodes.
- Insert items at the beginning of the data structure fast: O(1) running time.
- Insert items at the end: O(n).

## Stacks
- LIFO structure: the last item we inserted is the first item we take out.
- Basic operations are: pop(), push(), and peek()

## Binary Search Tree
- In-order traversal -> lefSide + root + rightSide 
- Pre-order traversal -> root + leftSide + rightSide
- Post-order traversal -> leftSide + rightSide + root

## Hash Tables
- The h(x) hash-function maps keys to array indexes in the array to be able to use random indexing and achieve O(1) running time.
- The h(x) hash-function defines the relationships between the keys and the array indexes.
- Collisions occur when the h(x) hash-function maps two keys to the same array slot (bucket)
    - Chaining: store the items in the same bucket (with same indexes) in a linked list data structure.
    - Open addressing: generate a new index for the item --> try to find another bucket.
      - Linear probing: if collision happened at array index k then try index k+1, k+2, k+3,... until find an empty bucket.
      - Quadratic probing: if collision happened at array index k then try successive values of an arbitrary quadratic polynomial (array slots 1, 4, 9, 16... steps away from the collision)
      - Re-hashing: if collision happened at array index k the use the h(x) hash-function again to generate a new index.
