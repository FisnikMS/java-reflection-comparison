
package com.fk.model;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.fk.utils.Helper;

public class MapField<K, V> implements FieldStructureWrapper<Map<String, Difference>> {

  public HashMap<String, Difference> evaluate(Map<String, Difference> value, Map<String, Difference> valToCompare)
      throws InvocationTargetException, IllegalAccessException {
    HashMap<String, Difference> result = new HashMap<>();
    value.keySet().stream().forEach(key -> {
      Object oldValue = value.get(key);
      Object newValue = valToCompare.get(key);
      if (!valToCompare.containsKey(key)) {
        result.put(key, new Difference(Evaluation.REMOVE,
            oldValue,
            newValue));
      } else if (!value.equals(valToCompare)) {
        FieldTypeWrapper<Object> fw = (FieldTypeWrapper<Object>) new FieldTypeWrapperFactory()
            .getFieldWrapper(oldValue.getClass());
        try {
          if (fw == null) {
            FieldStructureWrapper<Object> fsw = (FieldStructureWrapper<Object>) new FieldStructureWrapperFactory()
                .getFieldWrapper(oldValue.getClass());
            result.putAll(fsw.evaluate(oldValue, newValue));
          } else {
            result.put(key, fw.evaluate(oldValue, newValue).addEvaluation(Evaluation.UPDATE));
          }
        } catch (Exception e) {
          // log..
        }
      }
    });

    return result;
  }
}
