class A{

    int a;
    String s;
    A(String b){
        a = 17;
        s = b;
        System.out.println(a+s);
    }
    A(A ref){
        a= ref.a;
        s= ref.s;
        System.out.println(a+s);
    }
}

public class CopyConstrt {
    public  static void main(String[] args){
        A o= new A("hello");
        A o2 = new A(o);
    }

}
