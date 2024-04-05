This program takes in two positive integers, A and B. It then sums the first A and B Fibonacci numbers and then calculates the gcd of the two sums. 
The program is written in Java.

**How It Works:**
The program starts by summing the Fibonacci the first A and B Fibonacci numbers; this is done using memoization. Memoization is an optimisation 
technique used to increase the efficiency of the code. This program calculates and stores Fibonacci sum values and stores them in the 
corresponding position. This means that if another sum is to be calculated, the program can refer to the pre-calculated values in the array instead
of having to recursively calculate it again, i.e. if A = 12 and B = 15, the values for the sum from 1-12 have already been calculated and stored in
the array when A was run through the fibonacciSum method so when B is run the second time it only has to calculate values for 13,14 and 15.
Once the two sums have been calculated and displayed, they are inputted into the gcd method, which recursively uses the Euclid Division Lemma to work out the 
gcd between the two sums. Each time it returns to another gcd method, it displays the values for a, b, q (quotient) and r (remainder) until the remainder
is 0, and thus the gcd is determined (the last non-zero remainder - b). This is finally outputted. 

**Example:**
Inputs are A: 44 B: 45
Sum of first 45 Fibonacci numbers: 1836311902
Sum of first 44 Fibonacci numbers: 1134903169
Iteration 1 : 1836311902 = 1134903169 x 1 + 701408733
Iteration 2 : 1134903169 = 701408733 x 1 + 433494436
Iteration 3 : 701408733 = 433494436 x 1 + 267914297
Iteration 4 : 433494436 = 267914297 x 1 + 165580139
Iteration 5 : 267914297 = 165580139 x 1 + 102334158
Iteration 6 : 165580139 = 102334158 x 1 + 63245981
Iteration 7 : 102334158 = 63245981 x 1 + 39088177
Iteration 8 : 63245981 = 39088177 x 1 + 24157804
Iteration 9 : 39088177 = 24157804 x 1 + 14930373
Iteration 10 : 24157804 = 14930373 x 1 + 9227431
Iteration 11 : 14930373 = 9227431 x 1 + 5702942
Iteration 12 : 9227431 = 5702942 x 1 + 3524489
Iteration 13 : 5702942 = 3524489 x 1 + 2178453
Iteration 14 : 3524489 = 2178453 x 1 + 1346036
Iteration 15 : 2178453 = 1346036 x 1 + 832417
Iteration 16 : 1346036 = 832417 x 1 + 513619
Iteration 17 : 832417 = 513619 x 1 + 318798
Iteration 18 : 513619 = 318798 x 1 + 194821
Iteration 19 : 318798 = 194821 x 1 + 123977
Iteration 20 : 194821 = 123977 x 1 + 70844
Iteration 21 : 123977 = 70844 x 1 + 53133
Iteration 22 : 70844 = 53133 x 1 + 17711
Iteration 23 : 53133 = 17711 x 3 + 0
GCD of the two sums is: 17711
***Note the above output is taken directly from the terminal on which the code was run.***

**To compile and run the program:**
1) Clone the repository
2) Input the values you want to test for (lines 35 & 36)
3) Run the program
4) You will see a similar output to the above.

*Note there are limits to this code; the maximum n value for the sum of the first n Fibonacci values is 45. Above this value, the sum goes beyond the range int
type can be represented in Java (-2147483648 to 2147483647), so the value gets rolled over and becomes negative.* 
Obviously, A and B must be whole numbers > 0 (as A and B are positive integers).
