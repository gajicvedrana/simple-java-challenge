package com.sinch.challenge;

public class InventoryAnalyzerTest {

  private static final long[] INVENTORY = { 101, 102, 102, 103, 103, 103, 104, 104, 104, 104};
  private static final long EXPECTATION = 104;

  public static void main(String[] args) {
    try {
      InventoryAnalyzer underTest = new InventoryAnalyzer(INVENTORY);
      long result = underTest.findMostStockedProduct();

      if (EXPECTATION == result) {
        System.out.println("Correct result!");
      } else {
        System.out.println(
            "Expected: " + EXPECTATION + "\nBut was: " + result);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
