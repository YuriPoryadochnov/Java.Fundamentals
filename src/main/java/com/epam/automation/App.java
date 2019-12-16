package com.epam.automation;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main (String [] args) {
        //HelloThere(args);
        //ReverseArguments(args);
        //RandomNum(5);
        //SumCommandArgs(args);
        //Month(10);
        OptionalTask workTask = new OptionalTask(5);
        //workTask.MaxMinLength();
        workTask.LengthSort();
    }

    public static void HelloThere(String[] massArgs)
    {
        for (int i = 0; i < massArgs.length; i++) {
            System.out.println("Welcome, " + massArgs[i]);
        }
    }
    public static void ReverseArguments(String[] massArgs)
    {
        for (int i = massArgs.length-1; i >= 0; i--) {
            System.out.print(massArgs[i] + " ");
        }
    }
    private static void RandomNum(int countNum)
    {
        Random random = new Random();
        for (int i = 0; i <= countNum; i++)
        {
            int r = random.nextInt(101);
            System.out.print(r);
            System.out.println(r);
        }
    }
    private static void SumCommandArgs(String [] massArg)
    {
        int summ = 0;
        for (int i = 0; i < massArg.length ; i++)
        {
         summ += Integer.parseInt(massArg[i]);
        }
        System.out.println(summ);
    }
    private static void Month(int numMonth)
    {
        switch (numMonth)
        {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }
    }

}
class OptionalTask
{
    int[] massNumbers;

    public  OptionalTask(int countNum)
    {
        massNumbers = new int[countNum];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < countNum ; i++)
        {
            massNumbers[i] = scan.nextInt();
        }
    }
    public void MaxMinLength ()
    {
        int minNum = massNumbers[0];
        int maxNum =massNumbers[0];
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int numM;
        int tempCount;
        for (int i = 0; i < massNumbers.length ; i++)
        {
            numM = massNumbers[i];
            tempCount = 0;
            while (numM > 0)
            {
                numM /=10;
                tempCount++;
            }
            if (minLength > tempCount)
            {
                minLength = tempCount;
                minNum = massNumbers[i];
            }
            if (maxLength < tempCount)
            {
                maxLength = tempCount;
                maxNum = massNumbers[i];
            }
        }
        System.out.println("MinNum: " + minNum + " MinLength: " + minLength + " MaxNum: " + maxNum + " MaxLength: " + maxLength);
    }
    public void LengthSort()
    {
        int [] lengthMas = new int[massNumbers.length];
        for (int i = 0; i < massNumbers.length ; i++)
        {
            int numM = massNumbers[i];
            int tempCount = 0;
            while (numM > 0)
            {
                numM /= 10;
                tempCount++;
            }
            lengthMas[i] = tempCount;
        }
        boolean swap;
        int temporaryNumber = 0;
        int tempNum = 0;
        if(massNumbers.length == 1)
        {
            System.out.println(massNumbers[0]);
        }
        else
        {
            do {
                swap =false;
                for (int i = 1; i < massNumbers.length; i++)
                {
                        if (lengthMas[i-1] > lengthMas[i])
                        {
                            temporaryNumber = lengthMas[i - 1];
                            tempNum = massNumbers[i - 1];
                            lengthMas[i - 1] = lengthMas[i];
                            massNumbers[i - 1] = massNumbers[i];
                            lengthMas[i] = temporaryNumber;
                            massNumbers[i] = tempNum;
                            swap = true;
                        }
                }
            }while (swap == true);
        }
        for (int i = 0; i <massNumbers.length ; i++)
        {
            System.out.print(massNumbers[i] + " ");
        }
    }


}



