public class SubArrayAlphabet {
    public static void main(String[] args) {
        
        // String [] arr={"a","b","c","d","e","f","g","h","i","j","k","l",
        //                 "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        // // for(int i=0;i<arr.length;i++){
        // //     for(int j=i;j<arr.length;j++){
        // //         for(int k=i;k<=j;k++){
        // //             System.out.print(arr[k]+" ");
        // //         }
        // //         System.out.println();
        // //     }
        // // }

        for(int i=1;i<=26;i++){
            for(int j=i;j<=26;j++){
                for(int k=i;k<=j;k++){
                    int y=k+64;
                    char c=(char)y;
                    System.out.print(c+" ");
                }
                System.out.println();
            }
            
        }
    }
    
}
