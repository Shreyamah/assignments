package oops5;

abstract class shapes {
  abstract void draw();
}

class line extends shapes {

  @Override
  public void draw() {

    System.out.println("drawing line...");
  }
}

class cube extends shapes {

  @Override
  public void draw() {

    System.out.println("drawing cube...");
  }
}

class rectangle extends shapes {

  @Override
  public void draw() {

    System.out.println("drawing recctangle...");
  }
}

class shape {
  public void main(String args[]) {

    cube c = new cube();
    c.draw();
    line l = new line();
    l.draw();

  }
}
