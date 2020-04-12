class Main{
    public static void main(String[] args){
        System.out.println("hola mundo");
        Car car = new Car("AMQ123", Account("andres her", "am123"));
        // car.license =;
        // car.driver = "Andress Herrera";
        car.passegenger=4;
        //System.out.println("car licence:"+car.licence);
        car.printDataCar();

        Car car2 =new Car("QER567", Account("Adrea herrera", "am123"));
        // car2.licence ="QER567";
        // car2.driver="Adrea herrera";
        car2.passegenger=3;
        car.printDataCar();
        //System.out.println("car licence:"+car2.licence);
    }
}