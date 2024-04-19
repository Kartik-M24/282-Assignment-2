This program takes in two positive integers, A and B. It then sums the first A and B Fibonacci numbers and then calculates the gcd of the two sums. 
The program is written in Java.
All files written by Kartik Malik.

**How It Works:**\
The program starts by taking the inputs from the user, checking if the inputs are of a valid type and in the valid range, determining which value is larger, and inputting this into the sumFibonacci() method. This then sums the first A and B Fibonacci numbers via the Fibonacci sum equation. Once the two sums have been calculated and displayed, they are inputted into the gcd method, which recursively uses the Euclid Division Lemma to work out the  gcd between the two sums. Each time it returns to another gcd method, it displays the values for a, b, q (quotient) and r (remainder) until the remainder is 0, and thus the gcd is determined (the last non-zero remainder - b). This is finally outputted. 

**Examples:**\
Please enter an integer between 1 and 45 (inclusive):\
44\
Valid input\
Please enter an integer between 1 and 45 (inclusive):\
45\
Valid input\
Inputs are A: 44 B: 45\
Sum of first 45 Fibonacci numbers: 1836311902\
Sum of first 44 Fibonacci numbers: 1134903169\
Iteration n:  a = b x q + r\
Iteration 1 : 1836311902 = 1134903169 x 1 + 701408733\
Iteration 2 : 1134903169 = 701408733 x 1 + 433494436\
Iteration 3 : 701408733 = 433494436 x 1 + 267914297\
Iteration 4 : 433494436 = 267914297 x 1 + 165580139\
Iteration 5 : 267914297 = 165580139 x 1 + 102334158\
Iteration 6 : 165580139 = 102334158 x 1 + 63245981\
Iteration 7 : 102334158 = 63245981 x 1 + 39088177\
Iteration 8 : 63245981 = 39088177 x 1 + 24157804\
Iteration 9 : 39088177 = 24157804 x 1 + 14930373\
Iteration 10 : 24157804 = 14930373 x 1 + 9227431\
Iteration 11 : 14930373 = 9227431 x 1 + 5702942\
Iteration 12 : 9227431 = 5702942 x 1 + 3524489\
Iteration 13 : 5702942 = 3524489 x 1 + 2178453\
Iteration 14 : 3524489 = 2178453 x 1 + 1346036\
Iteration 15 : 2178453 = 1346036 x 1 + 832417\
Iteration 16 : 1346036 = 832417 x 1 + 513619\
Iteration 17 : 832417 = 513619 x 1 + 318798\
Iteration 18 : 513619 = 318798 x 1 + 194821\
Iteration 19 : 318798 = 194821 x 1 + 123977\
Iteration 20 : 194821 = 123977 x 1 + 70844\
Iteration 21 : 123977 = 70844 x 1 + 53133\
Iteration 22 : 70844 = 53133 x 1 + 17711\
Iteration 23 : 53133 = 17711 x 3 + 0\
GCD of the two sums is: 17711

Please enter an integer between 1 and 45 (inclusive):\
forty\
Please enter a valid integer\
40\
Valid input\
Please enter an integer between 1 and 45 (inclusive):\
5000\
Please make sure inputs are between 1 and 45 (inclusive)\
33\
Valid input\
Inputs are A: 33 B: 40\
Sum of first 40 Fibonacci numbers: 165580140\
Sum of first 33 Fibonacci numbers: 5702886\
Iteration n:  a = b x q + r\
Iteration 1 : 165580140 = 5702886 x 29 + 196446\
Iteration 2 : 5702886 = 196446 x 29 + 5952\
Iteration 3 : 196446 = 5952 x 33 + 30\
Iteration 4 : 5952 = 30 x 198 + 12\
Iteration 5 : 30 = 12 x 2 + 6\
Iteration 6 : 12 = 6 x 2 + 0\
GCD of the two sums is: 6\
***Note the above outputs are taken directly from the terminal on which the code was run.***
As shown in the second example, only int inputs within the range of 1-45 are accepted.

**To compile and run the program:**
1) Clone the repository
2) Input the values you want to test for
3) Run the program
4) You will see a similar output to the above.

*Note there are limits to this code; the maximum n value for the sum of the first n Fibonacci values is 68. Above this value, the sum comes out as inaccurate due to rounding errors in how java stores vaues of long type. Long type can be represented in Java (-9,223,372,036,854,775,808 to -9,223,372,036,854,775,808), so the value gets rounded and the sum becomes inaccurate beyond n = 68.* 
Obviously, A and B must be whole numbers > 0 (as A and B are positive integers). If other types are inputted for A and B, the code will not accept these inputs and will repeatedly ask until a valid input is given (and in the valid range).
