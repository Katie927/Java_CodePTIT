package adu_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class J07004 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[1000];
        for (Integer i : l)
            a[i]++;
        for (int i = 0; i < 1000; i++)
            System.out.println(i + " " + a[i]);
    }
}
