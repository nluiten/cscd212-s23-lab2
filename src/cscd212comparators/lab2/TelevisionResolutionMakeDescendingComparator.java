package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        if(tv1 == null || tv2 == null) {
            throw new IllegalArgumentException("A tv is null");
        }

        if(tv1.getResolution() == tv2.getResolution()) {
            return tv1.getMake().compareTo(tv2.getMake());
        }
        return Integer.compare(tv1.getResolution(), tv2.getResolution());
    }
}
