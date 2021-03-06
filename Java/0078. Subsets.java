// 78. Subsets
// Time: O(N* 2^n); Space:O(n)
// 一共 2^n个状态，每种状态需要 O(n)的时间来构造子集。
// 临时数组 tt 的空间代价是 O(n)，递归时栈空间的代价为 O(n)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(ret, new ArrayList<>(), nums, 0);
        return ret;
    }
    // start 是当前选择列表的起始位置
    private void dfs(List<List<Integer>> ret, List<Integer> path, int[] nums, int start) { 
		// 本该是base case，但是此题不存在结束条件
        ret.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {  // 如果需要不重复的结果，就i = start， 否则是0
            path.add(nums[i]);  // i是当前访问的index的坐标
            dfs(ret, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}