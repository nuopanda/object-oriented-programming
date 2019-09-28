package edu.neu.ccs.cs5004.lab6.problem3;

/**
 * Created by Nuozhou Wang on 03/22/19.
 */
public abstract class ASet<X> implements Set<X> {

  @Override
  public Set<X> add(X element) {
    return new Cons(element, this);
  }
}
