import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
    public static void main(String args[]) {
        ArrayList<Vehicle> arrayList = new ArrayList<>();
        arrayList.add(new Vehicle("maruti", 2020));
        arrayList.add(new Vehicle("tata", 2023));
        arrayList.add(new Vehicle("hundai", 2021));
        arrayList.add(new Vehicle("polo", 1998));
        Collections.sort(arrayList, new BrandComparator());
        System.out.println("Sorting by brand name.");
        for (Vehicle v : arrayList) {
            System.out.println("Vehicle Brand: " + v.brand + ", Vehicle Make: " + v.makeYear);
        }
        System.out.println("Sorting by make year.");
        Collections.sort(arrayList, new MakeYearComparator());
        for (Vehicle v : arrayList) {
            System.out.println("Vehicle Brand: " + v.brand + ", Vehicle Make: " + v.makeYear);
        }
    }
}
