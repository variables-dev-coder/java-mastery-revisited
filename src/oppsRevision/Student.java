package oppsRevision;

class Student {

    private String name;
    private int age;

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Munna");
        s.setAge(22);

        System.out.println(s.getName() + " " + s.getAge());
    }
}
