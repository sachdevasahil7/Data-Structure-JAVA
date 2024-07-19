package data_structures.arrays;

import java.util.*;

/**
 * @author Sahil on 28/05/2024
 */
public class TournamentWinner {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>finalData= new ArrayList<>();
        ArrayList<String> data= new ArrayList<>();
        data.add("HTML");
        data.add("C#");
        finalData.add(data);
        data= new ArrayList<>();
        data.add("C#");
        data.add("Python");
        finalData.add(data);
        data= new ArrayList<>();
        data.add("Python");
        data.add("HTML");
        finalData.add(data);
        ArrayList<Integer> resultList= new ArrayList<>();
        resultList.get(0);
        resultList.get(resultList.size());
        resultList.add(0);
        resultList.add(0);
        resultList.add(1);
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println(new TournamentWinner().tournamentWinner(finalData,resultList));

    }
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String,Integer>result= new HashMap<>();

        int counter=0;
        for (List<String>match:competitions){
            int matchResult=results.get(counter);
            final String winner = matchResult == 0 ? match.get(1) : match.get(0);
            if (!result.containsKey(winner)){
                result.put(winner,1);
            }
            counter+=1;
            result.put(winner,result.get(winner)+1);
        }
        int maxWinner=0;
        String winner=null;
       for (Map.Entry<String,Integer> entry:result.entrySet()){
           if (result.get(entry.getKey())>maxWinner){
               System.out.println(entry.getKey() + " -> " + entry.getValue());
               maxWinner=result.get(entry.getKey());
               winner=entry.getKey();
           }
       }
        System.out.println("winner :: "+winner);
        return winner;
    }
}
