package input_in_java;
public class input{


public static void main(String[] args) {
  

System.out.println("this is doc for input on java");

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
System.out.println(a);
System.out.println(a);


int b = sc.nextInt();
System.out.println(b);
System.out.println(a);

int c = sc.nextInt();
System.out.println(a);
System.out.println(a);

/*
 * import java.util.Scanner;
 *   Scanner scanner = new Scanner(System.in);
 * 
 * 
 * String Input
Use              scanner.nextLine()               to read a full line of text (including spaces).
Use                  scanner.next()                    to read a single word (up to the first space).
 * 
 *  Floating-Point Numbers
Use scanner.nextFloat() for float or scanner.nextDouble() for double.
 * 
 * d. Character Input
Java does not have a direct method in Scanner for reading single characters. Use scanner.next().charAt(0):
 * 
 * Input Validation: Always validate user input to handle invalid data (e.g., try-catch for InputMismatchException).
java
Copy code
try {
    int number = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Invalid input. Please enter a number.");
}
Sure! Let’s explain in Hinlish (Hindi + English) for better understanding. 😊

1. Scanner Class ka Purpose
Question: Scanner class ka kya kaam hai?
Answer:
Scanner ka use hum input lene ke liye karte hain, jaise ki int, String, ya double. Yeh System.in ke through console se input leta hai.

2. Agar scanner.nextInt() ke liye String input kar diya to kya hoga?
Answer:
Agar aap int ke jagah String ya invalid input doge, to InputMismatchException aayega.
Example:

plaintext
Copy code
Enter your age: hello
Output: InputMismatchException
Solution: Exception handle karne ke liye try-catch block use karein:

java
Copy code
try {
    int number = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter a number.");
}
3. scanner.nextInt() ke baad scanner.nextLine() kyun lagana padta hai?
Answer:
scanner.nextInt() sirf number read karta hai, lekin newline character (\n) buffer mein chhod deta hai. Agar aap turant scanner.nextLine() use karte ho, to wo khali string return karega.

Solution: scanner.nextLine() use karke buffer clear kar lo:

java
Copy code
scanner.nextLine(); // Clear buffer
4. scanner.next() aur scanner.nextLine() ka difference?
Answer:

scanner.next(): Ek word (space tak) read karta hai.
scanner.nextLine(): Pura line (newline tak) read karta hai.
Example:
Input:

plaintext
Copy code
Hello World
Code:

java
Copy code
System.out.println(scanner.next());  // Output: Hello
System.out.println(scanner.nextLine());  // Output: World
5. Single Character Input kaise karenge?
Answer:
Directly character input lene ka method nahi hai. Aapko scanner.next() ke pehle character ko lena padega:

java
Copy code
char favoriteChar = scanner.next().charAt(0);
6. Boolean Input kaise hota hai?
Answer:
scanner.nextBoolean() use karte hain, jo true ya false ko accept karta hai:

java
Copy code
System.out.print("Are you a student (true/false): ");
boolean isStudent = scanner.nextBoolean();
7. Agar ek hi line mein multiple inputs lene ho to kaise karenge?
Answer:
Jab ek line mein space-separated inputs ho, to scanner.next() ya scanner.nextInt() loop mein use karte hain.

Example:
Input:

plaintext
Copy code
10 20 30
Code:

java
Copy code
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
System.out.println(a + b + c);  // Output: 60
8. Scanner ke Limitations kya hain?
Large files ke liye Scanner slow hota hai, us case mein BufferedReader better option hai.
Input mismatch hone par exception throw hota hai, jo handle karna zaroori hai.
9. Scenario-Based Question: File Parsing
Question: Agar ek file hai jisme space-separated data hai, usse kaise parse karenge?
Answer: File ko Scanner ke object mein pass karo aur next() ya nextLine() ka use karo.

Example:
File Content (data.txt):

plaintext
Copy code
Alice 23
Bob 30
Code:

java
Copy code
Scanner fileScanner = new Scanner(new File("data.txt"));
while (fileScanner.hasNextLine()) {
    System.out.println(fileScanner.nextLine());
}
Interview Tips:
Exception handling ka proper use samajhna zaroori hai.
Edge cases jaise scanner.nextInt() ke baad nextLine() handle karna aana chahiye.
Agar performance ka issue hai, to BufferedReader ke saath comparison discuss karo.
Agar aur questions ya examples chahiye ho, to batayein! 😊
 */

}



}
>>>>>>> 1ba765a (input class in java)
