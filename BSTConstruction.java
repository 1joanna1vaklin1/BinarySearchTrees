import java.util.*;

public class BSTConstruction {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
			
			if(this = null)
			{
				return this; 
			}
			if(this.value > value)
			{
				if(this.left == null)
				{
					BST newBST = new BST(value);
					this.left = newBST; 
				}
				else
				{
					this.left.insert(value);
				}
			}
			else if(this.value <= value)
			{
				if(this.right == null)
				{
					BST newBST = new BST(value);
					this.right = newBST;
				}
				{
					this.right.insert(value);
				}
				
			}
			
      return this;
    }

    public boolean contains(int value) {
      
			if(this.value == value)
			{
				return true; 
			}
			
			else
			{
				if(this.value > value)
				{
					if(this.left == null)
					{
						return false;
					}
					this.left.contains(value);
				}
				else if(this.value < value)
				{
					if(this.right == null)
					{
						return false;
					}
					this.right.contains(value);
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
