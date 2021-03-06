package ru.arcticweb.reusing;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

class Value {
    int i;

    Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    private static final int VALUE_THREE = 39;

    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", valueOne=" + valueOne +
                ", i4=" + i4 +
                ", v1=" + v1 +
                ", v2=" + v2 +
                ", a=" + Arrays.toString(a) +
                ". INT_5="+INT_5 +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd");
        //! fd1.valueOne++;
        fd1.v2.i++;
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        //! fd1.v2 = new Value(0);
        //! fd1.VAL_3 = new Value(1);
        //! fd1.a = new int[3];
        print(fd1);
        print("Создаем FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);



    }
}
