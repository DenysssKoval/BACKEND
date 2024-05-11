package code.HomeWork.Task4;

public class GradeOfSchool {
    public static void main(String[] args) {
        // Генерируем случайную оценку от 0 до 12

        int grade = 12;

        // Устанавливаем время на сегодня
        int timeLeft = 45;

        // Определяем, сколько времени можно добавить, в зависимости от оценки
        int timeToAdd = 0;
        String message = "";

        switch (grade) {
            case 10:
            case 11:
            case 12:
                timeToAdd = 60;
                message = "Поздравляем! Мы очень рады твоей отличной оценке!";
                break;
            case 7:
            case 8:
            case 9:
                timeToAdd = 45;
                message = "Молодец! Оценка неплохая!";
                break;
            case 4:
            case 5:
            case 6:
                timeToAdd = 15;
                message = "Неплохо, но можно лучше!";
                break;
            case 3:
                timeToAdd = -30;
                message = "Очень плохо! Нет телевизора на 30 минут!";
                break;
            default:
                message = "Очень плохо! Телевизор запрещен!";
        }

        System.out.println(message);

        timeLeft += timeToAdd;
        if (timeLeft > 60) {
            timeLeft = 60;
        } else if (timeLeft < 0) {
            timeLeft = 0;
        }

        System.out.println("Осталось времени на сегодня: " + timeLeft + " минут.");
    }

}
