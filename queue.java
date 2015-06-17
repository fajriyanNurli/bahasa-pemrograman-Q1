import java.util.Queue;
import java.util.LinkedList;

public class queue {
     public static void main(String args[]){
        Queue hewan=new LinkedList();

        //Ini Inputannya
        hewan.add("ayam");
        hewan.add("bebek");
        hewan.add("cicak");
        hewan.add("domba");
        hewan.add("elang");
        //Ini Outputnya
        hewan.poll();
        hewan.poll();
        hewan.poll();
        System.out.println("Hewan yang siap diambil : "+hewan.peek());
        System.out.println("Jumlah : "+hewan.size());
        System.out.println("Urutan Peletakan hewan : ");
        while(!hewan.isEmpty()){
        System.out.println();
        System.out.println(hewan.poll());
        }
    }
}
