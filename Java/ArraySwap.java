class ArraySwap {
  static void SwapObject(int x, int y)
  {
    int temp = x;
    x = y;
    y = temp;
    System.out.println("Value of x= " + x + "Value of y= " + y);
  }
  public static void main(String[] args)
  {
    int x = 23;
    int y = 45;
    
    SwapObject(x, y);
    }
}
