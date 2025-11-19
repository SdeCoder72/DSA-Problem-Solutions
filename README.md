# Data Structures & Algorithms Practice Repository

Welcome to my DSA learning journey! This repository contains well-documented solutions to classic and advanced problems organized by data structure topics.

---

## Learning Progress

| Week | Topic | Status | Confidence |
|------|-------|--------|-----------|
| Week 1 | Array Fundamentals | ✅ Completed | High |
| Week 2 | Stack Data Structure | ✅ Completed | High |
| Week 3 | Queue Data Structure | ✅ Completed | Good |
| Week 4 | Revision & Mock Interview | ✅ Completed | 8/10 |
| Week 5 | Binary Trees | 🚀 Ready to Start | - |

---

## Topics Covered

### ✅ Week 1: Two Pointers Pattern
- **Problems:** 6
- **Difficulty:** Easy to Medium  
- **Key Learning:** Pattern recognition, Optimization mindset

| Problem | Difficulty | Pattern | Solution |
|---------|------------|---------|----------|
| Two Sum | Easy | Opposite Direction | [Link](Week01_TwoPointerProblems/QA_TwoSum.java) |
| Remove Duplicates | Easy | Same Direction | [Link](Week01_TwoPointerProblems/QB_RemoveDuplicates.java) |
| Valid Palindrome | Easy | String + Two Pointer | [Link](Week01_TwoPointerProblems/QC_ValidPalindrome.java) |
| Container Most Water | Medium | Area Maximization | [Link](Week01_TwoPointerProblems/QD_ContainerWithMostWater.java) |
| Three Sum | Medium | Nested Two Pointer | [Link](Week01_TwoPointerProblems/QE_ThreeSum.java) |
| Move Zeroes | Easy | In-place Modification | [Link](Week01_TwoPointerProblems/QF_MoveZeros.java) |

## Week 2: Stack Data Structure

The Stack follows the **LIFO (Last In First Out)** principle. Elements are added and removed from the same end called the **top**.

### Stack Implementation

- **[Stack_DS.java](PracticeProblems_Week02/StackDS/Stack_DS.java)** - Basic stack implementation
- **[Stack_DS_LinkedListBased.java](PracticeProblems_Week02/StackDS/Stack_DS_LinkedListBased.java)** - Stack using Linked List

### Stack Practice Problems

| Problem | Difficulty | File | Concepts |
|---------|-----------|------|----------|
| Valid Parentheses | Easy | [Link](PracticeProblems_Week02/StackDS/ValidParentheses.java) | Bracket matching, Stack |
| Reverse Array or String | Easy | [Link](PracticeProblems_Week02/StackDS/ReverseArrayOrString.java) | Stack traversal |
| Insert At Bottom | Easy | [Link](PracticeProblems_Week02/StackDS/InsertAtBottom.java) | Stack manipulation |
| Get Min At Pop | Medium | [Link](PracticeProblems_Week02/StackDS/GetMinAtPop.java) | Track minimum element |
| Daily Temperature | Medium | [Link](PracticeProblems_Week02/StackDS/DailyTemperature.java) | Monotonic stack |
| Next Greater Element | Medium | [Link](PracticeProblems_Week02/StackDS/NextGreaterElement.java) | Monotonic stack, Array traversal |
| Print Bracket Number | Medium | [Link](PracticeProblems_Week02/StackDS/PrintBracketNumber.java) | Stack-based counting |
| Make The Array Beautiful | Medium | [Link](PracticeProblems_Week02/StackDS/MakeTheArrayBeautiful.java) | Stack problem solving |
| Min Add To Make Parentheses Valid | Medium | [Link](PracticeProblems_Week02/StackDS/MinAddToMakeParenthesesValid.java) | Bracket validation |
| Background String Compare | Medium | [Link](PracticeProblems_Week02/StackDS/BackgroundStringCompare.java) | String comparison using stack |
| String Manipulation | Medium | [Link](PracticeProblems_Week02/StackDS/StringManipulation.java) | String problems with stack |
| Largest Rectangle In Histogram | Hard | [Link](PracticeProblems_Week02/StackDS/LargestRecInHistogram.java) | Monotonic stack, Optimization |
| Implement Stack Using One Queue | Hard | [Link](PracticeProblems_Week02/StackDS/ImplementStackUsingOneQueue.java) | DS conversion, Queue operations |
| Implement Stack Using Queues | Hard | [Link](PracticeProblems_Week02/StackDS/ImplementStackUsingQueues.java) | DS conversion, Alternative implementation |

