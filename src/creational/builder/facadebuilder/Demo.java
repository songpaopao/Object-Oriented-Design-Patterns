package creational.builder.facadebuilder;

public class Demo {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb.
                        lives().
                            at("123 London Road").
                            in("London").
                            withPostcode("SW12BC").
                        works().
                            at("Fabrikam").
                            asA("Engineer").
                            earning(100000).
                        build();

        System.out.println(person);
    }
}
