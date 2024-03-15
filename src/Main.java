public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lustName = "Ivanov";
        String fullName = lustName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф. И. О. Сотрудника - " + fullName);

        // Task 2
        System.out.println("Task 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        // Task 3
        System.out.println("Task 3");

        String fullName3 = "Иванов Семён Семёнович";
        String fullNameTrue = fullName3.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника - " + fullNameTrue);




    }
}