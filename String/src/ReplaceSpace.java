/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str){
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                stringBuffer.append('%');
                stringBuffer.append('2');
                stringBuffer.append('0');
            }else{
                stringBuffer.append(str.charAt(i));
            }
        }
        return str.toString();
    }
}