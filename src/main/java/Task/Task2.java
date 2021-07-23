package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * There is a Cat class with a String variable name, int variable age.
 * <p>
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 * <p>
 * Get a Set of all cats from the Map and display it on the screen.
 * <p>
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Map<Integer, Cat> cat = task2.createMap();
        Set<Cat> setCat = task2.convertMapToSet(cat);
        task2.printCats(setCat);
    }

    public Map<Integer, Cat> createMap() {
        //write your code here
        Map<Integer, Cat> cat = new HashMap<>();
        cat.put(1, new Cat("Một", 2));
        cat.put(2, new Cat("Hai", 4));
        cat.put(3, new Cat("Ba", 6));
        cat.put(4, new Cat("Bốn", 8));
        cat.put(5, new Cat("Năm", 10));
        cat.put(6, new Cat("Sáu", 9));
        cat.put(7, new Cat("Bảy", 7));
        cat.put(8, new Cat("Tám", 5));
        cat.put(9, new Cat("Chín", 3));
        cat.put(10, new Cat("Mười", 1));
        return cat;
    }

    public Set<Cat> convertMapToSet(Map<Integer, Cat> map) {
        Set<Cat> setCat = new HashSet<>();
        for (Map.Entry<Integer, Cat> cat : map.entrySet()) {
            setCat.add(cat.getValue());
        }
        return setCat;
    }

    public void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println("Hoàng thượng tên " + c.getName() + " năm nay: " + c.getAge() + " tuổi");
        }
    }

    public class Cat {
        private String name;
        private int age;


        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}