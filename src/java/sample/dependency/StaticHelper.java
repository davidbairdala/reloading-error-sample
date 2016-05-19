package sample.dependency;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StaticHelper {

    public static int helpClosure(List<String> list) {
        System.out.println("Here in the lambda version");
        AtomicInteger count = new AtomicInteger(0);
        list.forEach( s -> count.incrementAndGet() );
        return count.get();
    }

    public static int helpNonClosure(List<String> list) {
        System.out.println("Here in the for loop version");
        int count = 0;
        for (String s : list) {
            count++;
        }
        return count;
    }


}
