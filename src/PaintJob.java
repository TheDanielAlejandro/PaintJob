public class PaintJob {

    public static int getBucketCount(double width, double heigth, double areaPerBucket, int extraBuckets){                  // . Creating the first method that will be used only if we pass 4 parameters

        if(width <= 0 || heigth <= 0 || areaPerBucket <= 0 || extraBuckets < 0){                                            // . IF-statement to check if the fisrt 3 values are smaller or equal to 0 (because if any of this values are less than 0 the metbod can't work) instead the last value can be 0 , Bob might not have any buckets at home.

            return -1;

        }else{

            double wallArea = width * heigth;                                                                               // . Calculating the area of the wall
            int numberOfBuckets = (int)Math.ceil(wallArea / areaPerBucket);                                                 // . Using the ceil method to retrieve the number of buckets and convert the datatype from double to int with the cast (if the result was 10,23 with ceil will turn to 11).
            int total = numberOfBuckets - extraBuckets;                                                                     // . Calculating the total

            return total;                                                                                                   // . Returning the total

        }


    }

    public static int getBucketCount(double width, double heigth, double areaPerBucket){                                    // . Using the overload to write the same method but with different number of parameters, no "extraBucket".

        if(width <= 0 || heigth <= 0 || areaPerBucket <= 0){                                                                // . if statement to check if values are acceptable.

            return -1;

        }else{

            double wallArea = width * heigth;
            int numberOfBuckets = (int)Math.ceil(wallArea / areaPerBucket);
            return numberOfBuckets;                                                                                         // . The same operations from the previous method, but leaving out the extraBucket

        }
    }

    public static int getBucketCount(double area, double areaPerBucket){                                                    // . Last overloaded method but with only 2 parameters (in case we know just the area of the wall and the areaPerBucket)

        if(area <= 0 || areaPerBucket <= 0){                                                                                // . IF-statement to check the values are acceptable.

            return -1;

        }else{

            int numberOfBuckets = (int)Math.ceil(area / areaPerBucket);                                                     // . The only operation to be made with the 2 parameters.
            return numberOfBuckets;

        }
    }


}
