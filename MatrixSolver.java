
/**
 * Write a description of class MatrixSolver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MatrixSolver
{
    // instance variables - replace the example below with your own
    public int matrixA[][];
    public int matrixB[][];
    public int [][] nonReduced;
     
    public int rowVector1[];
    public int rowVector2[];
    public int addedRowVector[];
    public int addedMatrix[][];
    /**
     * Constructor for objects of class Matrices
     */
    public MatrixSolver()
    {
        rowVector1 = new int[] {3,1,2};
        rowVector2 = new int[] {1,4,0};
        int matrixA[][] = {rowVector1,rowVector1,rowVector1}; 
        int matrixB[][] = {{1,1,1},{2,2,2},{3,3,3}};
        nonReduced = new int[3][3];
        
        
        addedRowVector = addMatrix(rowVector1, rowVector2);
        int addedMatrix [][] = {addedRowVector,addedRowVector,addedRowVector};
        printMatrix(addedMatrix);
    }
    
    public static void main(String [] args){
        
        System.out.println("Matrix Solver v1 n/" + "Enter the first row vector");
       
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


