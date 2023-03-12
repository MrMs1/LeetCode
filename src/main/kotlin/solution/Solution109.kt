package solution

import org.w3c.dom.Node


class Solution109 {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        if (head == null) {
            return null
        }
        if (head.next == null) {
            return TreeNode(head.`val`)
        }
        var nextHead = head
        val headList = mutableListOf<Int>()
        while (nextHead != null) {
            headList.add(nextHead.`val`)
            nextHead = nextHead.next
        }
        var nodeSize = headList.size
        val resultNode = TreeNode(headList[nodeSize / 2])
        println(headList.subList(0, headList.size / 2))
        println(headList.subList(nodeSize / 2 + 1, nodeSize))
        resultNode.left = sortedListToBST(listToListNode(headList.subList(0, nodeSize / 2)))
        resultNode.right = sortedListToBST(listToListNode(headList.subList(nodeSize / 2 + 1, nodeSize)))
        return resultNode
    }

    private fun listToListNode(list: List<Int>): ListNode? {
        if (list.isEmpty()) {
            return null
        }
        val result = ListNode(list[0])
        var tempNode = result
        for (i in 1 until list.size) {
            tempNode.next = ListNode(list[i])
            tempNode = tempNode.next!!
        }
        return result
    }

    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    inner class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
