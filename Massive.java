import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[scanner.nextInt()];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }
        int per = 1;
        for(int i = 0; i < massive.length; i+=2){
            per *= massive[i];
        }
        System.out.println(per + " Это произведение элементов с четными номерами");
        int sum = 0;
        int zero1 = -1;
        int zero2 = -1;
        for(int i = 0; i < massive.length; i++){ // Находим первое и последнее вхождение 0
            if(massive[i] == 0){
                if(zero1 == -1){
                    zero1 = i;
                } else{
                    zero2 = i;
                }
            }
        }
        if(zero1 != -1 && zero2 != -1){ // Считаем сумму между нулями
            for(int i = zero1+1; i < zero2; i++){
                sum+=massive[i];
            }
        }
        for(int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + " ");
        }
        System.out.println(" - Вывод массива на экран");
        System.out.println(sum + " Сумма между нулями");



        // Задание на матрицу
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = scanner.nextInt();

            }
        }
        int cnt=a;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                //System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]==0){
                    cnt--;
                }
                int[] temp = matrix[0];
                matrix[0] = matrix[1];
                matrix[1] = temp;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("колво строк без нулей "+cnt);
    }


    }







