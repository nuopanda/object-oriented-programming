package edu.neu.ccs.cs5004.lab6.problem3;

/**
 * Created by Nuozhou Wang on 03/22/19.
 */
public class Cons<X> extends ASet<X> {

  private X first;
  private Set<X> rest;

  public Cons(X first, Set<X> rest) {
    this.first = first;
    this.rest = rest;
  }

  @Override
  public Integer size() {
    return 1 + getRest().size();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Boolean contains(X element) {
    if (this.isEmpty() || (!this.getFirst().equals(element) && this.getRest() == null)) {
      return false;
    } else if (this.getFirst().equals(element)) {
      return true;
    } else {
      return ((Cons) this.getRest()).contains(element);
    }
  }

  @Override
  public Set<X> remove(X element) {
    if (this.getFirst().equals(element)) {
      return this.getRest();
    }
    return new Cons(this.getFirst(), this.getRest().remove(element));
  }

  public X getFirst() {
    return first;
  }

  public Set<X> getRest() {
    return getRest();
  }


}
