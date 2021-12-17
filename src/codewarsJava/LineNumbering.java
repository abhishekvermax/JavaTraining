package codewarsJava;
import java.util.*;

public class LineNumbering {
        public static List<String> number(List<String> lines) {
            ArrayList<String> concatItemArray = new ArrayList<>();

            for (int i =0; i<lines.size();i++){
                concatItemArray.add(1+i +": "+lines.get(i));
        }
            return concatItemArray;
    }

    public static void main(String [] args){
        List<String> x = Arrays.asList();
        for (String y: LineNumbering.number(x)){
            System.out.println(y);
        }
    }
}


