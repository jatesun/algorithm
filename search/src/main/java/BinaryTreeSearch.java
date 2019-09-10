/**
 * leetocde编号 num700 二叉搜索树中的搜索
 * 题目要求：
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。
 * 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 * -----------------
 * 思考总结：
 * 1、二叉搜索树简单查找，二叉搜索树左边小右边大，按照此逻辑写即可。
 * 2、找到就返回，没有找到就找左右子树。返回的边界为找到或者无树可找
 * 3、需要注意的点为无树可找就返回。找左右子树时也需要判断左右子树是否存在
 * -----------------
 * 过程结果：
 * 1：时间花费了2分钟思考算法逻辑，3分钟编写，10分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 49.5 MB , 在所有 Java 提交中击败了 31.74% 的用户
 * -----------------
 * 反思：题目不难，注意左右子树查找条件以及退出条件即可。
 *
 * @author sunjiantao
 * @date 2019-09-10
 */

public class BinaryTreeSearch {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode target = root;
        while (true) {
            if (target.val == val) {
                return target;
            } else if (target.val < val && (target.right != null)) {
                target = target.right;
            } else if (target.val > val && (target.left != null)) {
                target = target.left;
            } else {
                return null;
            }
        }
    }
}
