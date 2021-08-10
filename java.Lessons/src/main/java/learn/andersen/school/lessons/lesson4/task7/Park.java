package learn.andersen.school.lessons.lesson4.task7;

import java.util.Scanner;

public class Park {
    public static Scanner ob=new Scanner(System.in);
    public info info;
    public String park;
    public Park(){
        System.out.println("Введите название парка:");
        setPark(ob.next());
        info=new info();
    }
    public String getPark(){
        return park;
    }
    public void setPark(String city){
        this.park =park;
    }

    public void prntln() {
    }

    public class info{
        String attr, time, cost;
        public info(){
            System.out.println("Аттракционы в данном парке:");
            setAttr(new String());
            System.out.println("Время работы:");
            setTime(new String());
            System.out.println("Стоимость:");
            setCost(new String());
        }

        public String getAttr() {
            return attr;
        }

        public void setAttr(String attr) {
            this.attr = attr;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getCost() {
            return cost;
        }

        public void setCost(String cost) {
            this.cost = cost;
        }

        public void println() {
            System.out.println("В парке есть эти аттракционы:"+getAttr());
            System.out.println("Их время работы:"+getTime());
            System.out.println("Их стоимость:"+getCost());
        }

        public void prntln() {
        }
    }
    static public void main(String[]args){
        Park park=new Park();
        park.info.prntln();
    }
}
