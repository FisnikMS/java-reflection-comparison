package com.fk.model;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ComparisonWrapper {
  private Object model;

  public ComparisonWrapper(Object model) {
    this.model = model;
  }

  public Object getModel() {
    return model;
  }

  public HashMap<String, Difference> compare(Object m)
      throws InvocationTargetException, IllegalAccessException {
    ObjectField fw = new ObjectField();
    HashMap<String, Difference> result = fw.evaluate(model, m);
    return result;
  }

}
