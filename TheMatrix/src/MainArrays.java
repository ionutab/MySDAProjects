import java.util.Scanner;

public class MainArrays {

    public static void printArray(int[] myArray, int n){
        for(int i = 0; i < n; i++){
            System.out.print(myArray[i] + " ");
        }
    }

    public static int positionOfElementInArray(int[] myArray, int n, int e){
        //presupunem initial ca acesta nu exista in array
        int pozition = -1;

        //parcurgem array si cautam elementul
//        for(int i = 0; i < n; i++){
//            if(pozitie < 0 && a[i] == e){
//                pozitie = i;
//            }
//        }

        //facem cu while
        int i = 0;
        while(pozition < 0 && i < n){
//            System.out.println("testam pozitia " + i + " din array");
            if(myArray[i] == e){
                pozition = i;
            }
            i++;
        }

        return pozition;
    }

    public static void removeDuplicates(int[] myArray, int n){

        int[] myUnique = new int[n];
        //nmarul de elemente unice gasite
//        int nrOfUniqueElementsFound = 0;
        int nrOfDuplicateElements = 0;

        for(int i = 0; i < n; i++){
            //elementul pe care vreau sa il caut
            int e = myArray[i];
            int position = positionOfElementInArray(myArray, n, e);
            if(position == i){
                myUnique[i - nrOfDuplicateElements] = e;
//                nrOfUniqueElementsFound++;
            } else {
                nrOfDuplicateElements++;
            }
        }

        System.out.println(" NUmarul de elemente duplicate " + nrOfDuplicateElements);
        printArray(myUnique, n - nrOfDuplicateElements);
    }

    public static void main(String[] args) {

        /*
        * gasirea pozitiei unui element intr-un array
        * */
        Scanner scanner = new Scanner(System.in);

        //citim n
        System.out.println("Cititi n:");
        int n = scanner.nextInt();

        //citim array[n]
        System.out.println("Cititi " + n + " elemente: ");
        int[] a = new int[n];
        for(int i = 0; i < n; i ++){
            a[i] = scanner.nextInt();
        }

        //afisam array[n]
        printArray(a, n);

        //citim elementul cautat
        System.out.println("Cititi elementul cautat: ");
        int e = scanner.nextInt();

        int pozitie = positionOfElementInArray(a, n, e);
        //afisam rezultatul cautarii
        if(pozitie >= 0){
            System.out.println("Pozitia lui " + e + " este " + pozitie);
        } else {
            System.out.println("Elementul nu exista in array.");
        }

        removeDuplicates(a, n);
    }
}
