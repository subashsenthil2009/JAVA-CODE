public class SubSequenceCheck {
    public static void main(String[] args) {
        String name="dharaneeshh",target="aaeesh";
        int ind=0;

        for(int i=0;i<name.length();i++){

            if(ind<target.length() && name.charAt(i)==target.charAt(ind))
                ind++;       
        }
            if(ind==target.length()){
                System.out.println("Subsequence is exist");
            }
            else
                System.out.println("Subsequence is doesn't exist ");


        }
    }
    

