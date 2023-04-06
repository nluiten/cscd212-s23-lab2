package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionModelScreenSizeComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        if(tv1 == null || tv2 == null) {
            throw new IllegalArgumentException("A tv is null");
        }

        if(tv1.getModel().compareTo(tv2.getModel()) == 0) {
            return Integer.compare(tv1.getScreenSize(), tv2.getScreenSize());
        }
        return tv1.getModel().compareTo(tv2.getModel());
    }
}
