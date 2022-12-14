public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isBlank()) {
            this.name = " Информация не указана";
        }else
           this.name = name;

        if (town == null || town.isBlank()) {
            this.town = "Информация не указана";
        }else
            this.town = town;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else
            this.yearOfBirth = 0;

        if (jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        }else
            this.jobTitle = jobTitle;
    }



    void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

}
