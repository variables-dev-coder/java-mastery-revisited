package day04_ObjectOrientedProgramming;

final class ImmutableUser {
    private final int id;
    private final String name;

    ImmutableUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ImmutableUser iu = new  ImmutableUser(1, "Munna");

        System.out.println(iu.name);  // Munna
    }
}
