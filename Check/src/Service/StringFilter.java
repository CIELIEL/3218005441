package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFilter {
       public  String stringFilter(String string1){
           String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
           Pattern   pattern  =   Pattern.compile(regEx);
           Matcher matcher   =   pattern.matcher(string1);
           return   matcher.replaceAll("").trim();
       }

}
