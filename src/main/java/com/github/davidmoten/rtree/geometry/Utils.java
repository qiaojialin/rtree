package com.github.davidmoten.rtree.geometry;

/**
 * Created by qiaojialin on 2017/10/8.
 */
public class Utils {
    public static int hash(Double d) {
        long l = Double.doubleToLongBits(d);
        return (int)(l ^ (l >>> 32));
    }
}
