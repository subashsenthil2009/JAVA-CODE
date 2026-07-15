public class DistanceMath {
    public static void main(String[] args) {
        int x1=3;
        int x2=5;
        int y1=10;
        int y2=20;

        // double xdiff=Math.pow(x2-x1, 2);
        // double ydiff=Math.pow(y2-y1, 2);

        // double d=Math.sqrt(xdiff+ydiff);
        double d=Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2),(1d/2));
        System.out.println(d);
    }
    
}
