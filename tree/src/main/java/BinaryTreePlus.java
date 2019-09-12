/**
 * leetocde编号 num538. 把二叉搜索树转换为累加树
 * 题目要求：
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * -----------------
 * 思考总结：
 * 1、二叉搜索树的特点为右子树值大于本节点大于左子树。很容易想到本节点的和为右子树和，使用递归实现。
 * 2、先求右子树的和值，将累加和值记录到全局变量，每次求当前节点和值需要用到。然后求左子树
 * 3、边界条件：当curNode为null返回即可
 * -----------------
 * 过程结果：
 * 1：由于递归很久没用，不是很熟悉，时间花费了将近10分钟思考算法逻辑，2分钟编写，5分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 91.23% 的用户
 * 内存消耗 : 44 MB , 在所有 Java 提交中击败了 68.50% 的用户
 * -----------------
 * 反思：主要是递归的思想，以及逆中序累加的思想，还有就是全局的累加值
 *
 * @author sunjiantao
 * @date 2019-09-12
 */
public class BinaryTreePlus {
    int num;

    public TreeNode convertBST(TreeNode root) {
        deInnorderTravel(root);
        return root;
    }

    /**
     * 逆中序遍历，求和先求右子树的和，然后自己，然后左子树
     *
     * @param curNode
     */
    public void deInnorderTravel(TreeNode curNode) {
        if (curNode == null)
            return;
        deInnorderTravel(curNode.right);
        num += curNode.val;
        curNode.val = num;
        deInnorderTravel(curNode.left);

    }
}
