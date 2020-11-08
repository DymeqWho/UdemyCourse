package challenge28;

public class Challenge28 {
    public static void main(String[] args) {
        System.out.println("getBucketCount() = " + getBucketCount(0.75, 0.75, 0.5, 0));
        System.out.println("getBucketCount() Area = " + getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            double howMuchCanPaintWithOwnPaint = extraBuckets * areaPerBucket;
            double howMuchLeft = area - howMuchCanPaintWithOwnPaint;
            double howManyNeeded = (howMuchLeft / areaPerBucket) + 0.5;
            System.out.println("howManyNeeded = " + howManyNeeded);
            return (int) Math.round(howManyNeeded);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int extraBuckets = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            double howMuchCanPaintWithOwnPaint = extraBuckets * areaPerBucket;
            double howMuchLeft = area - howMuchCanPaintWithOwnPaint;
            double howManyNeeded = (howMuchLeft / areaPerBucket) + 0.5;
            return (int) Math.round(howManyNeeded);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double howManyNeeded = (area / areaPerBucket) + 0.5;
            return (int) Math.round(howManyNeeded);
        }
    }
}
