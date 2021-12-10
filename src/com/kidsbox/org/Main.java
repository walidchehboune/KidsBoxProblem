package com.kidsbox.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Entity[] boxs = {new Entity( 8f,-6f ),new Entity( 6f,10f ),new Entity( 4f,5f )};
        Entity[] kids = {new Entity( 8f,8f ),new Entity( 2f,7f ),new Entity( -2f,1f ),new Entity( -5f,-7f )};
        String[] AlphaKid = {"pA","pB","pC","pD"};



                for(int k = 0;k<kids.length;k++)
                {
                  System.out.println(AlphaKid[k]+" "+kids[k].GetBoxClose(boxs));
                }

    }
}
