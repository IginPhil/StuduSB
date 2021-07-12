
import java.util.Scanner;

public class Main {

  public static final int BOXESINCONTAINER = 27;
  public static final int CONTANIERINTRUCK = 12;

  public static void main(String[] args) {
    System.out.println("Введите количество коробок: ");
    Scanner scanner = new Scanner(System.in);
    String boxes = scanner.nextLine();
    int box = Integer.parseInt(boxes);
    int container = 1;
    int truck = 1;

    System.out.println("Грузовик: " + truck);
    System.out.println("\t" + "Контейнер: " + container);
    if (!(box == 0) && box > 0) {

      for (int i = 1; i <= box; i++) {
        System.out.println("\t\tЯщик: " + i);
        if (i % (BOXESINCONTAINER * CONTANIERINTRUCK) == 0) {
          truck = truck + 1;
          System.out.println("Грузовик: " + truck);
        }
        if (i % BOXESINCONTAINER == 0) {
          container = container + 1;
          System.out.println("\tКонтейнер: " + container);
        }
      }
      System.out.println(
          "Необходимо:\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");
    } else {
      System.out.println("Ящиков нет");
    }
  }
}
