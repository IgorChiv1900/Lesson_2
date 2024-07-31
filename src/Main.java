//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class Employee {
            private int id;
            private String name;
            private String surname;
            private String lastName;
            private String position;
            private String email;
            private long phoneNumbers;
            private long salary;
            private int years;
            public Employee (id, name, surname, lastName, position, email, phoneNumbers, salary, years)
                this.id = id;
                this.name = name;
                this.lastName = lastName;
                this.position = position;
                this.email = email;
                this.phoneNumbers = phoneNumbers;
                this.salary = salary;
                this.years = years;
        }

    public static class Person {
            Person[] persArray = new Person[5];
            persArray[0] = new Person ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Person ("Petrov Petr", "Engineer", "petrovpp@mailbox.com", "892312323", 35000, 33);
            persArray[2] = new Person ("Petrov Ivan", "Director", "petrovip@mailbox.com", "892313333", 80000, 53);
            persArray[1] = new Person ("Romanov Vitaly", "Engineer", "petrovvt@mailbox.com", "892314525", 40000, 25);
            persArray[4] = new Person ("Lity Elena", "Secretary", "lityer@mailbox.com", "892317825", 30000, 27);

    }
}