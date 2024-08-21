# Functions Used

    largestPowerOf2(int n):

Purpose: 
Determines the largest power of 2 that is less than or equal to n.

How It Works:

The function uses a bitwise left shift operation (1 << x) to calculate powers of 2.

It increments x until 2^x exceeds n. 

The function then returns x - 1, which corresponds to the largest power of 2 that is still less than or equal to n.

    countSetBits(int n):

Purpose:
Recursively calculates the total number of set bits from 1 to n by breaking the problem into smaller subproblems based on powers of 2.

How It Works:

Base Case: If n == 0, return 0. This stops the recursion when there's nothing left to count.

Step 1: Use largestPowerOf2(n) to find x, the largest exponent such that 2^x is the largest power of 2 less than or equal to n.

Step 2: Calculate the number of set bits from 1 to 2^x - 1:

This range includes all numbers with x bits, so the number of set bits in this range is x * 2^(x-1). This formula comes from the fact that, for each bit position in x, half of the numbers have that bit set.

Step 3: Calculate the number of set bits contributed by the most significant bit (MSB) from 2^x to n:

This is simply n - 2^x + 1, because the MSB is set in every number from 2^x to n.

Step 4: Recursively compute the set bits in the remaining numbers, which are n - 2^x. These remaining numbers are essentially the numbers from 1 to n - 2^x.
