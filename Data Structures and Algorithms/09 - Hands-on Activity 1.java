import java.util.ArrayList;

public class AdjancencyList {

    public static void main(String[] args) {
        
        ArrayList <ArrayList> list = new ArrayList<>();
        
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int num;
        num = 7;
        
        for(int i = 0; i < num; i++ ){
        
            list.add(new ArrayList<>());
        }
        
        list.get(0).add('B');
        list.get(1).add('A');
        list.get(1).add('C');
        list.get(2).add('B');
        list.get(2).add('D');
        list.get(2).add('E');
        list.get(3).add('C');
        list.get(3).add('E');
        list.get(3).add('F');
        list.get(3).add('G');
        list.get(4).add('C');
        list.get(4).add('D');
        list.get(4).add('F');
        list.get(5).add('E');
        list.get(5).add('D');
        list.get(0).add('B');
        list.get(6).add('D');
        
        
        int v = 0;
        
        for(int i = 0; i < num; i++, v++){
        
            System.out.println(vertices[v] + ": " + list.get(i));
        }
    }
}
