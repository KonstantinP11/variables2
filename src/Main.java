public class Main {
    public static void main(String[] args) {
        byte apple = 1;
        System.out.println("Значение переменной с типом byte равно " + apple);
        int orange = 2;
        System.out.println("Значение переменной с типом int равно " + orange);
        short pear = 3;
        System.out.println("Значение переменной с типом short равно " + pear);
        long banana = 4L;
        System.out.println("Значение переменной с типом long равно " + banana);
        float sugar = 1.0F;
        System.out.println("Значение переменной с типом float равно " + sugar);
        double salt = 2.0D;
        System.out.println("Значение переменной с типом double равно " + salt);

        float number1 = 27.12F;
        long number2 = 987678965549L;
        float number3 = 2.786F;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;

        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkaterina = 30;
        short sumPaper = 480;
        int paperEachStudent = sumPaper / (studentsLudmila + studentsAnna + studentsEkaterina);
        System.out.println("На каждого ученика рассчитано " + paperEachStudent + " листов бумаги");

        byte bottlesPerMinute = 16 / 2;
        byte period1 = 20;
        System.out.println("За " + period1 + " минут машина произвела " + bottlesPerMinute * period1
                + " штук бутылок");
        short period2 = 24 * 60;
        System.out.println("За сутки машина произвела " + bottlesPerMinute * period2
                + " штук бутылок");
        short period3 = 3 * 24 *60;
        System.out.println("За 3 дня машина произвела " + bottlesPerMinute * period3
                + " штук бутылок");
        int period4 = 31 * 24 *60;
        System.out.println("За месяц машина произвела " + bottlesPerMinute * period4
                + " штук бутылок");

        byte allTinPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classesToPaint = allTinPaint / (whitePaint + brownPaint);
        int quantityWhitePaint = classesToPaint * 2;
        int quantityBrownPaint = classesToPaint * 4;
        System.out.println("В школе, где " + classesToPaint + " классов, нужно "
                + quantityWhitePaint + " банок белой краски и " + quantityBrownPaint
                + " банок коричневой краски");

        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int weightBreakfast = weightBanana * 5 + weightMilk * 2 + weightIceCream * 2 +
                weightEgg * 4;
        double weightBreakfastKg = weightBreakfast * 0.001;
        System.out.println("завтрак спортсмена весит " + weightBreakfast + " грамм ("
                + weightBreakfastKg + " килограмм)");

        byte weightToDecrease = 7;
        short minusWeightPerDay1 = 250;
        short minusWeightPerDay2 = 500;
        int dayToTarget1 = weightToDecrease * 1000 / minusWeightPerDay1;
        int dayToTarget2 = weightToDecrease * 1000 / minusWeightPerDay2;
        System.out.println(dayToTarget1 + " дней уйдет на похудение, если спортсмен будет " +
                "терять каждый день по 250 грамм");
        System.out.println(dayToTarget2 + " дней уйдет на похудение, если спортсмен будет " +
                "терять каждый день по 500 грамм");
        System.out.println((dayToTarget1 + dayToTarget2) / 2 + " день уйдет на похудение в среднем");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        long salaryMashaIncreased = Math.round(salaryMasha * 1.1);
        long salaryDenisIncreased = Math.round(salaryDenis * 1.1);
        long salaryKristinaIncreased = Math.round(salaryKristina * 1.1);
        System.out.println("Маша теперь получает " + salaryMashaIncreased + " рублей. " +
                "Годовой доход вырос на " + (salaryMashaIncreased - salaryMasha) * 12 +
                " рублей");
        System.out.println("Денис теперь получает " + salaryDenisIncreased + " рублей. " +
                "Годовой доход вырос на " + (salaryDenisIncreased - salaryDenis) * 12 +
                " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaIncreased + " рублей. " +
                "Годовой доход вырос на " + (salaryDenisIncreased - salaryKristina) * 12 +
                " рублей");
    }
}