package kata2;
import java.util.HashMap;
import java.util.Map;

//version 3.0
public class Kata2 {
    public static void main(String[] args) {
        
        //Integer[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        String [] data = {"Ana", "Juan", "Juan","Juan" , "Ana", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        //cambiamos el for por un for del tipo (fore+Tab) con operador ternario
        

        //atajazo 2 fore + TAB
        
        for (String key : histogr.keySet()) {
            System.out.println(key + "-->" + histogr.get(key));
        }
    }
}
