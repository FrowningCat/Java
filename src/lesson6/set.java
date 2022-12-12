package lesson6;

import java.util.Map;
import java.util.TreeMap;

public class set {
    //Реализовать множество (set) с помощью TreeMap.
    private Map<Integer, Object> mapInt = new TreeMap<>();

    private static final Object SOMETHING = new Object();

    //Создать метод add, добавляющий элемент в ваше множество.
    public void methodAdd(int x){ mapInt.put(x, SOMETHING); }

    public String methodRead(){ return mapInt.keySet().toString(); }
}
