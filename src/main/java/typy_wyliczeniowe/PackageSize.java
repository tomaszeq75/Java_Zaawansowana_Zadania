package typy_wyliczeniowe;

public enum PackageSize {
    SMALL(5,10),
    MEDIUM(10,20),
    LARGE(20,30),
    UNKNOWN(0,0);

    private int minSize, maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int min, int max) {
        if (min > SMALL.minSize && max <= SMALL.maxSize) return PackageSize.SMALL;
        if (min > MEDIUM.minSize && max <= MEDIUM.maxSize) return PackageSize.MEDIUM;
        if (min > LARGE.minSize && max <= LARGE.maxSize) return PackageSize.MEDIUM;
        return PackageSize.UNKNOWN;
    }

    public static PackageSize getPackageSizeLoop(int min, int max) {
        for (PackageSize ps : PackageSize.values()) {
            if (ps.minSize <= min && ps.maxSize >= max) {
                return ps;
            }
        }
        return UNKNOWN;
    }
}
