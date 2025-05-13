
public class Main {
    public static void main(String[] args) {
    //1
        System.out.println("Задача 1");
        int key = 10;
        byte koy = 5;
        short daet = 7;
        long gig = 50L;
        float ren = 45.4f;
        double kek = 32.4356;
        System.out.println("Значение переменной key с типом int равно "+key);
        System.out.println("Значение переменной koy с типом byte равно "+koy);
        System.out.println("Значение переменной daet с типом short равно "+daet);
        System.out.println("Значение переменной gig с типом long равно "+gig);
        System.out.println("Значение переменной ren с типом float равно "+ren);
        System.out.println("Значение переменной kek с типом double равно "+kek);

        //2
        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;

        //3
        System.out.println("Залача 3");
        byte luda = 23;
        byte anna = 27;
        byte katy = 30;
        int list = 480/(luda+anna+katy);
        System.out.println("На каждого ученика расчитано "+list+" листов бумаги");

        //4
        System.out.println("Залача 4");
        byte moch = 16;
        int proizv = moch/2;
        int dM = proizv*20;
        int oneS = proizv*60*24;
        int threeD = oneS*3;
        int oneM = oneS*30;
        System.out.println("За 20 минут произвела "+dM+" штук бутылок");
        System.out.println("За сутки произвела "+oneS+" штук бутылок");
        System.out.println("За 3 дня произвела "+threeD+" штук бутылок");
        System.out.println("За месяц произвела "+oneM+" штук бутылок");

        //5
        System.out.println("Задача 5");
        byte scool = 120;
        byte wh = 2;
        byte br = 4;
        int room = scool/(wh+br);
        int bwh = room*wh;
        int bbr = room*br;
        System.out.println("В школе, где "+room+" классов, нужно "+bwh+" банок белой краски и "+bbr+" банок коричневой краски");

        //6
        System.out.println("Задача 6");
        byte banan = 80;
        int milk =  105;
        byte MP = 100;
        byte yayko = 70;
        long VesG = banan*5+milk*2+MP*2+yayko*4;
        float VesKG = VesG/1000f;
        System.out.println("Вес коктеля в граммах = "+VesG+". Вес коктеля в килограммах = "+VesKG);

        //7
        System.out.println("Задача 7");
        byte ves = 7;
        short cool = 500;
        short neCool = 250;
        int day1 = ves*1000/cool;
        int day2 = ves*1000/neCool;
        int srday = (day1+day2)/2;
        System.out.println("Спротсмену для похудения по "+cool+" калорий в день, потребуется "+day1+" дней");
        System.out.println("Спротсмену для похудения по "+neCool+" калорий в день, потребуется "+day2+" дней");
        System.out.println("Спротсмену в среднем для похудения потребуется "+srday+" дней");

        //8
        System.out.println("Задача 8");
        int MahaM = 67760;
        int DenM = 83690;
        int KrisM = 76230;
        double MahaMN = 67760*1.1;
        double DenMN = 83690*1.1;
        double KrisMN = 76230*1.1;
        int MahaG = 67760*12;
        int DenG = 83690*12;
        int KrisG = 76230*12;
        double MahaNG = MahaMN*12;
        double DenNG = DenMN*12;
        double KrisNG = KrisMN*12;
        double Maha5 = MahaNG-MahaG;
        double Den5 = DenNG-DenG;
        double Kris5 = KrisNG-KrisG;
        System.out.println("Новая зарплата Маши: "+MahaMN+" Дениса: "+DenMN+" Кристины: "+KrisMN);
        System.out.println("Увеличение годовой зарплаты у Маши: "+Maha5+" Дениса: "+Den5+" Кристины: "+Kris5);


    }
}