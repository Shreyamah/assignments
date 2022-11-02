
import java.util.*;
import java.util.function.BiConsumer;
public class Demo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int key = 2;
        cal(nums, key);

    }

    public static void cal(int[] nums, int key, BiConsumer<Integer, Integer> cosumer) {
        for (int i : nums) {
            consumer.acept(i,key);
        }
    }
}


