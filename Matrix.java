import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Row and Colunm : ");
        int row=sc.nextInt();
        int colunm=sc.nextInt();

        int Matrix[][]=new int[row][colunm];
        for(int s=0;s<Matrix.length;s++){

            for(int m=0;m<Matrix[s].length;m++){
                Matrix[s][m]=sc.nextInt();

            }
        }
        
        for(int m=0;m<Matrix.length;m++){
            
            for(int j=0;j<Matrix[m].length;j++){
            System.out.print(Matrix[j][m]+" ");
            }
            System.out.println();
        }
      
    }
    
}
