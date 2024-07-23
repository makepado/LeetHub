class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //총합
        int sum = numBottles;

        //남은 병 수가 교환할 병 수보다 같거나 크면
        while(numBottles >= numExchange) {
            int k = numBottles/numExchange;

            //나눈 값을 남은 총합에 합치고
            sum += k;

            //나머지를 계산 다시해서 bottle을 세팅
            numBottles = k + (numBottles % numExchange);
        }

        return sum;
    }
}