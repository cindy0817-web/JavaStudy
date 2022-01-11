package overroaing;

public class GasStation{
    public static void main(String[]args){
        GasStation gasStation = new GasStation(); //gasStation인스턴스 생성
        Suv suv = new Suv(); //suv 인스턴스 생성
        Truck truck = new Truck(); //truck 인스턴스 생성
        Bus bus = new Bus(); //bus 인스턴스 생성
        
        //gasStation에서 suv에 기름을 넣습니다.
        gasStation.fill(suv);
        
        //gasStation에서 truck에 기름을 넣습니다.
        gasStation.fill(truck);
        
        //gasStation에서 bus에 기름을 넣습니다.
        gasStation.fill(bus);
        
    }
    
   /* public void fill(Suv suv){
        System.out.println("Suv에 기름을 넣습니다.");
        suv.gas += 10;
        System.out.println("기름이 "+suv.gas+"리터 들어있습니다.");
    }
    
    public void fill(Truck truck){
        System.out.println("Truck에 기름을 넣습니다.");
        truck.gas += 10;
        System.out.println("기름이 "+truck.gas+"리터 들어있습니다.");
    }
    
    public void fill(Bus bus){
        System.out.println("Bus에 기름을 넣습니다.");
        bus.gas += 10;
        System.out.println("기름이 "+bus.gas+"리터 들어있습니다.");
    }*/
    
    public void fill(Car car){
        //참고. car.getClass().getName()은 car오브젝트가 실제로 어떤 클래스인지를 알려줍니다.
        System.out.println(car.getClass().getName()+"에 기름을 넣습니다.");

        car.gas += 10;
        System.out.println("기름이 "+car.gas+"리터 들어있습니다.");
    }
}
