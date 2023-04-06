package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionModelScreenSizeComparator implements Comparator<Television> {
    @Override
    public int compare(Television o1, Television o2) {
        if(o1 == null || o2 == null) {
            throw new IllegalArgumentException("A tv is null");
        }

        if(o1.getModel().compareTo(o2.getModel()) == 0) {
            return Integer.compare(o1.getScreenSize(), o2.getScreenSize());
        }
        return o1.getModel().compareTo(o2.getModel());
    }
}
