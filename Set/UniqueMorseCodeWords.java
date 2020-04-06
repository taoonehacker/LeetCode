import java.util.TreeSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        TreeSet<String> treeSet = new TreeSet<>();
        String[] codes =new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (var word :words){
            var res = new StringBuilder();
            for (var i=0;i<word.length();i++){
                res.append(codes[word.charAt(i)-'a']);
            }
            treeSet.add(res.toString());
        }
        return treeSet.size();
    }
}
