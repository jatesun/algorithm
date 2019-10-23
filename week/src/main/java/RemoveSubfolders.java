import java.util.ArrayList;
import java.util.List;

/**
 * @author sunjiantao
 * @date 2019-10-20
 */
public class RemoveSubfolders {
    public static void main(String[] args) {
        RemoveSubfolders removeSubfolders = new RemoveSubfolders();
        String[] source = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        List<String> result = removeSubfolders.removeSubfolders(source);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private boolean isFather(String[] resultSplit, String[] targetSplit) {
        for (int j = 0; j < targetSplit.length; j++) {
            String resultChar = resultSplit[j];
            String targetChar = targetSplit[j];
            if (!targetChar.equals(resultChar)) {
                return false;
            }
        }
        return true;
    }

    public List<String> removeSubfolders(String[] folder) {
        List<String> result = new ArrayList<String>();
        for (String s : folder) {
            if ("".equals(s) || "/".equals(s)) {
                continue;
            }
            //获取当前文件夹
            String curS = s;
            //判断该文件夹与保存的文件夹是否有存在关系
            boolean changed = false;
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).length() >= s.length()) {
                    //判断result是否为s的子文件夹
                    String[] resultSplit = result.get(i).split("/");
                    String[] targetSplit = s.split("/");
                    if (isFather(resultSplit, targetSplit)) {
                        result.set(i, s);
                        changed = true;
                    } else {
                        continue;
                    }

                } else {
                    //判断result是否为s的父文件夹
                    String[] resultSplit = result.get(i).split("/");
                    String[] targetSplit = s.split("/");
                    if (isFather(targetSplit, resultSplit)) {
                        changed = true;
                    }
                }
            }
            if (!changed) {
                result.add(s);
            }
        }
        return result;

    }
}
