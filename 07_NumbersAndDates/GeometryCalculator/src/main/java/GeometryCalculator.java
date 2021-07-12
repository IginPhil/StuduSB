public class GeometryCalculator {

  // метод должен использовать абсолютное значение radius
  public static double getCircleSquare(double radius) {
    return Math.PI * radius * radius;
  }

  // метод должен использовать абсолютное значение radius
  public static double getSphereVolume(double radius) {
    return Math.abs((4 * Math.PI * Math.pow(radius, 3)) / 3);
  }

  public static boolean isTrianglePossible(double a, double b, double c) {
    if (a < b + c && b < a + c && c < a + b) {
      System.out.println("Можно построить треугольник");
      return true;
    } else {
      System.out.println("-1.0");
      return false;
    }
  }

  // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
  // методом isTrianglePossible, если невозможен вернуть -1.0

  public static double getTriangleSquare(double a, double b, double c) {
    double p = (a + b + c) / 2;
    double p1 = (p - a);
    double p2 = (p - b);
    double p3 = (p - c);
    double pp = p * p1 * p2 * p3;
    return Math.sqrt(pp);
  }
}