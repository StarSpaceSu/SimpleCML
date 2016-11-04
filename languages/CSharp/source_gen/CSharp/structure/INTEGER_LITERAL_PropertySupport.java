package CSharp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;

public class INTEGER_LITERAL_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    String testValue = null;
    if (value == null) {
      testValue = "";
    } else {
      testValue = value;
    }
    return testValue.matches("([0-9])+((([lL])?[uU]|([uU])?[lL]))?");
  }
}