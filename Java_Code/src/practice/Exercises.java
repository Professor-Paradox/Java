package practice;

/**
 * Solutions to Exercise Questions
 */

public class Exercises {
	private static final double PI = 3.14_15_92_65_35_897;

	/**
	 * Rounds given double value to two decimal points
	 * 
	 * @param value  number to round off
	 * @param points number of decimals to round off to
	 * @return rounded value. Ex: 1234.56789 ==> 1234.57 Ex: 1234.56 ==> 1234.56
	 */
	public static double roundOfToDecimals(Double value, int points) {
		double multiple = Math.pow(10, points);
		return (Math.round(value * multiple)) / multiple;
	}

	public static int countDigits(long num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	/**
	 * Squares given input value
	 * 
	 * @param value double value
	 * @return squared value,rounded to two decimal points
	 */
	public static double square(double value) {
		return roundOfToDecimals(value * value, 2);
	}

	/**
	 * Cubes given input value
	 * 
	 * @param value double value
	 * @return cubed value,rounded to two decimal points
	 */
	public static double cube(double value) {
		return roundOfToDecimals(value * value * value, 2);
	}

	/**
	 * Prints Details of a Person Using all data types in Java
	 */
	public static void allDetails() {
		String name = "Gandhi";
		char gender = 'M';
		byte age = 65;
		short friends = 700;
		int wealth = 67_000_000;
		long followers = 850_900_000l;
		float weight = 75.84f;
		double salary = 7_885.850;
		boolean isWorking = true;
		System.out.println(" Name: " + name + "\n Gender: " + gender + "\n Age: " + age + "\n Weight: " + weight
				+ " kg\n Wealth: " + wealth + " rs\n Salary: " + salary + " rs\n Currently Working: " + isWorking
				+ "\n Friends: " + friends + "\n Followers: " + followers);
	}

	/**
	 * Performs all Arithmetic Operations in Java with two Numbers.
	 */
	public static void arithmeticOperations() {
		int x = 11, y = 3;
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
	}

	/**
	 * Performs Relational Operations between two numbers.
	 */
	public static void relationalOperations() {
		int x = 11, y = 3;
		System.out.println("\nx = " + x + ",y = " + y);
		System.out.println("x == y " + (x == y));
		System.out.println("x != y " + (x != y));
		System.out.println("x < y " + (x < y));
		System.out.println("x <= y " + (x <= y));
		System.out.println("x > y " + (x > y));
		System.out.println("x >= y " + (x >= y));
	}

	/**
	 * Performs logical Operations between two variables.
	 */
	public static void logicalOperations() {
		boolean x = true, y = false;
		System.out.println("\nx = " + x + ",y =" + y);
		System.out.println("!x = " + (!x) + ",!y = " + (!y));
		System.out.println("x && y " + (x && y));
		System.out.println("x || y " + (x || y));
	}

	/**
	 * Performs Arithmetic Operations between two user given numbers.
	 * 
	 * @param x first number
	 * @param y second number
	 */
	public static void arithmeticOperations(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
	}

	/**
	 * Performs Relational Operations between two user Given numbers.
	 * 
	 * @param x first number
	 * @param y second number
	 */
	public static void relationalOperations(int x, int y) {
		System.out.println("\nx = " + x + ",y = " + y);
		System.out.println("x == y " + (x == y));
		System.out.println("x != y " + (x != y));
		System.out.println("x < y " + (x < y));
		System.out.println("x <= y " + (x <= y));
		System.out.println("x > y " + (x > y));
		System.out.println("x >= y " + (x >= y));
	}

	/**
	 * Performs logical operations between two user given values.
	 * 
	 * @param x first value
	 * @param y second value
	 */
	public static void logicalOperations(boolean x, boolean y) {
		System.out.println("\nx = " + x + ",y =" + y);
		System.out.println("!x = " + (!x) + ",!y = " + (!y));
		System.out.println("x && y " + (x && y));
		System.out.println("x || y " + (x || y));
	}

	/**
	 * Prints table of given number till limit
	 * 
	 * @param number number to calculate table
	 * @param limit  limit of table
	 */
	public static void printTable(int number, int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}

	/**
	 * Explains the Bodmas rule with a predefined equation
	 */
	public static void bodmasRule() {
		System.out.println("11 % (5/2) * 12 + 5 - 3");
		System.out.println("11 % (" + (5 / 2) + ") * 12 + 5 - 3");
		System.out.println(11 % (5 / 2) + " * 12 + 5 - 3");
		System.out.println(11 % (5 / 2) * 12 + " + 5 - 3");
		System.out.println(11 % (5 / 2) * 12 + 5 + " - 3");
		System.out.println(11 % (5 / 2) * 12 + 5 - 3);
	}

	/**
	 * Prints the ASCII value of given character
	 * 
	 * @param c character to convert
	 */
	public static void asciiChar(char c) {
		System.out.println(c + " => " + (int) c);
	}
	// Square Programs

	/**
	 * Calculates area of Square,given a side
	 * 
	 * @param side
	 * @return Area of Square,rounded to two decimal points
	 */
	public static double areaOfSquare(double side) {
		return roundOfToDecimals(square(side), 2);
	}

	/**
	 * Calculates Perimeter of Square,given a side
	 * 
	 * @param side
	 * @return Perimeter of Square,rounded to two decimal points
	 */
	public static double perimeterOfSquare(double side) {
		return roundOfToDecimals(4 * side, 2);
	}

	// Rectangle Programs

	/**
	 * Calculates area of Rectangle,given length and breadth
	 * 
	 * @param length
	 * @param breadth
	 * @return Area of Rectangle,rounded to two decimal points
	 */
	public static double areaOfRectangle(double length, double breadth) {
		return roundOfToDecimals(length * breadth, 2);
	}

	/**
	 * Calculates Perimeter of Rectangle,given length and breadth
	 * 
	 * @param length
	 * @param breadth
	 * @return Perimeter of Rectangle,rounded to two decimal points
	 */
	public static double perimeterOfRectangle(double length, double breadth) {
		return roundOfToDecimals(2 * (length + breadth), 2);
	}

	// Circle Programs

	/**
	 * Calculates Area of Circle,given radius
	 * 
	 * @param radius
	 * @return Area of Circle,rounded to two decimal points
	 */
	public static double areaOfCircle(double radius) {
		return roundOfToDecimals(PI * square(radius), 2);
	}

	/**
	 * Calculates Perimeter of Circle,given radius
	 * 
	 * @param radius
	 * @return Perimeter of Circle,rounded to two decimal points
	 */
	public static double perimeterOfCircle(double radius) {
		return roundOfToDecimals(2 * PI * radius, 2);
	}

	// Triangle Programs

	/**
	 * Calculates Area of Triangle,given base and height
	 * 
	 * @param base
	 * @param height
	 * @return returns area of Triangle,rounded to two decimal points
	 */
	public static double areaOfTriangle(double base, double height) {
		return roundOfToDecimals(base * height * 0.5, 2);
	}

	/**
	 * Calculates Perimeter of Triangle,given all sides
	 * 
	 * @param a 1st side of Triangle
	 * @param b 2nd side of Triangle
	 * @param c 3rd side of Triangle
	 * @return Perimeter of Triangle,rounded to two decimal points
	 */
	public static double perimeterOfTriangle(double a, double b, double c) {
		return roundOfToDecimals(a + b + c, 2);
	}

	// Math Programs

	/**
	 * Checks given number is prime or not. If number is divisible by 2 it is even.
	 * If not then it is Odd.
	 * 
	 * @param number to check
	 * @return <code>true</code> If <code>number</code> is Even
	 *         <li><code>false</code>if <code>number</code> is Odd</li>
	 */
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	/**
	 * Checks given number is Prime or not. A Number is Prime if it
	 * <ul>
	 * <li>Is whole number(0,1,...).</li>
	 * <li>Is <strong>only</strong> divisible by 1 and itself.</li>
	 * <li>So prime numbers start from 2.</li>
	 * <li>0,1,negative values are not prime numbers.</li>
	 * </ul>
	 * 
	 * @param number to check
	 * @return <code>true</code> If <code>number</code> is prime
	 *         <li><code>false</code> if <code>number</code> is not prime</li>
	 * 
	 */
	public static boolean isPrime(int number) {
		if (number == 1) {
			System.out.println("Prime numbers start from 2");
			return false;
		} else if (number > 0) {
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					return false;
				}
			}
			return true;
		} else {
			System.out.println("Only Positive numbers can be Integers");
			return false;
		}
	}

	/**
	 * Checks if given number is an armstrong number.
	 * <ul>
	 * <li>A number is armstrong if the sum of its own digits raised to the power of
	 * number of digits is equal to original number</li>
	 * <li>Ex: 371 ==> 3^3+7^3+1^3 ==>371</li>
	 * <li>Ex: 9474==> 9^4+4^4+7^4+4^4 ==>9474</li>
	 * </ul>
	 * 
	 * @param num number to check if its armstrong
	 * @return true: if armstrong, false: if not armstrong
	 */
	public static boolean isArmstrong(int num) {
		int numCopy = num, arm = 0;
		int toPower = countDigits(num);
		while (numCopy > 0) {
			int reminder = numCopy % 10;
			numCopy /= 10;
			arm = arm + (int) (Math.pow(reminder, toPower));
		}
		return num == arm;
	}

	/**
	 * Checks given number is Strong
	 * <ul>
	 * <li>A number is strong if the sum of factorial of individual digits is equal
	 * to original number</li>
	 * <li>ex: 145 ==> 1! + 4! + 5! = 145</li>
	 * </ul>
	 * 
	 * @param num number to check
	 * @return true: if Strong, false: if not Strong
	 */
	public static boolean isStrongNumber(int num) {
		long numCopy = num, strongNum = 0;
		while (numCopy > 0) {
			long reminder = numCopy % 10;
			numCopy /= 10;
			strongNum = strongNum + factorial(reminder);
		}
		return num == strongNum;
	}

	/**
	 * Checks if given number is a perfect number
	 * <ul>
	 * <li>A number is perfect if the sum of it's divisors except the number is
	 * equal to number</li>
	 * <li>Ex: 28: factors are 1,2,4,7,14,28. we add these factors 1+2+4+7+14 ==>28
	 * perfect number</li>
	 * </ul>
	 * 
	 * @param num number to verify
	 * @return true: if perfect number, false: if not perfect number.
	 */
	public static boolean isPerfectNumber(int num) {
		long perfectNum = 0;
		// since all the factors of any number are only till half of the actual number.
		// 28 has factors 1,2,4,7,14,28. here 14 is half of 28 so we can optimize by not
		// performing redundant calculations.
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				perfectNum += i;
			}
		}
		return num == perfectNum;
	}

	/**
	 * Checks if given year is leap year. A Year is leap if it is
	 * <ul>
	 * <li>divisible by 4</li>
	 * <li>not divisible by 100</li>
	 * <li>divisible by 400</li>
	 * </ul>
	 * 
	 * @param year
	 * @return true if leap, false if not leap.
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// divisible by 400
					return true;
				}
				// not divisible by 400
				return false;
			}
			// not divisible by 100
			return true;
		} else {
			// not divisible by 4
			return false;
		}
	}

	/**
	 * Calculates Reverse of given number.
	 * 
	 * @param num number to reverse
	 * @return reversed number.
	 */
	public static long reverse(long num) {
		long reverse = 0;
		while (num > 0) {
			long reminder = num % 10;
			num /= 10;
			reverse = reverse * 10 + reminder;
		}
		return reverse;
	}

	/**
	 * Checks if Given number is Palindrome.
	 * <ul>
	 * <li>A Number is Palindrome if the number and it's reverse are same.</li>
	 * <li>Ex: 121,1234321,555,78987, etc.</li>
	 * </ul>
	 * 
	 * @param num number to check
	 * @return true if palindrome, false if not a palindrome
	 */
	public static boolean isPalindrome(long num) {
		return num == reverse(num);
	}

	/**
	 * Calculates the Factorial given number.
	 * <ul>
	 * <li>Factorial of a number is calculated by multiplying the number with its
	 * previous number till it reaches 1.</li>
	 * <li>Ex: 5! = 5x4x3x2x1 = 120</li>
	 * <li>Negative factorials are similar to positive factorials with same output ,
	 * but with negative sign.</li>
	 * <li>Ex: -5! = -(5!) = -(5x4x3x2x1)=-120</li> Factorial of -1,0,1 is 1.
	 * 
	 * @param num number to calculate factorial for.
	 * @return factorial of the num
	 */
	public static long factorial(long num) {
		long fact = 1;
		if (num < 0) {
			return -(factorial(num * -1));
		} else {
			for (long i = num; i >= 1; i--) {
				fact *= i;
			}
			return fact;
		}
	}

	/**
	 * Calculates factorial of a given number using Recursive Approach.
	 * 
	 * @param num number to calculate
	 * @return factorial value
	 */
	public static long factorialRecursive(long num) {
		if (num == 1) {
			return 1;
		} else {
			return factorialRecursive(num - 1) * num;
		}
	}

	/**
	 * Prints Fibonacci series till given number of places
	 * 
	 * @param limit number of elements in fibonacci series to print
	 */
	public static void fibonacciSeries(int limit) {
		long current = 0, next = 1, sum = 0;
		System.out.println();
		System.out.print("First " + limit + " elements int Fibonacci Series are ");
		for (int i = 1; i <= limit; i++) {
			System.out.print(" " + current);
			sum = current + next;
			current = next;
			next = sum;
		}
		System.out.println();
		System.out.println();
	}

	/**
	 * Checks if given number is in fibonacci series.
	 * <ul>
	 * <li>Stores first 50 fibonacci series in an array and checks for given value
	 * in it</li>
	 * </ul>
	 * 
	 * @param number number to check
	 * @return true if present in series, false if not in series.
	 */
	public static boolean inFibonacci(long number) {
		long current = 0, next = 1, sum = 0;
		long fibonacci[] = new long[50];
		for (int i = 0; i < 50; i++) {
			fibonacci[i] = current;
			sum = current + next;
			current = next;
			next = sum;
		}
		for (int i = 0; i < fibonacci.length; i++) {
			if (number == fibonacci[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Prints the geometric Progression till given limit. Using start and
	 * commonRation values.
	 * <ul>
	 * <li>A geometric Progression is a series of values where after the starting
	 * value each term is multiplied by common ratio.</li>
	 * <li>Ex: 2 6 18 54 162 486 1458 4374 13122 39366 is first 10 values of
	 * geometric progression with 2 as start, 3 as common ratio.</li>
	 * <li>It is calculated with formula start*commonratio^(n-1)</li>
	 * </ul>
	 * 
	 * @param start       Start Value
	 * @param commonRatio Common Ratio to multiple
	 * @param limit       number of values to calculate in Progression
	 */
	public static void geometricProgression(int start, int commonRatio, int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.print((long) (start * Math.pow(commonRatio, i - 1)) + " ");
		}
	}

	/**
	 * Swaps two numbers using a third variable
	 * 
	 * @param a first value
	 * @param b second value
	 */
	public static void swap(long a, long b) {
		long temp;
		System.out.println("Before Swapping a=" + a + " b=" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping a=" + a + " b=" + b);
	}

	/**
	 * Swaps two numbers without using third variable
	 * 
	 * @param a first value
	 * @param b second value
	 */
	public static void swapWithoutValue(long a, long b) {
		System.out.println("Before Swapping a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a=" + a + " b=" + b);
	}

	/**
	 * Calculates the sum of even numbers in given number
	 * 
	 * @param num number to calculate
	 * @return sum of even numbers
	 */
	public static long evenSumInNumber(long num) {
		long sum = 0;
		while (num > 0) {
			long reminder = num % 10;
			num /= 10;
			if (reminder % 2 == 0) {
				sum += reminder;
			}
		}
		return sum;
	}

	/**
	 * Calculates the sum of odd numbers in given number
	 * 
	 * @param num number to calculate
	 * @return sum of odd numbers
	 */
	public static long oddSumInNumber(long num) {
		long sum = 0;
		while (num > 0) {
			long reminder = num % 10;
			num /= 10;
			if (reminder % 2 != 0) {
				sum += reminder;
			}
		}
		return sum;
	}

	/**
	 * Calculates the Product of even numbers in given number
	 * 
	 * @param num number to calculate
	 * @return Product of even numbers
	 */
	public static long evenProductInNumber(long num) {
		long product = 1;
		while (num > 0) {
			long reminder = num % 10;
			num /= 10;
			if (reminder % 2 == 0 && reminder != 0) {
				product *= reminder;
			}
		}
		return product;
	}

	/**
	 * Calculates the Product of odd numbers in given number
	 * 
	 * @param num number to calculate
	 * @return Product of odd numbers
	 */
	public static long oddProductInNumber(long num) {
		long product = 1;
		while (num > 0) {
			long reminder = num % 10;
			num /= 10;
			if (reminder % 2 != 0) {
				product *= reminder;
			}
		}
		return product;
	}

	/**
	 * Prints all the even numbers between given range
	 * 
	 * @param start starting range [included]
	 * @param end   end range [included]
	 */
	public static void evenTillLimit(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isEven(i)) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Prints all the odd numbers between given range
	 * 
	 * @param start starting range [included]
	 * @param end   end range [included]
	 */
	public static void oddTillLimit(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (!isEven(i)) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Prints all the prime numbers between given range
	 * 
	 * @param start starting range [included]
	 * @param end   end range [included]
	 */
	public static void primeTillLimit(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Calculates the Grade for given marks
	 * 
	 * @param marks
	 * @return Grade
	 */
	public static char marksToGrades(int marks) {
		if (marks >= 90) {
			return 'A';
		} else if (marks >= 80 && marks < 90) {
			return 'B';
		} else if (marks >= 65 && marks < 80) {
			return 'C';
		} else if (marks >= 40 && marks < 65) {
			return 'D';
		}
		return '\0';
	}

	// Conversion Programs
	/**
	 * Here We convert Numbers of One number system to another. Most important
	 * Conversions are From Decimal to binary,octal,hexadecimal and from
	 * binary,octal,hexadecimal to Decimal. Rest of all conversions are done using
	 * these.
	 */

	/**
	 * Converts given decimal value to binary.
	 * <ul>
	 * <li>A decimal number is converted to binary by dividing the number by 2 and
	 * writing the remainder in reverse order</li>
	 * <li>24 --> 11000 is the binary</li>
	 * <li>We have to use Strings or arrays to preserve the trailing zeros, integer
	 * neglects them</li>
	 * </ul>
	 * 
	 * @param decimal
	 * @return
	 */
	public static int decimalToBinary(int decimal) {
		String binary = "";
		while (decimal > 0) {
			int remainder = decimal % 2;
			decimal /= 2;
			binary = remainder + binary;
		}
		return Integer.parseInt(binary);
	}

	/**
	 * converts Given Decimal number to octal number
	 * <ul>
	 * <li>A decimal number is converted to octal by dividing the number by 8 and
	 * combining the remainder</li>
	 * </ul>
	 * 
	 * @param decimal
	 * @return
	 */
	public static int decimalToOctal(int decimal) {
		String octal = "";
		while (decimal > 0) {
			int remainder = decimal % 8;
			decimal /= 8;
			octal = remainder + octal;
		}
		return Integer.parseInt(octal);
	}

	/**
	 * Converts given decimal value to Hexadecimal
	 * <ul>
	 * <li>A decimal number is converted to hexadecimal by dividing the number with
	 * 16 and combining the remainder in reverse order</li>
	 * <ul>
	 * 
	 * @param decimal Integer Decimal value to convert
	 * @return String Hexadecimal
	 */
	public static String decimalToHexadecimal(int decimal) {
		String hexArray = "0123456789ABCDEF";
		String hex = "";
		while (decimal > 0) {
			int remainder = decimal % 16;
			decimal /= 16;
			hex = hexArray.charAt(remainder) + hex;
		}
		return hex;
	}

	/**
	 * Converts given binary value to octal value.
	 * <ul>
	 * <li>Easiest way of converting binary to octal,is to first convert binary to
	 * decimal and decimal to octal</li>
	 * <li>binary-->decimal-->octal</li>
	 * <li>Ex: 111_010 --> decimal 58 --> to octal value --> 72</li>
	 * </ul>
	 * 
	 * @param binary binary value
	 * @return converted Octal value with base 8
	 */
	public static int binaryToOctal(int binary) {
		int octal = 0;
		int decimal = 0;
		decimal = binaryToDecimal(binary);
		octal = decimalToOctal(decimal);
		return octal;
	}

	/**
	 * Converts given binary number to decimal.
	 * <ul>
	 * <li>A binary number is converted to decimal by multiplying each digit with 2
	 * powers from right to left</li>
	 * <li>Ex: 110-->0*2^0+1*2^1+1*2^2-->0+2+4-->6</li>
	 * </ul>
	 * 
	 * @param binary number to convert to decimal
	 * @return decimal value
	 */
	public static int binaryToDecimal(int binary) {
		int decimal = 0, power = 0;
		while (binary > 0) {
			int remainder = binary % 10;
			binary /= 10;
			decimal = decimal + remainder * (int) (Math.pow(2, power++));
		}
		return decimal;
	}

	/**
	 * Converts given Binary value to HexaDecimal Number.
	 * <ul>
	 * <li>Faster way of converting binary to hexadecimal is to first convert binary
	 * to decimal then from decimal to hexadecimal</li>
	 * <li>Binary --> Decimal -->Hexadecimal. Ex: 1_001_110(Binary) --> 78(Decimal)
	 * --> 4E(Hexa)</li>
	 * 
	 * <ul>
	 * 
	 * @param binary number to convert to Hexadecimal
	 * @return String Hexadecimal value
	 */
	public static String binaryToHexadecimal(int binary) {
		String hex = "";
		int decimal = binaryToDecimal(binary);
		hex = decimalToHexadecimal(decimal);
		return hex;
	}

	/**
	 * converts Octal Number to Binary number.
	 * <ul>
	 * <li>Faster process of converting octal to binary is to first convert octal to
	 * decimal then convert it to binary</li>
	 * <li>octal-->decimal-->binary.Ex:
	 * 142(octal)-->98(decimal)-->1100010(binary).</li>
	 * </ul>
	 * *
	 * 
	 * @param octal number to convert
	 * @return binary value
	 */
	public static int octalToBinary(int octal) {
		int decimal = octalToDecimal(octal);
		int binary = decimalToBinary(decimal);
		return binary;
	}

	/**
	 * Converts Octal to Decimal number.
	 * <ul>
	 * <li>We multiply the values at each place with 8 powers to get decimal
	 * values</li>
	 * <li>Ex: 142(octal)-->2*8^0+4*8^1+1*8^2-->2+32+64-->98(decimal)</li>
	 * </ul>
	 * 
	 * @param octal to convert
	 * @return decimal value
	 */
	public static int octalToDecimal(int octal) {
		int decimal = 0, power = 0;
		while (octal > 0) {
			int remainder = octal % 10;
			octal /= 10;
			decimal = decimal + (int) (Math.pow(8, power++)) * remainder;
		}
		return decimal;
	}

	/**
	 * converts given octal value to hexadecimal value.
	 * <ul>
	 * <li>Faster way of converting octal to hexadecimal is to convert it first to
	 * decimal than to hexadecimal</li>
	 * <li>764(octal)-->500(decimal)-->1F4(hexadecimal)</li>
	 * </ul>
	 * 
	 * @param octal value
	 * @return hexadecimal value
	 */
	public static String octalToHexadecimal(int octal) {
		String hex = "";
		int decimal = octalToDecimal(octal);
		hex = decimalToHexadecimal(decimal);
		return hex;
	}

	/**
	 * Converts given hexadecimal to binary value.
	 * <ul>
	 * <li>Fast way of converting hexadecimal to binary is to first convert hexa to
	 * decimal and then decimal to binary</li>
	 * <li>2A(Hex)-->42(Decimal)-->101010(binary)</li>
	 * </ul>
	 * 
	 * @param hexadecimal value
	 * @return binary number
	 */
	public static int hexadecimalToBinary(String hexadecimal) {
		int decimal = hexadecimalToDecimal(hexadecimal);
		int binary = decimalToBinary(decimal);
		return binary;
	}

	/**
	 * Converts given Hexadecimal String to Octal variable
	 * <ul>
	 * <li>Fast way of converting hexadecimal to octal is to first convert hexa to
	 * decimal then decimal to octal</li>
	 * <li>2A(Hex)-->42(Decimal)-->52(Octal)</li>
	 * </ul>
	 * 
	 * @param hexadecimal value
	 * @return Octal value
	 */
	public static int hexadecimalToOctal(String hexadecimal) {
		int decimal = hexadecimalToDecimal(hexadecimal);
		int octal = decimalToOctal(decimal);
		return octal;

	}

	/**
	 * Converts Given Hexadecimal String to Decimal Number
	 * <ul>
	 * <li>To convert Hexadecimal to String we multiply each character numeric value
	 * with 16 powers</li>
	 * <li>Ex:
	 * 2CF-->2*16^2+C*16^1+F*16^0-->512+(12)valueofC*16+(15)valueofF*1-->512+12*16+15-->719(decimal)</li>
	 * </ul>
	 * 
	 * @param hexadecimal hexadecimal String
	 * @return decimal Number
	 */
	public static int hexadecimalToDecimal(String hexadecimal) {
		int decimal = 0, power = 0;
		String hexData = "0123456789ABCDEF";
		hexadecimal = hexadecimal.toUpperCase();
		while (hexadecimal.length() > 0) {
			int lastposition = hexadecimal.length() - 1;
			// takes last character's index in above String
			int remainder = hexData.indexOf(hexadecimal.substring(lastposition));
			// deletes last character from user input String
			hexadecimal = (hexadecimal.substring(0, lastposition));
			decimal = decimal + remainder * (int) (Math.pow(16, power++));
		}
		return decimal;
	}

	// Time Conversion Programs

	/**
	 * Converts seconds to days
	 * 
	 * @param seconds number of seconds
	 * @return number of days
	 */
	public static double secondsToDays(double seconds) {
		double hours = secondsToHours(seconds);
		double days = hoursToDays(hours);
		return days;
	}

	/**
	 * Converts seconds to hours
	 * 
	 * @param seconds number of seconds
	 * @return number of hours
	 */
	public static double secondsToHours(double seconds) {
		double minutes = secondsToMinutes(seconds);
		double hours = minutesToHours(minutes);
		return hours;
	}

	/**
	 * Converts seconds to minutes
	 * 
	 * @param seconds number of seconds
	 * @return number of minutes
	 */
	public static double secondsToMinutes(double seconds) {
		// 60 seconds per minute
		double minutes = seconds / 60;
		return minutes;
	}

	/**
	 * Converts minutes to days
	 * 
	 * @param minutes number of minutes
	 * @return number of days
	 */
	public static double minutesToDays(double minutes) {
		double hours = minutesToHours(minutes);
		double days = hoursToDays(hours);
		return days;
	}

	/**
	 * Converts minutes to hours
	 * 
	 * @param minutes number of minutes
	 * @return number of hours
	 */
	public static double minutesToHours(double minutes) {
		double hours = minutes / 60;
		return hours;
	}

	/**
	 * converts minutes to seconds
	 * 
	 * @param minutes number of minutes
	 * @return time in seconds
	 */
	public static long minutesToSeconds(long minutes) {
		// 60 seconds per minute
		return minutes * 60;
	}

	/**
	 * converts hours to days
	 * 
	 * @param hours number of hours
	 * @return number of days
	 */
	public static double hoursToDays(double hours) {
		hours = roundOfToDecimals(hours, 6);
		double days = hours / 24;
		return roundOfToDecimals(days, 6);
	}

	/**
	 * converts hours to minutes
	 * 
	 * @param hours number of hours
	 * @return time in minutes
	 */
	public static long hoursToMinutes(long hours) {
		// 60 minutes per hour
		return hours * 60;
	}

	/**
	 * Converts hours to seconds
	 * 
	 * @param hours number of hours
	 * @return time in seconds
	 */
	public static long hoursToSeconds(long hours) {
		long minutes = hoursToMinutes(hours);
		return minutesToSeconds(minutes);
	}

	/**
	 * Converts Days to Hours
	 * 
	 * @param days number of days
	 * @return Time in hours.
	 */
	public static long daysToHours(long days) {
		// 24 hours per day
		return days * 24;
	}

	/**
	 * Converts Days to Minutes
	 * 
	 * @param days Number of Days
	 * @return time in Minutes
	 */
	public static long daysToMinutes(long days) {
		long hours = daysToHours(days);
		return hoursToMinutes(hours);
	}

	/**
	 * Converts Days to Seconds
	 * 
	 * @param days Number of Days
	 * @return time in Seconds
	 */
	public static long daysToSeconds(long days) {
		long minutes = daysToMinutes(days);
		return minutesToSeconds(minutes);
	}

	public static int stringToInt(String s) {
		return 1;
	}

	public static long stringToLong(String s) {
		return 1;
	}

	public static float stringToFloat(String s) {
		return 1.0f;
	}

	public static double stringToDouble(String s) {
		return 1.0;
	}

	public static char stringToChar(String s) {
		return 'a';
	}

	public static String stringToDate(String s) {
		return "date";
	}

	public static String stringToObject(String s) {
		return "object";
	}

	public static boolean stringToBoolean(String s) {
		return true;
	}

	public static String intToString(int num) {
		return " ";
	}

	public static long intToLong(int num) {
		return 1l;
	}

	public static double intToDouble(int num) {
		return 1.0;
	}

	public static char intToChar(int num) {
		return 'a';
	}

	public static String longToString(long num) {
		return " ";
	}

	public static String doubleToString(double num) {
		return " ";
	}

	public static String charToString(char val) {
		return " ";
	}

	public static int charToInt(char val) {
		return 1;
	}

	public static String objectToString(Object o) {
		return " ";
	}

	public static String booleanToString(boolean x) {
		return " ";
	}

	public static String dateToTimestamp(String s) {
		return "timestamp";
	}

	public static String timestampToDate(String s) {
		return "date";
	}

	/**
	 * Sorts given array in Ascending or Descending Order
	 * 
	 * @param arr   Integer Array
	 * @param order true--> Sorts array in Ascending order,false --> Sorts array in
	 *              Descending order.
	 * @return Sorted Array.
	 */
	public static int[] sort(int arr[], boolean order) {
		if (order) {
			// using two loops
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} else if (!order) {
			// using single loop
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					// resets the search from beginning
					i = -1;

				}
			}

		}
		return arr;
	}

	/**
	 * Calculates Max value in given array
	 * 
	 * @param arr integer array
	 * @return Max number of array
	 */
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * Calculates Minimum value in given array
	 * 
	 * @param arr integer array
	 * @return Minimum number of array
	 */
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * Calculates average of all values in given array
	 * 
	 * @param arr integer array
	 * @return average of array
	 */
	public static double avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}

	/**
	 * Finds the HCF of given array of elements
	 * <ul>
	 * <li>HCF(Highest Common Factor) or GCF(Greatest Common Factor) or HCD(Highest
	 * Common Divisor) or GCD(Greatest Common Divisor)</li>
	 * <li>HCF of multiple numbers is calculated by taking all the prime factors of
	 * individual numbers then finding the common factors of all given numbers.</li>
	 * <li>Here we find HCF of given array by find HCF of two numbers and using it
	 * with next number.</li>
	 * <li>Ex: 12,24,50--> we first find HCF of 12,24 --> 24%12=0-->so 12 is the
	 * Highest common factor.</li>
	 * <li>next we find HCF between 12 and 50, 50%12-->2, so we find HCF of 2 and 12
	 * , 12%2-->0 so HCF is 2</li>
	 * <li>We use recursion for faster and easy execution</li>
	 * </ul>
	 * 
	 * @param arr Integer array to find HCF
	 * @return HCF of all array elements
	 */
	public static int hcf(int[] arr) {
		int hcf = 0;
		for (int i : arr) {
			hcf = gcdRecursive(hcf, i);
			if (hcf == 1) {
				return 1;
			}
		}
		return hcf;
	}

	/**
	 * Private GCD method used for recursion.
	 * 
	 * @param a small value of GCD
	 * @param b large value of GCD
	 * @return GCD of a, b
	 */
	private static int gcdRecursive(int a, int b) {
		if (a == 0)
			return b;
		return gcdRecursive(b % a, a);
	}

	public static int lcm(int[] arr) {
		int lcm = 1;
		for (int i : arr) {
			if (i == 0 || lcm == 0) {
				return 0;
			}
			lcm = lcm(lcm, i);
		}
		return lcm;
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int lcm(int a, int b) {
		int lcm = a > b ? a : b;
		while (true) {
			if (lcm % a == 0 && lcm % b == 0) {
				break;
			}
			lcm++;
		}
		return lcm;
	}

}
