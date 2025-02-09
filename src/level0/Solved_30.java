package level0;

public class Solved_30 {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        int coffeePrice = 5500;
        int canDrink = 0;
        int saveMoney = 0;

        if(money >= coffeePrice) {
            canDrink = money / coffeePrice;
            saveMoney = money - (coffeePrice * canDrink);
        } else {
            saveMoney = money;
        }

        answer[0] = canDrink;
        answer[1] = saveMoney;

        return answer;
    }
}
