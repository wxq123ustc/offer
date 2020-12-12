import java.util.HashMap;

/**
 *在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str){
        if(str==null||str.length()==0){
            return -1;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="google";
        FirstNotRepeatingChar firstNotRepeatingChar=new FirstNotRepeatingChar();
        int i = firstNotRepeatingChar.firstNotRepeatingChar(str);
        System.out.println(i);
    }
}
