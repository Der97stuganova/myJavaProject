 package learn.andersen.school.lessons.lesson4.task7;

public class Park {

    private String name;
    private String city;
    private Attraction [] attractions;

    public Park(String name, String city, Attraction[] attractions) {
        this.name = name;
        this.city = city;
        this.attractions = attractions;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        String info = "Парк " +
                "\"" + name + "\"" +
                ", г. " + city +
                ", список атракционов: \n";
        StringBuilder attr = new StringBuilder();
        for(Attraction attraction : attractions) {
            attr.append(attraction.toString()).append("\n");
        }
        return info + attr.toString();
    }

    public static class Attraction {
        private String name;
        private String description;
        private String time;
        private double cost;

        public Attraction(String name, String description, String time, double cost) {
            this.name = name;
            this.description = description;
            this.time = time;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTime() {
            return time;
        }

        public void setWorkingTime(String time) {
            this.time = time;
        }

        public double getCost() {
            return cost;
        }

        public void setPrice(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Атракцион " +
                    "\"" + name + "\"" +
                    ", описание: " + description +
                    ", время работы: " + time +
                    ", цена: " + cost + " руб.";
        }
    }


    public static void main(String[]args){

        Attraction [] attractions = {
                new Attraction("Колесо обозрения", "", "круглосуточно", 200.0),
                new Attraction("Паровозик", "", "10:00 - 18:00", 150.0),
                new Attraction("Американские горки", "", "9:00 - 15:00", 400.0),
        };

        Park park = new Park("Амазония", "Чебоксары", attractions);
        System.out.println(park);

    }
}
