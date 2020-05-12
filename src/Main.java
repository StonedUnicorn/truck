import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double truck = 1;
        double container = 1;
        double box = 1;
        int t = 0;
        int c = 0;
        int b = 0;

        System.out.println("Ведите количество необходимой помощи. (измеряется в ящиках)");
        Scanner scan = new Scanner(System.in);
        box = scan.nextInt();

        int iBox = (int)box;
        container = Math.ceil(box / 27);
        int iCont = (int)container;
        truck = Math.ceil(container / 12);
        int iTruck = (int)truck;
        System.out.println("Потребуется " + iTruck + " грузовиков" + "\n" +
        "Потребуется " + iCont + " контейнеров" + "\n" +
        "для перевозки " + iBox + " ящиков");

        while (t < iTruck){
            t++;
            System.out.println("\nГрузовик " + t);
            int maxCont = 12;
            while (c < iCont && maxCont > 0){
                c++;
                maxCont--;
                System.out.println(" Контейнер " + c);
                int maxBox = 27;
                while (b < iBox && maxBox > 0){
                    b++;
                    maxBox--;
                    System.out.println("  Ящик " + b);
                }
            }
        }
    }
}
