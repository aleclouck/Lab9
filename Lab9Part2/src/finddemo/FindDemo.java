package finddemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UnknownFormatConversionException;

public class FindDemo {

  public static void main(final String[] args) {

    try {
      FindDemo.bcImpossibleCast();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }
    
    try {
      FindDemo.bcImpossibleDowncast();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    FindDemo.bcImpossibleInstanceOf();
  
    try {
      FindDemo.bcImpossibleDowncastOfArray();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    FindDemo.dmiBigDecimalConstructedFromDouble();
   
    FindDemo.esComparingStringsWithEq();
 
    try {
      FindDemo.vaFormatStringIllegal();
    } catch (final UnknownFormatConversionException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }
   
    FindDemo.rvReturnValueIgnored();
  
    try {
      FindDemo.npAlwaysNull();
    } catch (final NullPointerException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    FindDemo.qabQuestionableBooleanAssignment();
  
  }

  private static void bcImpossibleCast() {
    final Object doubleValue = Double.valueOf(1.0);
    final Double value = (Double) doubleValue;
    System.out.println("   - " + value);
  }

  private static void bcImpossibleDowncast() {
    final SecurityException exception = new SecurityException("abc");
    final SecurityException value = (SecurityException) exception;
    System.out.println("   - " + value.getMessage());
  }

  private static void bcImpossibleInstanceOf() {
    final Object value = 1.0;
    System.out.println("   - " + (value instanceof Double));
  }

  private static void bcImpossibleDowncastOfArray() {
    final Collection<String> stringVector = new ArrayList<String>();
    stringVector.add("abc");
    stringVector.add("xyz");
    final String[] stringArray = stringVector.toArray(new String[stringVector.size()]);
    System.out.println("   - " + stringArray.length);
  }

  private static void dmiBigDecimalConstructedFromDouble() {
    final BigDecimal bigDecimal = new BigDecimal(3.0);
    System.out.println("   - " + bigDecimal.toString());
  }

  private static void esComparingStringsWithEq() {
    final StringBuilder sb1 = new StringBuilder("1234");
    final StringBuilder sb2 = new StringBuilder("1234");
    final String string1 = sb1.toString();
    final String string2 = sb2.toString();
    System.out.println("   - " + (string1.equals(string2)));
  }

  private static void vaFormatStringIllegal() {
    System.out.println(String.format("   - %s > %s", "10", "9"));
  }

  private static void rvReturnValueIgnored() {
    final BigDecimal bigDecimal = BigDecimal.ONE;
    bigDecimal.add(BigDecimal.ONE);
    System.out.println(String.format("   - " + bigDecimal));
  }

  private static void npAlwaysNull() {
    final String value = "";
    if (null != value & value.length() > 2) {
      System.out.println(String.format("   - " + value));
    } else {
      System.out.println(String.format("   - value is invalid"));
    }
  }

  private static void qabQuestionableBooleanAssignment() {
    boolean value = false;
    if (value == true) {
      System.out.println(String.format("   - value is true"));
    } else {
      System.out.println(String.format("   - value is false"));
    }
  }

}
