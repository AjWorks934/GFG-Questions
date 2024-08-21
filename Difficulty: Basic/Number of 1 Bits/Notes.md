## Brian Kernighan's Algorithm

Brian Kernighan's algorithm is an efficient method for counting the number of set bits (1s) in the binary representation of an integer. This algorithm works by repeatedly clearing the least significant bit that is set to 1 until the number becomes zero. 

### Key Steps:
1. **Input**: An integer `n`.
2. **Loop**: While `n` is greater than zero:
   - Update `n` using the expression `n = n & (n - 1)`. This operation clears the least significant bit that is set to 1.
   - Increment a counter for each iteration to keep track of the number of set bits.

### How It Works

The operation `n - 1` flips all the bits after the rightmost set bit of `n`, including the rightmost set bit itself. As a result, the expression `n & (n - 1)` clears the last set bit of `n`. This process continues until all set bits are cleared, allowing us to count how many times we perform the operation.

### Example

Consider the number `52`, which is `00110100` in binary and has a total of **3** bits set:

1. **1st Iteration**:
   - `n = 52` (binary: `00110100`)
   - `n - 1 = 51` (binary: `00110011`)
   - `n & (n - 1) = 52 & 51` → `00110000` (resulting in `48`)

2. **2nd Iteration**:
   - `n = 48` (binary: `00110000`)
   - `n - 1 = 47` (binary: `00101111`)
   - `n & (n - 1) = 48 & 47` → `00100000` (resulting in `32`)

3. **3rd Iteration**:
   - `n = 32` (binary: `00100000`)
   - `n - 1 = 31` (binary: `00011111`)
   - `n & (n - 1) = 32 & 31` → `00000000` (resulting in `0`)

After these iterations, `n` becomes `0`, and the algorithm counts a total of **3** set bits in the original number.

### Conclusion

This algorithm is particularly efficient because it iterates only as many times as there are set bits in the integer, making it faster than methods that check each bit individually.
