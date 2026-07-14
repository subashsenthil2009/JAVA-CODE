public class MatrixMultiply {
    public static void main(String[] args) {
        int A[][]={{1,2,3},
                   {4,5,6}},
            B[][]={{6,5},
                   {4,3},
                   {2,1}};

        int row1=A.length;
        int col1=B.length;
        int row2=A[0].length;
        int col2=B[0].length;

        int C[][]=new int[2][2];

        for(int i=0;i<row1;i++){

            for(int j=0;j<col2;j++){

                for(int k=0;k<row2;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                    
                    
                }
            }
        

        for(int i=0;i<row1;i++){

            for(int j=0;j<col2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
