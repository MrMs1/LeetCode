package solution

class Solution129 {
    fun sumNumbers(root: TreeNode?): Int {
        return sumNumbers2(root, 0)
    }

    private fun sumNumbers2(root: TreeNode?, current: Int): Int {
        if (root == null) return 0
        var leftResult = 0
        var rightResult = 0
        if (root.left == null && root.right == null) return current * 10 + root.`val`
        if (root.left != null) leftResult = sumNumbers2(root.left, current * 10 + root.`val`)
        if (root.right != null) rightResult = sumNumbers2(root.right, current * 10 + root.`val`)
        return leftResult + rightResult
    }

    inner class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
