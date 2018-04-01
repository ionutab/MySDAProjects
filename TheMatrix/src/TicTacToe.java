import java.util.Scanner;

public class TicTacToe {

    static int n = 3;
    static int[][] game = new int[n][n];

    static boolean win = false;
    static boolean finished = false;

    //    jucatorul X
    static String player1;
    //    jucatorul 0
    static String player2;

    static final String SIGN_X = "X";
    static final String SIGN_0 = "0";

    static String boxSign(int value){
        if(2 == value){
            return SIGN_0;
        } else if(1 == value){
            return SIGN_X;
        } else {
            return " ";
        }
    }

    public static int boxValue(String sign){
        if(SIGN_X == sign){
            return 1;
        } else if (SIGN_0 == sign){
            return 2;
        } else {
            return 0;
        }
    }

    public static String getPlayerSign(String player){
        if(player1 == player){
            return SIGN_X;
        } else {
            return SIGN_0;
        }
    }

    static void printGame(){
        System.out.println("-------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                String sign = boxSign(game[i][j]);
                System.out.print("|" + sign);
            }
            System.out.println("|");
            System.out.println("-------");
        }
    }

    public static boolean isWinLine( int lineNr, int value){
        boolean winL = true;
        int i = 0;
        while (winL == true && i < n){
            if (game[lineNr][i] != value) {
                winL = false;
            }
            i++;
        }
        return winL;
    }

    public static boolean isWinCol( int colNr, int value){
        boolean winC = true;
        int i = 0;
        while (winC == true && i < n){
            if (game[i][colNr] != value) {
                winC = false;
            }
            i++;
        }
        return winC;
    }

    public static boolean isWinDiags(int value){


        return false;
    }

    public static boolean isWin(int value){

        boolean gameWin = false;

        //testam linii
        int i = 0;
        while(i < n && false == gameWin){
            gameWin = isWinLine(i, value);
            i++;
        }
        //testam coloane
        i = 0;
        while(i < n && false == gameWin){
            gameWin = isWinCol(i, value);
            i++;
        }

        //testam diagonale
        return gameWin;
    }

    public static void main(String[] args){

        System.out.println("Tic Tac Toe");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numele Jucatorului X");
        player1 = scanner.nextLine();
        System.out.println("Numele Jucatorului 0");
        player2 = scanner.nextLine();

        System.out.println("Jucatorii sunt: " + player1 + " / " + player2 );


        printGame();

        String currentPLayer = player1;
        int nrOfMoves = 0;

        // whle I play
        while(!(win || finished)){

            // play game
            System.out.println("Jucatorul " + currentPLayer + " muta: ");
            // jucatorul face mutarea
            System.out.println(" linia: ");
            int mLine = scanner.nextInt();
            System.out.println(" coloana: ");
            int mCol = scanner.nextInt();

            //determiname semnul jucatorului curent
            String currentPlayerSign = getPlayerSign(currentPLayer);
            //determinam ce valore trebuie sa punem in matrice (1 sau 2)
            int valueOfMove = boxValue(currentPlayerSign);
            //efectuam mutarea
            game[mLine][mCol] = valueOfMove;
            //s-a efectuat o mutare - incrementez numarul de mutari
            nrOfMoves++;

            // win = test pentru win
            win = isWin(valueOfMove);

            // finished = test pentru finished
            if(nrOfMoves == (n*n)){
                finished = true;
            }

            printGame();

            //testam daca are sens sa schimbam jucatorul
            if(!(win || finished)){
                // schimbam jucatorul
                if(currentPLayer == player1){
                    currentPLayer = player2;
                } else {
                    currentPLayer = player1;
                }
            }
        }

        if(true == win){
            System.out.println("Jucatorul " + currentPLayer + " este castigator !");
        } else {
            if(true == finished){
                System.out.println("Remiza!");
            }
        }



    }
}
