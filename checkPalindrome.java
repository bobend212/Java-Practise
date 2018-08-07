boolean checkPalindrome(String inputString) {
    
    int len = inputString.length();
    char[] array = inputString.toCharArray();

    ArrayList<Character> list = new ArrayList<Character>();
    ArrayList<Character> list2 = new ArrayList<Character>(); 

    for (int j = 0; j < len; j++) {
      list2.add(array[j]);
    }

    for (int i = len-1; i >= 0; i--) {
      list.add(array[i]);
    }

    if (list.equals(list2)) {
      return true;
    }
    else {
      return false;    
    }
}
