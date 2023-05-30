package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(8);
        nums.add(1);
        nums.add(7);
        nums.add(3);
        nums.add(5);
        nums.stream().filter(n->n%2==1).sorted().map(n->n*2).forEach(n->System.out.println(n));
        System.out.println("******************");
        int count = nums.parallelStream().reduce(0,(c, e)->c+e);
        System.out.println(count);
        System.out.println("******************");
        Stream<Integer> data = nums.stream().sorted();
        data.forEach(n->System.out.println(n));
    }
}
