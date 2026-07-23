class Generic{
public static void main(String[] args) {
    Sample<Float> obj=new Sample();
    obj.add(75.40f, 50.100f);

    Multi<Integer,String,Long> multiobj= new Multi();
    multiobj.data(5000, "Hii...", 232026l);
}
}

class Sample<type>{

    public void add(type a,type b){
        System.out.println(a);
        System.out.println(b);
    }
}

class Multi<X,Y,Z>{

    public void data(X l,Y m,Z n){
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
    }
}