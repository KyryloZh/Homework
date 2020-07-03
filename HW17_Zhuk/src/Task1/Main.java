package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       List<Worker> workers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String name;
        String position;
        int hiringYear = 0;
        int experience = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter data for worker number " + (i+1));
            System.out.print("Name: ");
            name = sc.next();

            System.out.print("Position: ");
            position = sc.next();

            for (int j = 0; j < 1; j++) {
                System.out.print("Year: ");
                hiringYear = sc.nextInt();
                try {
                    if (hiringYear < 1900) {
                        System.out.println("It can't be that long ago.");
                        throw new Exception("It can't be that long ago.");
                    } else if (hiringYear > 2020) {
                        System.out.println("This year hasn't started yet!");
                        throw new Exception("This year hasn't started yet!");
                    }
                }
                catch (Exception e){ j--;}
            }
            Worker worker = new Worker (name, position, hiringYear);
            workers.add(worker);
            }

        Collections.sort(workers);

        System.out.print("Please enter the No of years of experience: ");
        experience = sc.nextInt();
        Iterator i = workers.iterator();

        while (i.hasNext()){
            Worker worker = (Worker) i.next();
            if ((2020 - worker.getHiringYear()) > experience){
                System.out.println(worker.getName());
            }




        }

    }
}


/*завдання 1
        Створіть проект, використовуючи IntelliJ IDEA.
        потрібно:
        Описати клас з ім'ям Task1.Worker, що містить наступні поля:
         прізвище та ініціали працівника;
         назва займаної посади;
         рік надходження на роботу.
        Написати програму, що виконує наступні дії:
         введення з клавіатури даних в масив, що складається з п'яти елементів типу Task1.Worker (записи повинні
        бути впорядковані за алфавітом);
         якщо значення року введено не в відповідному форматі видає Exception.
         вивід на екран прізвища працівника, стаж роботи якого перевищує введене значення.
        */