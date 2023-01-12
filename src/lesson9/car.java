package lesson9;

public class car {
    String color;
    int year;
    String manufacturer;
    String model;
    boolean isElectrical;

    int created = 0;
    static int wasCreated = 0;

    public car(){
        created++;
        wasCreated++;
        System.out.println("created = " + created);

    }


    public car(String color, int year, String manufacturer, String model, boolean isElectrical) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isElectrical = isElectrical;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public car(String color){
        this.color = color;

    }

    public car(String manufacturer, int year){
        this.manufacturer = manufacturer;
        this.year = year;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public void carIsReady() {
        System.out.println("I'm ready");
    }

    public  void printCarInfo(){
        System.out.println(this);
    }
    public static void classOccurrences() {
        System.out.println("wasCreated = " + wasCreated);
    }
    @Override
    public String toString() {
        return "car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", isElectrical=" + isElectrical +
                '}';
    }


}
