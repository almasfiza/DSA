/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    //preorder means RootLR 
    void binary(Node node, List<Integer> list){
        if(node == null)
            return;
        //add the root node into the list first.
        list.add(node.val);
        //finding the length of the root node i.e. how many children it has
        for(int i = 0; i < node.children.size(); i++){
           // recursively- for each child.
            binary(node.children.get(i), list);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        //recursive function for preorder
        binary(root, list);
        
        return list;
    }
    
    
}