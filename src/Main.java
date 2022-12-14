public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.name = "Максим";
        human.yearOfBirth = 1988;
        human.town = " Минск";
        human.jobTitle = "бренд - менеджер";
        human.greeting();

        Human human1 = new Human();
        human1.name = "Аня";
        human1.yearOfBirth = 1993;
        human1.town = " Москва ";
        human1.jobTitle = " методист образовательных программ";
        human1.greeting();

        Human human2 = new Human();
        human2.name = "Катя";
        human2.yearOfBirth = 1992;
        human2.town = "Калининград";
        human2.jobTitle = "продакт-менеджер";
        human2.greeting();

        Human human3 = new Human();
        human3.name = "Артём";
        human3.yearOfBirth = 1995;
        human3.town = " Москва ";
        human3.jobTitle = " директор по развитию бизнеса ";
        human3.greeting();
    }
}