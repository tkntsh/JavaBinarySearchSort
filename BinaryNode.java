/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 3
 * BinaryNode.java
 * @author Ntokozo
 */
public class BinaryNode 
{
    private String type;
    private String title;
    private int releaseYear;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode() 
    {
        this.type = type;
        this.title = title;
        this.releaseYear = releaseYear;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(String type, String title, int releaseYear, BinaryNode left, BinaryNode right) 
    {
        this.type = type;
        this.title = title;
        this.releaseYear = releaseYear;
        this.left = left;
        this.right = right;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public int getReleaseYear() 
    {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) 
    {
        this.releaseYear = releaseYear;
    }

    public BinaryNode getLeft() 
    {
        return left;
    }

    public void setLeft(BinaryNode left) 
    {
        this.left = left;
    }

    public BinaryNode getRight() 
    {
        return right;
    }

    public void setRight(BinaryNode right) 
    {
        this.right = right;
    }

    @Override
    public String toString() 
    {
        return "BinaryNode{" + "type=" + type + ", title=" + title + ", releaseYear=" + releaseYear + ", left=" + left + ", right=" + right + '}';
    }
}
