package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class MultiplicationDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    return i * 5;
  }

  public long doFloat(int i) { return i / 2; }
}
