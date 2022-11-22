import java.util.Scanner;

public class numberToWord {
    Scanner sc = new Scanner(System.in);
    String[] singleDigitNum = {"zero","one","two","three","four","five","six","seven","eight", "nine"};
    String[] doubleDigitNum = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen" ,
            "eighteen","nineteen"};
    String[] twoDigitNum = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","one hundred"};
    public numberToWord(){
        String word = null;
        System.out.println("Input the number :");
        int takeNum=sc.nextInt();
        if(takeNum<10){
            word=singleDigitNum[takeNum];
        }else if(takeNum>=10 && takeNum<=19){
            word=doubleDigitNum[takeNum-10];
        } else if (takeNum%10==0) {
            word=twoDigitNum[takeNum/10];
        } else if (takeNum>20) {
            word=twoDigitNum[takeNum/10]+"-"+singleDigitNum[takeNum%10];
        }
        System.out.println("Number in word is :" + word);
    }
}
