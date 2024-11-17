public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника " + fullName);
        // Задача 2
        System.out.println("Задача 2");
        String fullNameCase = "Ivanov Ivan Ivanovich";
        String f1 = fullNameCase.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + f1);
        // Задача 3
        System.out.println("Задача 3");
        String fullNameFirst = "Иванов Семён Семёнович";
        String fullNameTrue = fullNameFirst.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
    }
}





