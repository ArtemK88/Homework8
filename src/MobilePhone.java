abstract class MobilePhone implements Mobile {
    @Override
    public void turnOn(){
        System.out.println("Вмикаємо мобільний телефон");
    }
    @Override
    public void turnOff(){
        System.out.println("Вимикаємо мобільний телефон");
    }
}
