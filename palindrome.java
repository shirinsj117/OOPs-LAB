import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args){
        String str,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        int n = str.length();
        for(int i=n-1;i>=0;i--)
        rev = rev + str.charAt(i);
        if(str.equals(rev))
        System.out.println(str+"is a palindrome");
        else
        System.out.println(str+"is not a palindrome");

    }
}