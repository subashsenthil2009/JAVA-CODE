public class Matsum {
    public static void main(String[] args) {
        int A[][]={{1,2,3},
                   {4,5,6}},
            B[][]={{6,5,4},
                   {3,2,1}};
        
        int row=A.length;
        int col=A[0].length;

        int C[][]=new int[row][col];
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                C[i][j]=A[i][j]+B[i][j];
               
                 System.out.print(C[i][j]+" ");
            }
            System.out.println();
        
        }
    }
    
}
