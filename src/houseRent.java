import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class houseRent {


        public static void main(String[] args) {
            List<House> newhouse = Arrays.asList(new House("Khargar","PL125",5000,"blue"),
                    new House("Bealpur","bs654",6000,"blue"),
                    new House("Sector 4","sc209",8000,"White"),
                    new House("Sector 13","BL205",8500,"Cream White"));


            House house1 = newhouse.stream().filter(p -> p.getRoom_color().equalsIgnoreCase("Blue")).min(Comparator.comparing(House :: getRent)).get();
            System.out.println("Minimum house rent " + house1);

            int size = newhouse.size();
            House minimum = newhouse.get(0);

            for(int i =1; i< size; i++){
                if(minimum.getRent()>newhouse.get(i).getRent() && minimum.getRoom_color().equalsIgnoreCase("Blue")){
                    minimum = newhouse.get(i);
                }
            }
            System.out.println("Minimum house rent "+minimum.getRent());
            System.out.println(minimum.getRoom_color());



        }
    }


