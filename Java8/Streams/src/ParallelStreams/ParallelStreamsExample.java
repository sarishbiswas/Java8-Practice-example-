package ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {
    public static long checkPerformance(Supplier<Integer> supplier,int noOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i=0;i<noOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,1000000)
                .sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,1000000)
                .parallel().sum();
    }
    public static void main(String[] args) {
        System.out.println("Sequential : "+checkPerformance(ParallelStreamsExample::sumSequentialStream,20));
        System.out.println("Parallel : "+checkPerformance(ParallelStreamsExample::sumParallelStream,20));
    }
}
