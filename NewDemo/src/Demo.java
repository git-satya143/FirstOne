class Table{
    public synchronized void printTable(int n)
    {
        for (int i=0; i<=10;i++)
        {
            System.out.println(i*n);
        }
    }
}
class thread1 extends Thread{

    Table t;
    thread1(Table t)
    {
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class thread2 extends Thread{

    Table tt = new Table();

    public void run(){
        tt.printTable(7);
    }
}


public class Demo {

    public static void main(String[] args) {

        Table obj = new Table();
        thread1 t1= new thread1(obj);
        t1.start();
        thread2 t2= new thread2();
        t2.start();

    }


}

