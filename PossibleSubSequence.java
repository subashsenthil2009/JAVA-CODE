public class PossibleSubSequence {
    public static void main(String[] args) {
        
        String name="abcd";
        int pos=(int)Math.pow(2, name.length());
        int len=name.length();

    for(int i=0;i<pos;i++){
        int n=i;
        
        StringBuilder sb=new StringBuilder();

        while(n>0){ 
            sb.append(n%2);
            n=n/2;
        }

        sb.reverse();

        StringBuilder newString= new StringBuilder();
        for(int j=0;j<newString.length()-sb.length();j++){
            newString.append("0");
        }
            newString.append(sb);

            System.out.print(newString.toString()+"--> ");

        for(int j=0;j<newString.length();j++){
            if(newString.charAt(j)=='1')
                System.out.print(name.charAt(j));
        }
        System.out.println();
        
    }
    }
    
}
