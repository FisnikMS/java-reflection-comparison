package com.fk.model;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.fk.utils.Helper;

public interface FieldTypeWrapper<T> extends FieldWrapper<T> {
  public Difference evaluate(T value, T valToCompare)
      throws InvocationTargetException, IllegalAccessException;

  default public HashMap<String, Difference> compare(Object entity, Object entityToCompare, Field field)
      throws InvocationTargetException, IllegalAccessException {
    return Helper.intoMap(field.getName(),
        evaluate(accessField(field, entity), accessField(field, entityToCompare)));
  }

}
