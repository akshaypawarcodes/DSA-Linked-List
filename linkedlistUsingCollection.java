import java.util.LinkedList;

public class linkedlistUsingCollection {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("akshay");
        list.add("kumar");
        list.addFirst("i am");
        list.addLast("Bijnori");
        System.out.println(list);
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
