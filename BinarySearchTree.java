/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 3
 * BinarySearchTree.java
 * @author Ntokozo
 */
public class BinarySearchTree extends BinaryNode
{
    private BinaryNode root;
    private int bnSize = 0;

    public BinarySearchTree() 
    {
        this.root = root;
    }

    public BinarySearchTree(String type, String title, int releaseYear, BinaryNode left, BinaryNode right) 
    {
        super(type, title, releaseYear, left, right);
    }
    
    public void insert(String theType, String theTitle, int theReleaseYear)
    {
        BinaryNode[] bN = new BinaryNode[bnSize];
        //bN = bN[theType, theTitle, theReleaseYear];
    }
    
    public void remove(BinaryNode arr[], String theTitle)
    {
        int n = arr.length;
        
        for(int i = 0; i<n-1; i++)
        {
            if(arr[i].equals(theTitle))
            {
                arr[i] = arr[i+1];
            }
        }
    }
    
    public BinaryNode find(BinaryNode arr[], String theTitle)
    {
        int n = arr.length;
        
        for (int i=0; i<n; i++) 
        {
            if (arr[i].getTitle().equalsIgnoreCase(theTitle))
            {
                return arr[i];
            }
        }
        return arr[-1];
    }
    
    public void printInOrder()
    {
        
    }

    @Override
    public String toString() 
    {
        //return "BinaryNode{" + "type = " + BinaryNode.getType() + ", title = " + BinaryNode.getTitle() + ", releaseYear = " + BinaryNode.getReleaseYear + ", left = " + BinaryNode.getLeft() + ", right = " + BinaryNode.getRight() + "BinarySearchTree{" + "root = " + root + '}';
        return "BinarySearchTree{" + "root = " + root + '}';
    }
    
    public static void main(String[]args)
    {
        BinaryNode[] bN = new BinaryNode[100];
        
        try
        {
            Scanner sc = new Scanner(new File("\"C:\\Users\\27614\\Desktop\\TK - learning\\UWC\\3yr bsc com\\2nd year\\CSC211 S1\\pracs\\prac2\\src\\netflix_titles.csv\""));  
            sc.useDelimiter(",");
            
            while (sc.hasNext())
            {  
                String type = sc.next();
                String title = sc.next();
                int releaseYear = sc.nextInt();
                BinaryNode left = null;
                BinaryNode right = null;
                
                BinaryNode bn = new BinaryNode(type, title, releaseYear, left, right);
                //System.out.print(sc.next());
            }   
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found - check path");
        }
        
        int count = 0;
        if(bN.getReleaseYear()==2021)
        {
            for(int i = 0; i<bN.length; i++)
            {
                count++;
            }
            System.out.println(count);
        }
        
        if(bN.getTitle().charAt(0).equalsIgnoreCase("S"))
        {
            
        }
        
        System.out.println(bN.find("Mudbound"));
        System.out.println(bN.find("Let's Dance 3"));
        System.out.println(bN.find("Yankee"));
    }
}
