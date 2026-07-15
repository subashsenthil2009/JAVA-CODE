public class ThreeDarray {
    public static void main(String[] args) {
        int layer=2;
        int row=3;
        int col=2;

        int arr[][][]=new int[layer][row][col];

        int n=0;

        for(int i=0;i<layer;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    arr[i][j][k]=n++;
                    
                    
                }
            }
        }

         for(int i=0;i<layer;i++){
            int sum=0;
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    sum+=arr[i][j][k];
                    System.out.print(arr[i][j][k]+" ");
            }
            System.out.println();
        }System.out.println(sum+"  ____________________");
    }
    }
        
        
}
