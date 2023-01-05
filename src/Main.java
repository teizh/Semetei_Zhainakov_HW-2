public class Main {
    public static void main(String[] args) {
        System.out.println(goForAWalk(25, -20.5));
        System.out.println(goForAWalk(25, 10));
        System.out.println(goForAWalk(15, 10));
        System.out.println(goForAWalk(50, 10));
        System.out.println(goForAWalk(50, 36.7));

// DZ na soobrazitelnost'

        int minAge = 1;
        int maxAge = 70;
        double minTemp = -15.5;
        double maxTemp = 40.5;
        int randomAge = (int) Math.floor(Math.random() * (maxAge - minAge + 1) + minAge);
        double randomTemp = Math.floor(Math.random() * (maxTemp - minTemp + 1) + minTemp);
        System.out.println("Age: " + randomAge + "; Temperature: " + randomTemp);
        System.out.println(goForAWalk(randomAge, randomTemp));
    }

    public static String goForAWalk(int age, double temp) {
        if ((age >= 20 && age <= 45) && (temp > (-20) && temp < 30)) {
            return ("Can go for a walk");
        } else if (age < 20 && temp > 0 && temp < 28) {
            return ("Can go for a walk!");
        } else if (age > 45 && temp >= (-10) & temp <= 25) {
            return ("Can go for a walk!!");
        } else {
            return ("Stay at home!!!");
        }
    }
}