package cscd212classes;

public class Television {
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) {
        if(make == null || make.isEmpty() || model == null || model.isEmpty() || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Television is not valid");
        }

        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;

        if(this.resolution == 2160) {
            this.fourK = true;
        }
    }

    public Television(final String model, final boolean smart, final int screenSize, final int resolution, final String make, boolean fourK) {

        new Television(make, model, smart, screenSize, resolution);
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
            resolution = "4K ";
        }
        return getMake() + "-" + getModel() + ", " + getScreenSize() + "inch " + smart + "tv with " + resolution + " resolution";
    }
}
