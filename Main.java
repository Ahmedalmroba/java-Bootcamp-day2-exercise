import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
       /* 1. Develop a program that takes the weight (in kilograms) and height (in meters) as
        input and calculates the BMI, then prints it.
 Input: Weight (kg) = 70, Height (m) = 1.75
 Expected ٫Output: BMI = 22.86*/


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms ");
        float weight = input.nextFloat();

        System.out.print("Enter your height in meters");
        float height = input.nextFloat();
        float bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

       /* 2. Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0% */


        System.out.print("Enter the obtained marks");
        double obtainedMarks = input.nextDouble();

        System.out.print("Enter the total marks");
        double totalMarks = input.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + percentage);

        /*  3. Create a program that takes an amount in one currency and an exchange rate as
        input, then converts and prints the amount in another currency*/

        System.out.print("Enter the amount in USD: ");
        double amountUSD = input.nextDouble();

        System.out.print("Enter the exchange rate (USD to EUR): ");
        double exchangeRate = input.nextDouble();

        double amountEUR = amountUSD * exchangeRate;
        System.out.println("Amount in EUR = " + amountEUR);
        /*4. Create a program that takes a string as input, calculates its length, and then reverses
the string using the StringBuilder class, finally printing both the length and reversed
string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
,olleH"*/

        System.out.print("Enter a string: ");
        String l = input.nextLine();

        int length = l.length();

        StringBuilder reversedBuilder = new StringBuilder();
        reversedBuilder.reverse();
        String reversedString = reversedBuilder.toString();

        System.out.println("Length of the string: " + length);
        System.out.println("Reversed string: " + reversedString);
/*5. Develop a program that takes a sentence as input and extracts a substring from it,
then prints the extracted substring.*/
        System.out.print("Enter a string: ");
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = input.nextInt();

        String extractedSubstring = sentence.substring(startIndex, endIndex + 1);

        System.out.println("Extracted substring: " + extractedSubstring);

        /*6. Write a program that takes a sentence and a keyword as input, then check if the
keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
"jumps"
• Expected Output: Keyword "jumps" is present in the sentence*/
        System.out.print("Enter a sentence: ");
        String s2 = input.nextLine();

        System.out.print("Enter a keyword: ");
        String keyword = input.nextLine();

        boolean isPresent = sentence.contains(keyword);
        String result = isPresent ? "present" : "not present";

        System.out.println("Keyword " + keyword + " is " + result + " in the sentence");
        /*7. Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.*/
        System.out.print("Enter a sentence: ");
        String s3 = input.nextLine();

        System.out.print("Enter a word to replace: ");
        String wordToReplace = input.next();

        System.out.print("Enter a replacement word: ");
        String replacementWord = input.next();

        String modifiedS3 = sentence.replace(wordToReplace, replacementWord);

        System.out.println("Modified sentence: " + modifiedS3);

/*8. Write a program that takes two strings as input and check if they are equal, ignoring
the case, then prints whether they are equal or not*/
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        boolean isEqual = str1.equalsIgnoreCase(str2);

        String resultt = String.valueOf(isEqual);
        result = result.replace("false", "not equal");
        result = result.replace("true", "equal");

        System.out.println("The strings are " + result + " (ignoring case).");
    }}






