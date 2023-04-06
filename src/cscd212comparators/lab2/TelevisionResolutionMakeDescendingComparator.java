package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator implements Comparator<Television> {
    @Override
    public int compare(Television o1, Television o2) {
        if(o1 == null || o2 == null) {
            throw new IllegalArgumentException("A tv is null");
        }

        if(o1.getResolution() == o2.getResolution()) {
            return o1.getMake().compareTo(o2.getMake());
        }
        return Integer.compare(o1.getResolution(), o2.getResolution());
    }
}
