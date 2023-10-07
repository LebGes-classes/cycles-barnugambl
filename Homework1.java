import java.util.Scanner;
import java.lang.Math;

public class Homework1 {
    public static void main(String[] args){
        //Задание 2, вариант 1, циклы
        /*for(int i = 0; i < 100; i++){
            if(sumdigits(i) == sumdigits(i*2)){
                System.out.println(i);
            }

        }
    }
    public static int sumdigits(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num % 10;
            num = num / 10;

        }
    return sum;
    */
        // Задание 1, вариант 1, циклы
        Scanner scanner = new Scanner(System.in);
        double x = -9;
        double r = 3;
        double y = 0;
        System.out.println("Значение аргумента Значение функции ");
        while (x < 10){
            if (x >= -9 && x <= - 6) {
                y = -(Math.pow(r * r - x * x + 2 * x * (-6) - 36, 0.5));
            }
            else if (x  >= -3 && x <= 0){
                y = (Math.pow(r * r - x * x, 0.5));

            }
            else if ( x >= 0 && x <= 3){
                y = (x * 0 - 0 * 0 - x * 3 + 0 * 3) / (3 - 0) + 3;
            }
            else if (x >= 3 && x <= 9){
                y = (x * 3 - 3 * 3 - x * 0 + 3 * 0) / (9 - 3) + 0;

            }
            System.out.println(x + y);
            x++;
        }

    }
}
