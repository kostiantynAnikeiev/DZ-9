public class Main {
    public static void main(String[] args) {

        Man john = new Man("John", "Doe", 45);
        Woman jane = new Woman("Jane", "Smith", 40);


        john.setPartner(jane);
        jane.setPartner(john);


        System.out.println(john.getFirstName()); // має бути John
        System.out.println(jane.getLastName()); // має бути Smith

        john.setAge(50);
        jane.setAge(45);

        System.out.println(john.getAge()); // Виведе 50
        System.out.println(jane.getAge()); // Виведе 45

        //метод isRetired
        System.out.println(john.isRetired()); // має бути false
        System.out.println(jane.isRetired()); // має бути false

        // метод registerPartnership
        john.registerPartnership();
        System.out.println(john.getLastName()); // має бути Doe
        System.out.println(jane.getLastName()); // має бути Doe

        //метод deregisterPartnership
        john.deregisterPartnership(true);
        System.out.println(john.getLastName()); // має бути Doe
        System.out.println(jane.getLastName()); // має бути Smith, але виводить Doe, не знаю поки чому
    }
}
