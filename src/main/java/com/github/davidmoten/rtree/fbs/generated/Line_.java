// automatically generated, do not modify

package com.github.davidmoten.rtree.fbs.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Line_ extends Struct {
  public Line_ __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public double minX() { return bb.getDouble(bb_pos + 0); }
  public double minY() { return bb.getDouble(bb_pos + 4); }
  public double maxX() { return bb.getDouble(bb_pos + 8); }
  public double maxY() { return bb.getDouble(bb_pos + 12); }

  public static int createLine_(FlatBufferBuilder builder, double minX, double minY, double maxX, double maxY) {
    builder.prep(4, 16);
    builder.putDouble(maxY);
    builder.putDouble(maxX);
    builder.putDouble(minY);
    builder.putDouble(minX);
    return builder.offset();
  }
};

