class ParkingSystem {
    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;    
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                //System.out.println("Checking parking space for big car");
                if(big<1)return false;
                else{
                    big--;
                    return true;
                }
            
            case 2:
                //System.out.println("Checking parking space for medium car");
                if(medium<1)return false;
                else{                    
                    medium--;
                    return true;
                }

            case 3:
                //System.out.println("Checking parking space for small car");
                if(small<1) return false;
                else{
                    small--;
                    return true;
                }

            default:
                System.out.println("There is no such car type.");
                return false;
        }
    }
}

public class parkSys {
    public static void main(String[] args) {
        ParkingSystem park = new ParkingSystem(1,1, 0);
        boolean param1 = park.addCar(1);
        boolean param2 = park.addCar(2);
        boolean param3 = park.addCar(3);
        boolean param4 = park.addCar(1);
        System.out.println(param1);
        System.out.println(param2);
        System.out.println(param3);
        System.out.println(param4);
    }
}


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */