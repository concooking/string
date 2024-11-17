public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastNAme = "Ivanov";
        String fullNAme = lastNAme + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника " + fullNAme);
        // Задача 2
        System.out.println("Задача 2");
        String fullNameCase = "Ivanov Ivan Ivanovich";
        String f1 = fullNameCase.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + f1);
        // Задача 3
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
    }
}