### Key Learnings - Stack

- **LIFO Principle**: Last element pushed is first element popped
- **Time Complexity**: All operations (push, pop, peek) are O(1)
- **Space Complexity**: O(n) for n elements
- **Common Patterns**: 
  - Bracket/Parentheses matching
  - Monotonic stacks (Next Greater/Smaller elements)
  - Expression evaluation and parsing
  - Undo/Redo functionality
  - DFS-based algorithms

---

## Week 3: Queue Data Structure

The Queue follows the **FIFO (First In First Out)** principle. Elements are added at the **rear** and removed from the **front**.

### Queue Implementation

- **[ArrayBasedQueue.java](QueueDS/ArrayBasedQueue.java)** - Queue using array with circular buffer
- **[LinkedListBasedQueue.java](QueueDS/LinkedListBasedQueue.java)** - Queue using linked list

### Queue Practice Problems

| Problem | Difficulty | File | Concepts |
|---------|-----------|------|----------|
| Generate Binary Numbers | Easy | [Link](QueueDS/GenerateBinaryNumbers.java) | Queue, Number generation |
| First Negative In Every Window Of Size K | Medium | [Link](QueueDS/FirstNegativeInEveryWindowOfSizeK.java) | Sliding window, Queue operations |
| Implement Queue Using Stacks | Hard | [Link](QueueDS/ImplementQueueUsingStacks.java) | DS conversion, Stack operations |

### Key Learnings - Queue

- **FIFO Principle**: First element added is first element removed
- **Time Complexity**: All operations (enqueue, dequeue, front) are O(1)
- **Space Complexity**: O(n) for n elements
- **Circular Queue**: Efficient use of array space by wrapping around
- **Common Patterns**: 
  - BFS (Breadth-First Search) algorithms
  - Level-order tree traversal
  - Task scheduling and CPU queues
  - Message queues in systems
  - Sliding window problems

---

## Queue vs Stack Comparison

| Aspect | Queue | Stack |
|--------|-------|-------|
| **Order** | FIFO | LIFO |
| **Insertion** | Rear (enqueue) | Top (push) |
| **Deletion** | Front (dequeue) | Top (pop) |
| **Primary Use** | BFS, Scheduling | DFS, Expression evaluation |
| **Real-world** | Bank queue, Printer queue | Undo button, Browser back |

---

## Progress Timeline

### Week 2 - Stack Mastery
- ✅ Implemented stack using array and linked list
- ✅ Solved 13+ stack problems from easy to hard
- ✅ Mastered monotonic stack technique
- ✅ Understood bracket/parentheses matching
- ✅ Learned histogram and optimization problems

### Week 3 - Queue Foundation
- ✅ Implemented queue using array (circular buffer)
- ✅ Implemented queue using linked list
- ✅ Solved sliding window problems
- ✅ DS conversion problems (Queue ↔ Stack)
- ✅ Message generation problems

### Week 4 - Revision & Mock Interviews
- ✅ Amortized Analysis with multiple examples
- ✅ Mock Interview Practice sessions
- ✅ Pattern Cheat Sheet creation
- ✅ Reviewed all problems and optimized solutions

---

## Next Steps

### Trees Data Structure (Week 5)
- [ ] Binary Tree implementation
- [ ] Tree traversal (Inorder, Preorder, Postorder, Level-order)
- [ ] Binary Search Tree operations
- [ ] Balanced trees (AVL, Red-Black)
- [ ] Common tree problems

---

## Learning Approach
- **Theory First:** Deep conceptual understanding
- **Pattern Recognition:** Focus on when to apply which technique  
- **Interview Prep:** English explanations + clean code
- **Optimization:** Always looking for better solutions

## 🔗 Connect
- **Profile:** [Sabina Parveen]
- **Learning Journey:** Self-taught DSA + Web Development
- **Goal:** Full-stack developer with strong problem-solving skills

---
*"Consistency is the key to mastery"* 
