package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, count = 0;
        int sum = 0;
        int rev = 0;
        int numcopy = num;
        int numcopy2 = num;
        while(num!=0){
            count++;
            num = num/10;
        }
        System.out.println(count);
        while(numcopy!=0) {
            int factor = 1;
            rem = numcopy % 10;
            for (int i = 0; i < count; i++) {
                factor = factor * rem;
            }
            rev = 10*rev+rem;
            sum=sum+factor;
            numcopy=numcopy/10;
        }
        int fact = 1;
        for (int j = 1; j <=numcopy2; j++) {
            fact = fact * j;
        }
        System.out.println("factorial: "+fact);
        System.out.println(sum);
        System.out.println(rev);
        if(numcopy2==sum){
            System.out.println("It is amstrong number");
        }else{
            System.out.println("It is not an amstrong number");
        }
    }
}
