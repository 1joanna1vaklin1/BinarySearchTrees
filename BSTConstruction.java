import java.util.*;
//iterative solution

public class BSTConstruction {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
			BST currentNode = this;
			while(true)
			{
				if(value < currentNode.value)
				{
					if(currentNode.left == null)
					{
						BST newBST = new BST(value);
						currentNode.left = newBST; 
						break;
					}	
					else{
						currentNode = currentNode.left;
					}
				}
				else if(value >= currentNode.value)
				{
					if(currentNode.right == null)
					{
						BST newNode = new BST(value);
						currentNode.right = newNode;
						break;
					}
					else 
					{
						currentNode = currentNode.right;
					}
				}
			}
      return this;
    }

    public boolean contains(int value) {
			BST currentNode = this;
			
			while(currentNode != null)
			{
				if(value < currentNode.value)
				{
					currentNode = currentNode.left;
				}
				else if(value > currentNode.value)
				{
					currentNode = currentNode.right;
				}
				else
				{
					return true;
				}
			}
			return false;
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      return this;
    }
  }
}
