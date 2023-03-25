public class CuncarencyA {
    public static void main(String[] args) {
        System.out.println("Hello? i`am a "+Thread.currentThread().getName());

        C_thread c1=new C_thread();
        Thread cTr=new Thread(c1);




        System.out.println("By-by!  i`am from a "+Thread.currentThread().getName());
    }
class C_thread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i+" thread: "+Thread.currentThread().getName());
        }
        System.out.println("GoodBy from "+Thread.currentThread().getName());
    }
}
}
