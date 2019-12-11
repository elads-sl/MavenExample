package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class AdditionDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    return i + 3;
  }

  public long doNotDouble(int i) { return i; }
}

