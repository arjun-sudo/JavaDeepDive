package setters_getters;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {
    public static void main(String[] args) {
        Disease corona=new Disease("corona",true);
        Disease cancer=new Disease("cancer",false);
        Disease polio=new Disease("polio",false);
        Disease malaria=new Disease("malaria",true);


        /*Callign setter */
        cancer.setCurable(true);

        /*Setter is a method that updates value of a variable */

        List<Disease> diseases=new ArrayList<Disease>();
        diseases.add(polio);
        diseases.add(corona);
        diseases.add(malaria);
        diseases.add(cancer);

        /*Print all the incurable diseases */

        System.out.println("Curable Diseases :");
        for (Disease disease:diseases)
        {
          if(disease.isCurable()){
              System.out.println(disease.getName());
          }
        }

        /*Getter is method that reads value of a variable*/


        /*Print all the curable diseases*/

        System.out.println("Incurable Diseases :");
        for (Disease disease:diseases
             ) {
            if(!disease.isCurable())
            {
                System.out.println(disease.getName());
            }


        }


    }

}
