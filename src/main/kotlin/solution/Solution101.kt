package solution

class Solution101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        return root?.left?.`val` == root?.right?.`val` && isSecondOverSymmetric(root?.left, root?.right)
    }

    private fun isSecondOverSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        return left?.left?.`val` == right?.right?.`val`
                && left?.right?.`val` == right?.left?.`val`
                && isSecondOverSymmetric(left?.left, right?.right)
                && isSecondOverSymmetric(left?.right, right?.left)
    }

    inner class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
