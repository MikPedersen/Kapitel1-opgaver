class MyClass {
    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("Opgave 1.1");
        System.out.println("Welcome to Java");
        System.out.println("Learning Java now");
        System.out.println("Programming is fun");
        System.out.println();

        System.out.println("Opgave 1.2");
        for (int i = 0; i < 5; i++) {
            System.out.println("I love Java");
        }
        System.out.println();

        System.out.println("Opgave 1.4");
        System.out.println("a   a^2     a^3     a^4");
        System.out.println("1   1       1       1");
        System.out.println("2   4       8       16");
        System.out.println("4   16      64      256");
        System.out.println();

        System.out.println("Opgave 1.5");
        double math = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
        System.out.println(math);
        System.out.println();

        System.out.println("Opgave 1.6");
        int sum = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        System.out.println(sum);
        System.out.println();

        System.out.println("Opgave 1.7");

        double pi1 = 4* ( 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 );
        double pi2 = 4* ( 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        System.out.println(pi1);
        System.out.println(pi2);
        System.out.println();

        System.out.println("Opgave 1.8");
        double radius = 6.5;
        double pi = 3.14159;

        double perimeter = 2*radius*pi;
        double area = radius * radius * pi;

        System.out.println("Perimeter is " + perimeter + " and area is " + area);
        System.out.println();

        System.out.println("Opgave 1.9");
        double widht = 5.3;
        double height = 8.6;

        area = widht*height;
        perimeter = 2*(widht+height);

        System.out.println("Perimeter is " + perimeter + " and area is " + area);
        System.out.println();

        System.out.println("Opgave 1.11");
        int population = 312032486;
        int daysPerYear = 365;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        double birtsPerYear = (secondsPerMinute/7.0)*minutesPerHour*hoursPerDay*daysPerYear;
        double deathsPerYear = (secondsPerMinute/13.0)*minutesPerHour*hoursPerDay*daysPerYear;
        double immigrantsPerYear = (secondsPerMinute/45.0)*minutesPerHour*hoursPerDay*daysPerYear;

        int projectedPopulation = (int) (population + birtsPerYear*5 - deathsPerYear*5 + immigrantsPerYear*5);
        System.out.println(projectedPopulation);

        System.out.println();

        System.out.println("Opgave 1.12");
        double kmh = (24 / 100.35 * 60) * 16 / 10;
        System.out.println(kmh);
        System.out.println();

        System.out.println("Opgave 1.13");
//      Not doing this


    }
}
