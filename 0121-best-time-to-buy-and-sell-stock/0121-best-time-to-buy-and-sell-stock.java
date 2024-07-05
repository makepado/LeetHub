class Solution {
    public int maxProfit(int[] a) {
    int length = a.length;
    //초기의 minimum 가격
    int min_price = a[0];
    //리턴값 (최대값)
    int max_profit = 0;

    for(int i=0;i<length;i++){
        // 현재 가격과 비교해서 더 작은 값으로 min_price 업데이트
        min_price=Math.min(min_price,a[i]);
        // 현재 가격에서 min_price를 뺀 값을 계산
        int profit=a[i]-min_price;
        // 현재 계산된 값하고 max_profit 중에 더 큰 값을저장시킴
        max_profit=Math.max(max_profit,profit);
    } 

    return max_profit;
    }
}