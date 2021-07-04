package basics.arrayexceptions;

import basics.arrayexceptions.exceptions.*;
import basics.arrayexceptions.objects.IntegerArray;

public class Demo {
    public static void main(String[] args) {
        try {
            IntegerArray integerArray = new IntegerArray(10);
            integerArray.add(657);
            integerArray.add(234);
            integerArray.add(273);
            integerArray.deleteLast();
            integerArray.print();
            System.out.println(integerArray.get(1));
            integerArray.deleteAll();
            integerArray.print();
        } catch (ArrayOverflowException | IllegalSizeException | IllegalIndexException | WrongIndexException | EmptyArrayException e) {
            System.out.println(e.getMessage());
        }
    }
}
