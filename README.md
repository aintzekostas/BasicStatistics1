# Basic Statistics 1 - Java Version

Basic Statistics 1 is a simple application written in Java that calculates the Average (arethmetic mean), Median and Mode of a given number of integers.

### Arithmetic Mean
 
Given n numbers, each number denoted by ai (where i = 1,2, ..., n), the arithmetic mean is the sum of the as divided by n or
 
 ![alt text](https://wikimedia.org/api/rest_v1/media/math/render/svg/97821b8c43e3182faa22db06932846d1550866fb)
 
 ### Median
 
The median is the middle number of a group of n numberswhen they are ranked in order. If there are an even number of numbers, the mean of the middle two is taken.

### Mode

The most frequently occurring number in a list is called the mode. For example, the mode of the list (1, 2, 2, 3, 3, 3, 4) is 3. It may happen that there are two or more numbers which occur equally often and more often than any other number. In this case it returns one of them as mode. If all numbers are unique it returns the min (first number in the sorted array).

## How To Run?

Compile and execute the Main.java in src/com/company folder. The first integer in the input.txt file represents the amount of the integers that will be used for the calculations. Always put the 'EOF' string at the end so the input while loop can be terminated.
