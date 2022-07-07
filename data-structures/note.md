# Basic Data Structures
## Arrays
- Random access means that we can access items based on their indexes in O(1) constant running time because the items are right next to each other in the memory.
- Manipulate the last item (insertion or removal): O(1) running time
- Manipulate arbitrary item (insertion or removal): O(n) running time

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