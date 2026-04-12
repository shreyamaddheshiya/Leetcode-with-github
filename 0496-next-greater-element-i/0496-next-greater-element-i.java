import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> NGE = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        Stack<Integer> st = new Stack<>();

        for (int i = n2 - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                NGE.add(0, -1);
            } else {
                NGE.add(0, st.peek());
            }

            st.push(nums2[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            map.put(nums2[i], NGE.get(i));
        }

        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}