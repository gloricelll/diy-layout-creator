package org.diylc.common;

public enum Display {

  NAME, VALUE, NONE, BOTH;

  @Override
  public String toString() {
    return name().substring(0, 1) + name().substring(1).toLowerCase();
  }
}
