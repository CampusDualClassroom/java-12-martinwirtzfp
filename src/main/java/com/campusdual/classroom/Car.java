package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {}

    public boolean isTachometerGreaterThanZero(){
        if(this.tachometer > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isTachometerEqualToZero(){
        if(this.tachometer == 0){
            return true;
        } else {
            return false;
        }
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 5;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
                System.out.println("No se pode superar a velocidade maxima");
            }
            if (!this.reverse) {
                this.gear = "D";
            }
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 5;
            if (this.speedometer < 0) {
                this.speedometer = 0;
                System.out.println("Non se pode realizar a accion, a velocidade seria inferior a 0");
            }
        }
        if (this.speedometer == 0 && !this.reverse) {
            this.gear = "N";
        }
    }

    public void turnAngleOfWheels(int angle) {
        this.wheelsAngle += angle;
        if (this.wheelsAngle > 45) {
            this.wheelsAngle = 45;
            System.out.println("Error, superase o angulo permitido");
        } else if (this.wheelsAngle < -45) {
            this.wheelsAngle = -45;
            System.out.println("Error, superase o angulo permitido");
        }
    }

    public String showAngleOfWheelsDetail() {
        return "O angulo das rodas e de " + this.wheelsAngle + " grados";
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (reverse && this.speedometer == 0) {
            this.reverse = true;
            this.gear = "R";
        } else if (!reverse) {
            this.reverse = false;
            this.gear = "N";
        }
    }

    public void showDetails() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Combustible: " + fuel);
        System.out.println("Velocímetro: " + speedometer);
        System.out.println("Tacómetro: " + tachometer);
        System.out.println("Ángulo rodas: " + wheelsAngle);
        System.out.println("Marcha: " + gear);
    }

    public static void main(String[] args) {}
}

