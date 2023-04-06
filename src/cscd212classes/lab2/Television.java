package cscd212classes.lab2;

import java.util.Objects;

public class Television implements Comparable<Television>{
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) {
        if(make == null || make.isEmpty() || model == null || model.isEmpty() || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Invalid parameter in constructor");
        }

        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;

        if(this.resolution == 2160) {
            this.fourK = true;
        }
        else {
            this.fourK = false;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        String smart = "";
        String resolution = Integer.toString(getResolution()) + " ";
        if(this.smart == true) {
            smart = "smart ";
        }
        if(this.getResolution() == 2160) {
            resolution = "4K ";
        }
        return getMake() + "-" + getModel() + ", " + getScreenSize() + " inch " + smart + "tv with " + resolution + "resolution";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return fourK == that.fourK && getResolution() == that.getResolution() && getScreenSize() == that.getScreenSize() && smart == that.smart && Objects.equals(getMake(), that.getMake()) && Objects.equals(getModel(), that.getModel());
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(fourK) + make.hashCode() + model.hashCode() + resolution + screenSize + Boolean.hashCode(smart) - 36;
    }

    @Override
    public int compareTo(Television o) {
        if(o == null) {
            throw new IllegalArgumentException("null parameter in the compareTo method");
        }

        if(this.getMake().compareTo(o.getMake()) == 0) {
            if(this.getModel().compareTo(o.getModel()) == 0) {
                return this.getScreenSize() - o.getScreenSize();
            }
            return this.getModel().compareTo(o.getModel());
        }
        return this.getMake().compareTo(o.getMake());
    }
}


