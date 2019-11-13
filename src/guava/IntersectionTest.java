package guava;

import static com.google.common.collect.Sets.intersection;

import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class IntersectionTest {
    public static void main(String[] args) {
        Set<String> sourceList = Sets.newHashSet("a", "b", "1", "c", "2", "d");
        Set<String> targetList = Sets.newHashSet("1", "2", "3");

        System.out.println(intersection(sourceList, targetList));
    }
}
