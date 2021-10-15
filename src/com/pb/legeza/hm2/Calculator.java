package com.pb.legeza.hm2;
import java.util.Scanner;

public class Calculator  {
         public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int operand1;
            int operand2;
            int result  = 0;
            char operation;
            System.out.println("Число 1:");
            operand1 = scan.nextInt();
            System.out.println("Введите операцию:");
            operation = scan.next().charAt(0);
            System.out.println("Число 2:");
            operand2 = scan.nextInt();

            switch (operation) {
                case '+': result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*': result = operand1 * operand2;
                    break;
                case '/':if (operand2 == 0) {
                    System.out.println("на 0 нельзя делить!");
                } else {
                    result = operand1 / operand2;
                }
                    break;
                default:  System.out.println("Error");
                    return;

            }
            System.out.println("Итог " + result);
        }

    }

