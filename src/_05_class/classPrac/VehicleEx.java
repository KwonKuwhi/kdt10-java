package _05_class.classPrac;

public class VehicleEx {
    public static void main(String[] args) {
        // Vehicle 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

        // Car 객체 생성 및 배열에 저장
        Car car = new Car("name", 100);
        vehicles[0] = car;

        // Airplane 객체 생성 및 배열에 저장
        Airplane airplane =  new Airplane("비행기", 500);
        vehicles[1] = airplane;

        // 배열을 순회하면서 move() 메서드 호출
        for (Vehicle vehicle : vehicles){
            System.out.printf("\n=== %s Vehicle 정보 ===", vehicle.getName());
            vehicle.move();

            // instanceOf 연산자
            // 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인할 떄 사용
            // 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해서 사용함
            // 출처 :https://dev-cini.tistory.com/62


            System.out.println(vehicle instanceof Flyable);

            //Flyable 구현한 경우 fly() 메서드 호출
            if(vehicle instanceof Flyable){
                ((Flyable) vehicle).fly(); //  명시적 형변환
            }
        }
    }
}
