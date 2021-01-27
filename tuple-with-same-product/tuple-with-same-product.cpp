// {2,6} = {3, 4} 각각이 한 세트 라고 생각할때
// {2,6} , {3,4} , {1,12}
// 3개 중 2개를 뽑아 내는 조합문제
// + 순서가 바뀌는 경우의 수 2 * 2 * 2 = 8 을 곱하면 경우의수
​
class Solution {
public:
    int tupleSameProduct(vector<int>& nums) {
        unordered_map<int, int> map;
        int sames = 0;
        for(int i =0 ; i < nums.size(); i++)
            for (int j = i+1; j < nums.size(); j++)
                map[nums[i] * nums[j]]++;
​
        for (auto iter : map)
        {
            if (iter.second < 2)
                continue;
            sames += (iter.second * (iter.second - 1) / 2) * 8;
        }
        return sames;
    }
};
