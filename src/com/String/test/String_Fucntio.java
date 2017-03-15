package com.String.test;

/**
 * Created by Nabeel on 3/15/2016.
 */
public class String_Fucntio {
    //
    // Ok
    // test function is used to test the function input in ok and xx form
    public final static void test(String get , String expected){
      try {
         // condition used for result
          if (get.equalsIgnoreCase(expected)){

              System.out.print("OK"+"  ");

          }
          // condition used for reject the result
          else{

              System.out.print("XX"+"  ");

          }
      } catch (Exception e) {

          // TODO Auto-generated catch block
          System.out.println("System not working ");
      }

    }


    //Ok
    // donuts and send back to the main for test
    public final static String donuts(int count){

        try {

            // Condition for donuts
            if(count == 10 || count > 10){
                // if the count is equal the 10 and grater than the 10

                return "Number of donuts: many";
            }else{
                // if the count is less than the 10 than print

                return "Number of donuts: "+count;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

            return null;

        }
    }

    //Ok
    // both_ends and send back to the main for test
    public final static String both_ends(String string){

         try {
             // if the length of the String is one
             if(string.length() <= 1 || string.isEmpty()){

                 return "";

             }else{

                 // this return back the both_end String

                 return string.substring(0,2)+""+ new StringBuffer(new StringBuffer(string).reverse().substring(0, 2)).reverse();
             }

         } catch (Exception e) {
             // TODO Auto-generated catch block

             e.printStackTrace();
             return null;
        }

    }
    //Ok
    // fix_start and send back to the main for test
    public final static String fix_start(String string){
        //
        try {
            //
            if(string.isEmpty()){

                return null;

            }
            // get the temp as String to get the string who value is less than one the real string
            String temp = string.substring(1);
            // return the real fix_start String to the test

            return string.charAt(0)+temp.replaceAll(string.charAt(0)+"", "*");

        } catch (Exception e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

            return null;

        }
    }

    // Ok
    // mix and send back to the main for test
    public final static String mixUp(String string, String string2){
        //
        try {
            // return the mix string and test it
            return string.replace(string.subSequence(0, 2), string2.subSequence(0, 2))+" "+string2.replace(string2.subSequence(0, 2), string.subSequence(0, 2));

        } catch (Exception e) {

            // TODO Auto-generated catch block
            e.printStackTrace();

            return null;
        }
    }

    //Ok
    // verbing and send back to the main for test
    public final static String verbing(String string){
        //
        try {
            // if the length of the String is less than 3 than not change the string and send same back
            if(string.length() < 3){
                // send the same string that i received for the parameter

                return string;
            }else{
                // if the string is ing than return back the same
                if(string.contains("ing") && string.length() == 3){
                    // this one used when it containing the ing in the text

                    return string;
                }
                else if(string.contains("ing")){

                    // if true than concat the old string with ly

                    return string+"ly";

                }else{
                    // if flase than concat the onl string with ing

                    return string+"ing";
                }
             }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    // Ok
    // not bad and send back to the main for test
    public final static String not_bad(String string){
        //
        try {
            // condition for not and bad contains in the string

            if(string.contains("not") && string.contains("bad")){
                // if yes than watch not is first come and bad is lass
                if(string.indexOf("not") < string.indexOf("bad")){
                    // return back to the main

                    return string.replace(string.substring(string.indexOf("not")), "good");
                    // if the bad is first and not is lass than is will work

                }else if(string.indexOf("not") > string.indexOf("bad")){

                    // than send the same string that get from the parameter
                    // send the same the string
                    return string;
                }
            }else{
                // send the same the sting
                // if only not and only bad contains in the string
                return string;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

        return null;
    }

    //Ok
    // front back and send back to the main for test
    public final static String front_back(String string , String string2){

        // condition for both equal length
        if(string.length()%2 == 0 && string2.length()%2 == 0){
            // send back to the main

            return string.substring(0, string.length()/2)+string2.substring(0,string2.length()/2)+string.substring(string.length( )/2)+string2.substring(string2.length()/2);

        }else{

            // condition for first even and second odd
            if(string.length()%2 == 0 && string2.length()%2 == 1){

                // send back to the mian
                return string.substring(0, string.length()/2)+string2.substring(0,string2.length()/2+1)+string.substring(string.length()/2)+string2.substring(string2.length()/2+1);
            }else{
                // this one work when both string are odd
                // send back to the main

                return string.substring(0, string.length()/2+1)+string2.substring(0,string2.length()/2+1)+string.substring(string.length()/2+1)+string2.substring(string2.length()/2+1);
            }
        }
    }

  // //
   public static void main(String args[]){
       //
       System.out.println ("donuts");
       // Each line calls donuts, compares its result to the expected for that call.

       test(donuts(4), "Number of donuts: 4"); test(donuts(9), "Number of donuts: 9");
       test(donuts(10), "Number of donuts: many");
       test(donuts(99), "Number of donuts: many");

       //----------------------------------------//
       // Each line calls both_end, compares its result to the expected for that call.
       System.out.println("\nboth_ends");

       test(both_ends("spring"), "spng");
       test(both_ends("Hello"), "Helo");
       test(both_ends("a"), "");
       test(both_ends("xyz"), "xyyz");
       //----------------------------------------//
       // Each line calls fix_start, compares its result to the expected for that call.

       System.out.println("\nfix_start");

       test(fix_start("babble"), "ba**le");
       test(fix_start("aardvark"), "a*rdv*rk");
       test(fix_start("google"), "goo*le");
       test(fix_start("donut"), "donut");

       //---------------------------------------
       // Each line calls mixUp, compares its result to the expected for that call.

       System.out.println("\nmix_up");
       test(mixUp("mix", "pod"), "pox mid");
       test(mixUp("dog", "dinner"), "dig donner");
       test(mixUp("gnash", "sport"), "spash gnort");
       test(mixUp("pezzy", "firm"), "fizzy perm");

       //--------------------------------------
       // Each line calls verbing, compares its result to the expected for that call.

       System.out.println("\nverbing");

       test(verbing("hail"), "hailing");
       test(verbing("swiming"), "swimingly");
       test(verbing("do"), "do");
       test(verbing("ing"),"ing");

       //-------------------------------------
       // Each line calls not_bad, compares its result to the expected for that call.

       System.out.println("\nnot_bad");

       test(not_bad("This movie is not so bad"), "This movie is good");
       test(not_bad("This dinner is not that bad!"), "This dinner is good");
       test(not_bad("This tea is not hot"), "This tea is not hot");
       test(not_bad("It's bad yet not"), "It's bad yet not");
       //------------------------------------//Each line calls front_back, compares its result to the expected for that call.

       System.out.println("\nfront_back");

       test(front_back("abcd", "xy"), "abxcdy");
       test(front_back("abcde", "xyz"), "abcxydez");
       test(front_back("Kitten", "Donut"), "KitDontenut");

   }
}
