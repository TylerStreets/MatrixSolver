import java.util.*;
import java.util.Scanner;
/**
 * Write a description of class MatrixSolver here.
 *
 * @author (Gabriel Alirio Maldonado, Tyler Streets)
 * @version (a version number or a date)
 */
public class MatrixSolver
{
    // instance variables - replace the example below with your own
    public int matrixA[][];
    public int matrixB[][];
    public int [][] nonReduced;
     
    
    /**
     * Constructor for objects of class Matrices
     */
        public MatrixSolver()
    {
      int rowVector[];
      int addedRowVector[];
      int addedMatrix[][];
      
    }
    
    public static void main(String [] args){
        MatrixSolver solver = new MatrixSolver();
        Scanner in= new Scanner(System.in);
        System.out.println("Matrix Solver v1 n/" + "Enter the length of the row vectors");
        int x = in.nextInt();
        if(!in.hasNextInt()) {
           System.out.println("Not an integer, please try again");
            in.next();
        } else{
            
        }
        
    }

    public void printMatrix(int [] [] x)
    {
        for (int i = 0; i < x.length; i++) {    
            for (int j = 0; j < x[i].length; j++) {
                System.out.printf("%2d ",  x [i][j]);
            }    
            System.out.println();
        }
    }
    
    public int[] addMatrix(int [] a, int [] b){
        int [] finalRowVector;
        finalRowVector = new int[a.length];
        for( int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                int x = a [j];
                int y = b [j];
                finalRowVector[j] = x + y; 
            }
        }
     
        return finalRowVector;

    }
}


