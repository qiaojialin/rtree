// automatically generated, do not modify

package com.github.davidmoten.rtree.fbs.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Circle_ extends Struct {
  public Circle_ __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public double x() { return bb.getDouble(bb_pos + 0); }
  public double y() { return bb.getDouble(bb_pos + 4); }
  public double radius() { return bb.getDouble(bb_pos + 8); }

  public static int createCircle_(FlatBufferBuilder builder, double x, double y, double radius) {
    builder.prep(4, 12);
    builder.putDouble(radius);
    builder.putDouble(y);
    builder.putDouble(x);
    return builder.offset();
  }
};

