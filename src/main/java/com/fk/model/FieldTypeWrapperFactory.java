package com.fk.model;

import java.util.Collection;

public class FieldTypeWrapperFactory {
  public FieldWrapper<? extends Object> getFieldWrapper(Class<? extends Object> type) {

    if (String.class.isAssignableFrom(type)) {
      return new StringField();
    }

    else if (Number.class.isAssignableFrom(type)) {
      return new NumberField();
    }

    return null;
  }

}
