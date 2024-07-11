public class Main {
    public static void main(String[] args) {
        //task1
        int age = 16;
        if(age>=18){
            System.out.println("Если возраст человека равен "+age+ " он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+age+ " он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        int temperature = 10;
        if(temperature<=5){
            System.out.println("На улице "+temperature+" градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице "+temperature+" градусов, можно идти без шапки");
        }

        //task3
        int speed = 50;
        if(speed<=60){
            System.out.println("Если скорость "+speed+" то можно ездить спокойно");
        }else {
            System.out.println("Если скорость "+speed+ " то придется заплатить штраф");
        }

        //task4
        int agePeople = 80;
        if(agePeople<2){
            System.out.println("Если возраст человека равен "+agePeople+ " то ему пора спать");
        }else if(agePeople>=2&&agePeople<=6){
            System.out.println("Если возраст человека равен "+agePeople+" то ему нужно ходить в детский сад");
        }else if(agePeople>=7&&agePeople<=18){
            System.out.println("Если возраст человека равен "+agePeople+" то ему нужно ходить в школу");
        }else if(agePeople>=19&&agePeople<=24){
            System.out.println("Если возраст человека равен "+agePeople+ " то ему нужно ходить в университет");
        }else if(agePeople>=25&&agePeople<=60){
            System.out.println("Если возраст человека равен "+agePeople+ " то ему нужно ходить на работу");
        }else {
            System.out.println("Если возраст человека равен "+agePeople+ " то он может отдохнуть");
        }

        //task5
        int kidAge = 9;
        if(kidAge<5){
            System.out.println("Если возраст ребенка равен "+kidAge+ " то ему нельзя кататся на атракционе");
        }else if(kidAge>=5&&kidAge<14){
            System.out.println("Если возраст ребенка равен "+kidAge+ " то ему можно кататся в сопровождении");
        }else if (kidAge>14){
            System.out.println("Если возраст ребенка равен"+kidAge+ " то ему можно кататся без сопровождения");
        }

        //task6
        int capacity = 102;
        int seatPlace = 60;
        int placePassenger = 8;
        if(placePassenger>0&&placePassenger<=seatPlace){
            System.out.println("В вагоне есть сидячее место");
        }else if(placePassenger>seatPlace&&placePassenger<=capacity){
            System.out.println("В вагоне есть стоячие места");
        }else{
            System.out.println("В вагоне нет мест");
        }

        //task7
        int oneNumber = 5;
        int twoNumber = 8;
        int threeNumber = 10;
        if(oneNumber>twoNumber&&oneNumber>threeNumber){
            System.out.println(oneNumber);
        }else if(twoNumber>oneNumber&&twoNumber>threeNumber){
            System.out.println(twoNumber);
        }else{
            System.out.println(threeNumber);
        }



    }
}