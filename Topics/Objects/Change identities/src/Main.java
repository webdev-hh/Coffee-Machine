class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // store p1 fields temporary
        String tempName = p1.name;
        int tempAge = p1.age;
        //swap p1 and p2
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = tempName;
        p2.age = tempAge;
    }
}