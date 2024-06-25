import java.util.*;
// import java.util.stream.Stream;
import java.util.function.Predicate;

public class Streamuse {
    public static void main(String[] args){
        List<Integer> nums =  Arrays.asList(4,5,8,7,9, 1, 2, 6, 10);

        // Predicate<Integer> predi = new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer n){
        //         if(n%2==1)
        //             return true;
        //         else
        //             return false;
        //     }
        // };

        // Predicate<Integer> predi = (Integer n) -> {
        //     return n%2==1;
        // };

        // Predicate<Integer> predi = (Integer n) -> n%2==1;

        Predicate<Integer> predi =  n -> n%2==1;

        int result = nums.stream()
        .filter(predi)
        .sorted()
        .map(n->n*2)
        .reduce(0, (c, e)->c+e);
        System.out.println(result);

        // .forEach(n-> System.out.println(n));

        // nums.stream()
        // .filter(n->n%2==1)
        // .sorted()
        // .map(n->n*2)
        // .forEach(n-> System.out.println(n));

        // Stream<Integer> data = nums.stream();

        // Stream<Integer> sortedData = data.sorted();

        // Stream<Integer> mappedData = data.map(n-> n*2);


        // mappedData.forEach(n-> System.out.println(n));
        
        // for(int n : nums){
        //     System.out.println("\n"+n*2);
        // }
        // long count = data.count();
        // System.out.println(count);
        // data.forEach(n-> System.out.println(n));
    }
}
