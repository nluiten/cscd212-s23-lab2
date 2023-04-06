package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        if(tv1 == null || tv2 == null) {
            throw new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");
        }

        if(tv1.getResolution() == tv2.getResolution()) {
            return tv2.getMake().compareTo(tv1.getMake());
        }
        return tv2.getResolution() - tv1.getResolution();
    }
}
