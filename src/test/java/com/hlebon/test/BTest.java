package com.hlebon.test;

import org.junit.jupiter.api.Test;

public class BTest {
  private final B printer = new B();

  @Test
  void example1() {
    printer.drawRectangle('L', 1, 1, 4, 4);
    printer.drawRectangle('R', 6, 1, 8, 3);
    printer.printCanvas();

    printer.dragAndDrop(2, 3, 5, 3);
    printer.printCanvas();

    printer.drawRectangle('#', 3, 3, 9, 4);
    printer.eraseErea(6, 2, 6, 4);
    printer.printCanvas();

    printer.dragAndDrop(7, 2, 7, 4);
    printer.printCanvas();

    printer.bringToFront(6, 3);
    printer.printCanvas();
  }
}
