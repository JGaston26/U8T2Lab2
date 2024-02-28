import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[][] words = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "map"}, {"good", "low", "bow", "mom"}};
        ArrayList<String> returnedList = Algorithm2DArrays.findStringsOfLength(words, 3);
        System.out.println(returnedList);
        ArrayList<String> returnedList2 = Algorithm2DArrays.findStringsOfLength(words, 4);
        System.out.println(returnedList2);
        ArrayList<String> returnedList3 = Algorithm2DArrays.findStringsOfLength(words, 5);
        System.out.println(returnedList3);
        ArrayList<String> returnedList4 = Algorithm2DArrays.findStringsOfLength(words, 6);
        System.out.println(returnedList4);
        System.out.println();
        String[][] words2 = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}};
        returnedList = Algorithm2DArrays.findStringsOfLength(words2, 1);
        System.out.println(returnedList);
        returnedList2 = Algorithm2DArrays.findStringsOfLength(words2, 2);
        System.out.println(returnedList2);

    }
}
