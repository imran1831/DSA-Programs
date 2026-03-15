# DSA-Programs
Welcome to my DSA practice repository 👨‍💻
This repo contains problems and solutions I’ve solved while learning core Data Structures & Algorithms concepts step by step.

The goal is to build strong problem-solving logic, not just memorize solutions.
🚀 Topics Covered So Far
🧮 1. Basic Array Problems

Fundamental array manipulation and traversal.
Programs solved:

Reverse an array

Find largest / second largest element

Move all zeros to the end

Two Sum (basic version)

Concepts learned:

Loop control

Swapping elements

Index handling

Brute force vs optimized thinking

🔁 2. Two Pointers Technique

Using two indices to reduce time complexity.

Problems practiced:

Reverse array using two pointers

Palindrome string check

Two Sum (sorted & unsorted variations)

Key idea:
Instead of nested loops (O(n²)), use two pointers to achieve O(n) solutions.

🪟 3. Sliding Window – Fixed Size

Window size remains constant.

Problems solved:

Maximum sum subarray of size K

Maximum average subarray of size K

Key concepts:

Reusing previous window sum

Avoiding recomputation

Time complexity reduced from O(n²) → O(n)

🪟 4. Sliding Window – Variable Size

Window expands and shrinks based on conditions.

Problems practiced:

Longest substring without repeating characters

Longest substring with at most K distinct characters

Longest subarray with sum ≤ K

Key concepts:

Expand with right pointer

Shrink with left pointer when condition breaks

Maintaining window validity

🧠 5. HashMap & Frequency Counting

Tracking counts inside sliding windows.

Problems solved:

Character frequency tracking

Substring problems with constraints

Introduction to frequency-based window logic

Key concepts:

HashMap<Character, Integer>

Counting vs presence tracking

Dynamic window state

🧩 6. Kadane-style Logic (Product Variant)

Handling sign-sensitive problems.

Problem solved:

Maximum Product Subarray

Key learning:
Tracking both maximum and minimum product because:

Negative × Negative = Positive

7.prefix sum

Prefix Sum is a technique used to efficiently calculate the sum of elements in a range of an array. Instead of recalculating the sum every time for a query, we precompute cumulative sums so that any range sum can be obtained in constant time.
The prefix sum array stores the sum of all elements from the beginning of the array up to a specific index.

Prefix formula:
prefix[i] = prefix[i-1] + arr[i]

This allows fast computation of subarray sums.

To get the sum of elements from index L to R:

sum(L, R) = prefix[R] - prefix[L-1]

🛠️ Skills Developed

✔ Writing optimized solutions
✔ Reducing time complexity
✔ Understanding patterns instead of memorizing
✔ Building logic step by step
✔ Clean coding practice in Java

📈 Learning Approach

I follow a structured path:

Understand the problem

Try brute force

Optimize using patterns

Practice similar variations

Push solutions to GitHub for revision

🎯 Next Topics Planned

More Sliding Window variations

Recursion basics

Stack & Queue

Binary Search patterns

Linked List fundamentals

💡 Note

This repository is part of my daily DSA consistency challenge.
The focus is on improving problem-solving skills every day.

⭐ If you’re learning DSA too

Feel free to explore, fork, and practice along.
Consistency + Patterns = DSA mastery.
