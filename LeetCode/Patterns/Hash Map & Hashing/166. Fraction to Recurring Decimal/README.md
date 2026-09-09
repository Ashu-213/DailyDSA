# 📝 166. Fraction to Recurring Decimal (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/fraction-to-recurring-decimal/)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Hash Table, Math, String

### 🚀 Performance
- **Runtime:** 1 ms
- **Memory:** 42.7 MB

---

### 📜 Problem Description

Given two integers representing the  `numerator`  and  `denominator`  of a fraction, return  *the fraction in string format* .

If the fractional part is repeating, enclose the repeating part in parentheses

If multiple answers are possible, return  **any of them** .

It is  **guaranteed**  that the length of the answer string is less than  `104`  for all the given inputs.

**Note**  that if the fraction can be represented as a  *finite length string* , you  **must**  return it.

**Example 1:**

```
Input: numerator = 1, denominator = 2
Output: "0.5"

```

**Example 2:**

```
Input: numerator = 2, denominator = 1
Output: "2"

```

**Example 3:**

```
Input: numerator = 4, denominator = 333
Output: "0.(012)"

```

**Constraints:**

	
- `-231 <= numerator, denominator <= 231 - 1`
	
- `denominator != 0`