package edu.neu.ccs.cs5004.lab6.problem3;

/**
 * Created by Nuozhou Wang on 03/22/19.
 */
public class Empty<X> extends ASet<X> {

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public Boolean contains(X element) {
    return false;
  }

  @Override
  public Set<X> remove(X element) {
    throw new IllegalArgumentException("no element in empty set");
  }
}
