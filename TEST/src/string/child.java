package string;


import java.util.Arrays;
import java.util.Map;

public class child {


    public static void main(String[] args) {

        int [] myArray = {6,5,2,1,9,10,0};
        int aa;

        for (int i = 0; i < myArray.length -1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]){
                    aa = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = aa;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));



/*
Log the items that has differences or missing items.

Consider the special characters between city# and name.
File1:
City1: Pune

City2@ Chennai

City3& Cochin

City5: Delhi

File 2:

        * */

        //Map<String,String> file1
        //City3: Bangalore
        //
        //City1% Pune
        //
        //City4$ Chennai
        //
        //City6# Delhi= new Map();
/*
* [1:35 PM] Arumugam, Ravikumar (Cognizant)


<Root path>/<deploymentversion/files/input/<date>/<scenarioId1>/ABCD.DEF

<Root path>/<deploymentversion/files/output/textfiles/<scenarioId1>/output1.txt

<Root path>/<deploymentversion/files/output/textfiles/<scenarioId1>/output2.txt

<Root path>/<deploymentversion/files/output/textfiles/<scenarioId1>/SUCCESS_FILE



<Root path>/<deploymentversion/files/input/<date>/<scenarioId2>/ABCD.DEF

<Root path>/<deploymentversion/files/output/textfiles/<scenarioId2>/output1.txt

<Root path>/<deploymentversion/files/output/textfiles/<scenarioId2>/output2.txt

<Root path>/<deploymentversion/files/output/textfiles/<scenarioId2>/SUCCESS_FILE


* */

        }
}
