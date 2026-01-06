package day05_ObjectOrientedProgramming;

interface BonusEligible {
    double calculateBonus();
}

class Manager implements BonusEligible {
    public double calculateBonus() {
        return 10000;
    }

    public static void main(String[] args) {
        BonusEligible b = new Manager();
        System.out.println(b.calculateBonus());
    }
}

// 10000.0

//Use interface when:
//You want loose coupling
//Multiple inheritance needed