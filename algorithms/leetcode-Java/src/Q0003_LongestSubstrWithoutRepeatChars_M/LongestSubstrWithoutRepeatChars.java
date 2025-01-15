package Q0003_LongestSubstrWithoutRepeatChars_M;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Die antwort
 * @Date: 2025/1/15 15:33
 * @Description:
 */
public class LongestSubstrWithoutRepeatChars {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);

                if (maxLen >= 95) {
                    break;
                }
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }

                charSet.add(s.charAt(right));

            }

        }

        /*
        // fastes 算法原理与上面相同，但字符串为ASCII字符组成，都有所对应的数字，从数组中查找偏移的速度要远快于Set取值
        int[] pos=new int[128];
        int maxlen=0;
        int start=0,end=0;
        for(char i:s.toCharArray()){
            start=Math.max(start,pos[i]);
            maxlen=Math.max(maxlen,end-start+1);
            pos[i]=end+1;
            end++;
        }
        */

        return maxLen;
    }

}
