package com.fk;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.fk.model.ComparisonWrapper;
import com.fk.model.Difference;
import com.fk.test.Car;
import com.fk.test.User;
import com.fk.test.Color;

public class Comparison {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    HashMap<String, Object> test = new HashMap<String, Object>();
    test.put("key1", "key");
    test.put("key2", "test213");
    test.put("key5", 19);
    HashMap<String, Object> test2 = new HashMap<String, Object>();
    test2.put("key1", "sjadn");
    test2.put("key4", "sjadn");
    test2.put("key5", 2);

    ArrayList<String> countries1 = new ArrayList<String>();
    countries1.addAll(Arrays.asList("EN", "DE"));

    ArrayList<String> countries2 = new ArrayList<String>();
    countries2.addAll(Arrays.asList("EN", "DE", "JP", "GER"));

    ArrayList<String> carHolders1 = new ArrayList<String>();
    ArrayList<String> carHolders2 = new ArrayList<String>();

    carHolders1.add("fisnik");
    carHolders2.addAll(Arrays.asList("fisnik", "spartakus"));

    Car car1 = new Car("bmw", 2010, carHolders1, new Color("red"));
    Car car2 = new Car("bmw", 2010, carHolders2, new Color("blue"));

    User user = new User("fisnik", "kickmich", 24, test, countries1, car1);
    User user2 = new User("fisnik", "knicklicht", 28, test2, countries2, car2);

    HashMap<String, Car> carMap1 = new HashMap<>();
    HashMap<String, Car> carMap2 = new HashMap<>();

    carMap1.put("car23", new Car("tesla", 2022, carHolders1, new Color("red")));
    carMap2.put("car23", new Car("tesla", 2022, carHolders2, new Color("blue")));

    user.carMap = carMap1;
    user2.carMap = carMap2;

    ComparisonWrapper c = new ComparisonWrapper(user);
    HashMap<String, Difference> res = c.compare(user2);
    System.out.println(Arrays.toString(res.entrySet().toArray()));

  }
}
