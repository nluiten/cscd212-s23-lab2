package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionScreenSizeComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        if(tv1 == null || tv2 == null) {
            throw new IllegalArgumentException("null parameter in TelevisionScreenSizeComparator");
        }

        return tv1.getScreenSize() - tv2.getScreenSize();
    }
}
