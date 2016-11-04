package CSharp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;

public class CHARACTER_LITERAL_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    String testValue = null;
    if (value == null) {
      testValue = "";
    } else {
      testValue = value;
    }
    return testValue.matches("\\\\'([^'\\\\\\r\\n]|(((\\\\\\\\\\\\'|\\\\\\\\\"|\\\\\\\\\\\\\\\\|\\\\\\\\0|\\\\\\\\a|\\\\\\\\b|\\\\\\\\f|\\\\\\\\n|\\\\\\\\r|\\\\\\\\t|\\\\\\\\v))|(((\\\\\\\\x([0-9]|[A-F]|[a-f]))|(\\\\\\\\x([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f]))|(\\\\\\\\x([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f]))|(\\\\\\\\x([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f]))))|(((\\\\\\\\u([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f]))|(\\\\\\\\U([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f])([0-9]|[A-F]|[a-f]))))))\\\\'");
  }
}
