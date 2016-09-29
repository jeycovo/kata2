package kata2;
import java.util.HashMap;
import java.util.Map;

//version 2.0
public class Kata2 {
    public static void main(String[] args) {
        
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        
        //array asociativo histograma (clave entera, valor entero)
        Map<Integer,Integer> histogram = new HashMap<>();
        
        //cambiamos el for por un for del tipo (fore+Tab) con operador ternario
        
        //este tipo de bucle, guarda el valor de la iteracion n del array data 
        //en value
        
        for (int value : data) {
            
            //operador ternario (condicion) ? valor1:valor2; si la condicion es
            //true se cumple el valor 1 si es false el valor 2
            
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value)+1 : 1);
        }
        //atajazo 2 fore + TAB
        for (int key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
