public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }




    public static void task1 () {
        System.out.println("Задача 1");

        String firstName = "Ivan ";
        String lastName = "Ivanov ";
        String middleName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        String fullName = "Ivanov Ivan Ivanovich";
        String upper = fullName.toUpperCase();
        System.out.println( "Данные ФИО сотрудника для заполнения отчета — " + upper);
    }

    public static void task3 () {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника — " + fullName);

    }

}
