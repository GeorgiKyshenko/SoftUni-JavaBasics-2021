package Exam;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pricePerCard = Integer.parseInt(scanner.nextLine());
        int pricePerCabell = Integer.parseInt(scanner.nextLine());
        double consumedPowerPerCard = Double.parseDouble(scanner.nextLine());
        double incomePerCard = Double.parseDouble(scanner.nextLine());
        int restComponents = 1000;
        int moneyForCards = pricePerCard * 13;
        int moneyForCabell = pricePerCabell * 13;
        int spendMoney = restComponents + moneyForCabell + moneyForCards;
        double profitPerCard = incomePerCard - consumedPowerPerCard;
        double overallProfitPerCards = profitPerCard * 13;
        System.out.printf("%d%n", spendMoney );
        System.out.printf("%.0f", Math.ceil(spendMoney / overallProfitPerCards));
    }
}
