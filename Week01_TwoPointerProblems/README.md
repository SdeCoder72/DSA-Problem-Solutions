# Two Pointers Pattern Mastery

## 🎯 Pattern Overview
Two Pointers is an efficient technique to solve array and string problems in O(n) time complexity instead of O(n²).

## 📚 Types Covered
1. **Opposite Direction:** Start from both ends, move towards center
2. **Same Direction:** Both pointers move forward at different speeds  
3. **Area Maximization:** Special case for geometric problems

## 🏆 Problems Solved

### 1. Two Sum in Sorted Array
- **Approach:** Opposite direction pointers
- **Key Insight:** Use sorted property for decision making
- **Time:** O(n), **Space:** O(1)

### 2. Remove Duplicates  
- **Approach:** Same direction (slow-fast)
- **Key Insight:** Slow tracks unique position
- **Time:** O(n), **Space:** O(1)

### 3. Valid Palindrome
- **Approach:** Opposite direction on string
- **Key Insight:** Skip non-alphanumeric, case handling
- **Time:** O(n), **Space:** O(1)

### 4. Container With Most Water  
- **Approach:** Greedy + Two Pointer
- **Key Insight:** Move shorter height pointer
- **Time:** O(n), **Space:** O(1)

### 5. Three Sum
- **Approach:** Fixed element + Two Pointer
- **Key Insight:** Handle duplicates at 3 levels
- **Time:** O(n²), **Space:** O(1)

### 6. Move Zeroes
- **Approach:** Same direction modification
- **Key Insight:** Maintain relative order
- **Time:** O(n), **Space:** O(1)

## 💡 Pattern Recognition
Use Two Pointers when you see:
- Sorted array given
- Pair/triplet finding  
- In-place modifications
- Palindrome checks
- Area/distance optimization

## 🎤 Interview Tips
- Always explain approach before coding
- Mention time/space complexity
- Handle edge cases (empty array, single element)
- Dry run with example

---
**Mastery Achieved:** ✅ Ready for next pattern!
