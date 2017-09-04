/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    Stack<Node> stack = new Stack<Node> ();
    //s=root;
    while (true){
        while (root!=null){
            System.out.print(root.data+" ");
            stack.push(root);
            root=root.left;
        }
        if(stack.isEmpty())
            break;
        else{
            root=stack.pop();
            root=root.right;
            //System.out.print(root.data);
        }
    }
}
