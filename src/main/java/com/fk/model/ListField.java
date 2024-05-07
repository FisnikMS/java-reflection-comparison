package com.fk.model;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;


public class ListField implements FieldStructureWrapper<List<Object>> {

  @Override
  public HashMap<String, Difference> evaluate(List<Object> value, List<Object> valToCompare)
      throws InvocationTargetException, IllegalAccessException {

    HashMap<String, Difference> result = new HashMap<>();
    int index = 0;
    for (Object v : value) {
      if (!valToCompare.contains(v)) {
        result.put(String.valueOf(index),
            new Difference(Evaluation.REMOVE, v, null));
      }
      index++;
    }

    index = 0;
    for (Object v : valToCompare) {
      if (!value.contains(v)) {
        result.put(String.valueOf(index),
            new Difference(Evaluation.ADD, null, v));
      }
      index++;
    }
    return result;
  }

}
