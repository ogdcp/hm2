public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 (){
        System.out.println("Задача 2");
        var dogPlus = 8 + 4;
        System.out.println(dogPlus);
        var catPlus = 3.6 + 4;
        System.out.println(catPlus);
        var paperPlus = 763789 + 4 ;
        System.out.println(paperPlus);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dogMinus = 8 + 3.5;
        System.out.println(dogMinus);
        var catMinus = 3.6 + 1.6;
        System.out.println(catMinus);
        var paperMinus = 763789 + 7639 ;
        System.out.println(paperMinus);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        System.out.println("Вес первого бойца " + weightFirstBoxer + " кг");
        var weightSecondBoxer = 82.7;
        System.out.println("Вес второго бойца " + weightSecondBoxer + " кг");
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");


    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightDifference1 = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе боксеров 1 " + weightDifference1 + " кг");
        var weightDifference2 = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе боксеров 2 " + weightDifference2 + " кг");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var time = 640;
        var workingTime = 8;
        var workers = time / workingTime;
        System.out.println("Всего работников в компании — " + workers + " человек");
        var moreWorkers = 94;
        var thenWorkers = workers + moreWorkers;
        var thenHoursPerWorker = time / thenWorkers;
        System.out.println("Если в компании работает " + thenWorkers + " человек, то всего " + thenHoursPerWorker + " часов работы может быть поделено между сотрудниками");
    }
}