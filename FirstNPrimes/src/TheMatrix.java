import java.util.Scanner;

public class TheMatrix {


    public static void sumLC(int size, int[][] myMatrix){

        for(int k1 = 0; k1 < size; k1++){
            double sumL = 0;
            double sumC = 0;
            for(int k2 = 0; k2 < size; k2++){
                sumL = sumL + myMatrix[k1][k2];
                sumC = sumC + myMatrix[k2][k1];
            }
            System.out.println("Suma elementelor de pe linia " + k1 + " este " + sumL);
            System.out.println("Suma elementelor de pe coloana " + k1 + " este " + sumC);
        }
    }
    public static void sumLines(int size, int[][] myMatrix){
        for(int i = 0; i < size; i++){
            int sumL = 0;
            for(int j = 0; j < size; j++){
                sumL = sumL + myMatrix[i][j];
            }
            System.out.println("Suma elementelor de pe linia " + i + " este " + sumL);
        }
    }

    public static void sumColumns(int size, int[][] myMatrix){
        //        iterez prin coloane
        for(int j = 0; j < size; j++){
            int sumC = 0;
            for(int i = 0; i < size; i++){
                sumC = sumC + myMatrix[i][j];
            }
            System.out.println("Suma elementelor de pe coloana " + j + " este " + sumC);
        }
    }

    public static void printMatrix(int[][] myMatrix){
        for(int i = 0; i < myMatrix.length; i++){
            for(int j = 0; j < myMatrix[i].length; j++){
//                System.out.print(myMatrix[i][j] + " ");
                System.out.print(myMatrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Reading matrix " + n + " x " + n);

        int[][] a = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        printMatrix(a);
        System.out.println();
        sumLines(n, a);
        System.out.println();
        sumColumns(n, a);
        System.out.println();
        sumLC(n, a);
    }
}
