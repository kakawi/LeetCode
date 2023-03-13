package com.leetcode.stack.easy;

public class BackspaceStringCompare_844_Without_Stack implements BackspaceStringCompare_844 {

  @Override
  public boolean backspaceCompare(String s, String t) {
    int i = s.length() - 1;
    int j = t.length() - 1;
    int skipS = 0;
    int skipT = 0;
    while (i >= 0 || j >= 0) {
      while (i >= 0) {
        if (s.charAt(i) == '#') {
          skipS++;
          i--;
        } else if (skipS > 0) {
          skipS--;
          i--;
        } else {
          break;
        }
      }
      while (j >= 0) {
        if (t.charAt(j) == '#') {
          skipT++;
          j--;
        } else if (skipT > 0) {
          skipT--;
          j--;
        } else {
          break;
        }
      }

      // we did not achieve the end, let's compare characters
      if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
        return false;
      }

      // some string already achieved the end
      if ((i >= 0) != (j >= 0)) {
        return false;
      }

      i--;
      j--;
    }
    return true;
  }
}
