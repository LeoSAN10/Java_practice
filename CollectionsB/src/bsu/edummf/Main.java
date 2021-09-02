package bsu.edummf;

import bsu.edummf.filler.ListFiller;
import bsu.edummf.reader.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        double[] numbers = FileReader.readNumbers("nums.txt");
        List<Double> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        ListFiller.fillListWithNumbersDividedByNegativeNumber(list1, list2, numbers);
        Collections.sort(list1);
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
