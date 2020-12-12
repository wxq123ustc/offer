/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
 * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
 * 有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class ReverseSentence {
    public String reverseSentence(String str){
        if(str==null||str.length()==0){
            return "";
        }
        char[] chars=str.toCharArray();
        for(int l=0,r=0;r<=chars.length;r++){
            if(r==chars.length||chars[r]==' '){
                reverse(chars,l,r-1);
                l=r+1;
            }
        }
        reverse(chars,0,str.length()-1);
        return new String(chars);
    }
    private void swap(char[] chars,int i,int j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }
    private void reverse(char[] chars,int l,int r){
        while (l<r){
            swap(chars,l,r);
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        String str="I am a student.";
        ReverseSentence reverseSentence=new ReverseSentence();
        System.out.println(reverseSentence.reverseSentence(str));
    }
}
