import java.util.Scanner;

public class Palindrom{

    public static void main(String[] args){
        int numb ;
        Scanner sc = new Scanner(System.in);
        numb= sc.nextInt();
        int reverseNumber=0, temp = numb;

        while (temp>0){
            int remender = temp% 10;
            reverseNumber = reverseNumber*10+remender;
            temp =temp/10;
        }
        if(numb==reverseNumber)
            System.out.println("pali");
        else
            System.out.println("not pali");
    }
}
