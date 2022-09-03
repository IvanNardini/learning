package com.ivnard;

// Polymorphism is the programming property that allows actions to act differently compared to the actual object

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " +
                                movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n"); // for movie object Java looks if we have a plot() method. If yes, then applies it
                                                                // If no, Java prints No <method name> here!
                                                                // polymorphism allows method returns different results.
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5 + 1);
        System.out.println("Number genereted is " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
