import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TravelAgencies {
     private int regNo;
     private String agencyName ;
    private String packageType ;
     private int price;
     private boolean flightFacility;

     TravelAgencies(int regNo,
    String agencyName ,
    String packageType ,
     int price,
     boolean flightFacility){
     this.regNo= regNo;
     this.agencyName = agencyName;
     this.packageType= packageType;
     this.price= price ;
     this.flightFacility= flightFacility;}

     //getter
     public int regNo(){
        return regNo;
     }
     public int agencyName(){
        return agencyName;
     }
     public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
       public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;

    }

   public class Solution {

    // Method 1: Find agency with highest package price
    public static TravelAgencies findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        if (arr == null || arr.length == 0) return null;

        TravelAgencies maxAgency = arr[0];

        for (TravelAgencies agency : arr) {
            if (agency.getPrice() > maxAgency.getPrice()) {
                maxAgency = agency;
            }
        }
        return maxAgency;
    }

    // Method 2: Filter agencies by flight facility & package type
    public static TravelAgencies[] agencyDetailsForGivenIdAndType(TravelAgencies[] arr, String type) {
        List<TravelAgencies> result = new ArrayList<>();

        for (TravelAgencies agency : arr) {
            if (agency.isFlightFacility() && agency.getPackageType().equalsIgnoreCase(type)) {
                result.add(agency);
            }
        }

        if (result.isEmpty()) return null;

        // Sort by price (ascending)
        result.sort(Comparator.comparingInt(TravelAgencies::getPrice));

        return result.toArray(new TravelAgencies[0]);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TravelAgencies[] arr = new TravelAgencies[4];

        for (int i = 0; i < 4; i++) {
            int regNo = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            boolean flight = sc.nextBoolean();
            sc.nextLine(); // consume newline

            arr[i] = new TravelAgencies(regNo, name, type, price, flight);
        }

        String searchType = sc.nextLine();

        // Method 1 call
        TravelAgencies highest = findAgencyWithHighestPackagePrice(arr);
        if (highest != null) {
            System.out.println("Highest Price Agency ID: " + highest.getRegNo());
        } else {
            System.out.println("No Agency Found");
        }

        // Method 2 call
        TravelAgencies[] filtered = agencyDetailsForGivenIdAndType(arr, searchType);

        if (filtered != null) {
            for (TravelAgencies agency : filtered) {
                System.out.println(agency.getAgencyName() + " " + agency.getPrice());
            }
        } else {
            System.out.println("No Agency Found");
        }

        sc.close();
    }
}
     }
}
