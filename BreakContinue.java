public class BreakContinue {
    public static void main(String[] args) {
    //     for(int i=1;i<=10;i++){
    //         int reminder=i%2;
    //         if(reminder==0)
    //             continue;

    //         System.out.println(i); 
    //     }
    // }
    /*

    --> print multiples of 4 and skip others
    1   if(1*4==1) 4==1 -->skip
    2   if(2*4==1) 8==1 -->skip
    3   if(3*4==1) 12==1 -->skip
    4   if(4*4==1) 16==1 --> print
    5 -->skip
    6 -->skip
    7 -->skip
    8 -->print
    9 -->skip
    10 -->skip
    
    */
    
    // for(int i=-5; i<=10;i++){
    //     int reminder=i%4;
    //     if(reminder==0)
    //         break;      
        

    //     System.out.println(i);
    // }
        /*
        -3 --> -3 OUT
        -2 --> -2 OUT
        -1 --> -1 OUT
        0  -->  0 OUT
        1  -->  1 OUT
        2  -->  2 OUT
        3  -->  3 OUT
        4  -->  0 OUT IN
        5  -->  1 OUT
        7  -->  3 OUT
        8  -->  0 OUT  IN
        9  -->  1 OUT
        10 -->  2 OUT
        */

        for(int i=1;i<=7;i++){
            int even=i%2;
            if(even==0)
                continue;
            if(i%5==0)
                break;
              
                  System.out.println(i);
        }



}
}
