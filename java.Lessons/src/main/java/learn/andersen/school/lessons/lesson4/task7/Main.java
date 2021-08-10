package learn.andersen.school.lessons.lesson4.task7;

public class Main {
    public static void main(String[]args){

    Park.Attraction[] attractions = {
            new Park.Attraction("Чертово колесо", "", "круглосуточно", 200.0),
            new Park.Attraction("Паровозик", "", "10:00 - 18:00", 150.0),
            new Park.Attraction("Американские горки", "", "9:00 - 15:00", 400.0),
    };

    Park park = new Park("Амазония", "Чебоксары", attractions);
    System.out.println(park);

}
}

