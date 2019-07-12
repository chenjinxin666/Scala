package main.java.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 在scala中对应Comparable这个接口的是Ordered这个特质
 *          对应Compaerator这个接口的是Ordering这个特质
 */
public class SortTest {
    public static void main(String[] args) {
        Gril g1 = new Gril();
        g1.setName("苍老师");
        g1.setFaceValue(90);

        Gril g2 = new Gril();
        g2.setName("波多老师");
        g2.setFaceValue(95);

        Gril g3 = new Gril();
        g3.setName("吉泽老师");
        g3.setFaceValue(94);

        List<Gril> list = new ArrayList<Gril>();
        list.add(g1);
        list.add(g2);
        list.add(g3);

//        Collections.sort(list, new Comparator<Gril>() {
//            @Override
//            public int compare(Gril o1, Gril o2) {
//                return o2.getFaceValue() - o1.getFaceValue();
//            }
//        });
        Collections.sort(list);

        for (Gril g:list){
            System.out.println("name:"+g.getName()+", fv:"+g.getFaceValue());
        }

    }
}
