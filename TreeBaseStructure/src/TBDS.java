//Note: All of your TBDSInterface method implementations must function recursively
//I have left the method signatures from my own solution, which may be useful hints in how to approach the problem
//You are free to change/remove/etc. any of the methods, as long as your class still supports the TBDSInterface

import java.util.ArrayList;
public class TBDS implements TBDSInterface {
  TBDSNode root;

  public TBDS() {

  }

  //Indirectly recursive method to meet definition of interface
  public void add(String key, String value) {
  }

  //Recursive method
  //Note: arguments are only a suggestion, you may use your own if you devise a different recursive solution
  public void add(TBDSNode current, String curKey, String value) {

  }

  //Indirectly recursive method to meet definition of interface
  public String get(String key) {
    return "";
  }

  //Recursive method
  //Note: arguments are only a suggestion, you may use your own if you devise a different recursive solution
  public String get(TBDSNode current, String curKey) {
    return "";
  }

  //Indirectly recursive method to meet definition of interface
  public boolean containsKey(String key) {
    return false;
  }

  //Recursive method
  //Note: arguments are only a suggestion, you may use your own if you devise a different recursive solution
  public boolean containsKey(TBDSNode current, String curKey) {
    return false;
  }

  //Indirectly recursive method to meet definition of interface
  public ArrayList<String> getKeysForPrefix(String prefix) {
    return new ArrayList<>();
  }

  //Recursive helper function to find node that matches a prefix
  //Note: only a suggestion, you may solve the problem in any recursive manner
  public TBDSNode findNode(TBDSNode current, String curKey) {
    return null;
  }

  //Recursive helper function to get all keys in a node's subtree
  //Note: only a suggestion, you may solve the problem in any recursive manner
  public ArrayList<String> getSubtreeKeys(TBDSNode current) {
    return new ArrayList<String>();
  }

  //Indirectly recursive method to meet definition of interface
  public void print() {

  }

  //Recursive method to print values in tree
  public void print(TBDSNode current) {

  }

  public static void main(String[] args) {
    //You can add some code in here to test out your TBDS initially
    //The TBDSTester includes a more detailed test

  }
}