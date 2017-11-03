package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es",5);
        histogram.increment("ull.es",8);
        histogram.increment("hotmail.com",2);
        histogram.increment("google.com",10);
        new HistogramDisplay(histogram).execute();
        
    }
    
}
