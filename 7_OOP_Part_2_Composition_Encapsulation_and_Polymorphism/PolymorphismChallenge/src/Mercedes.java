class Mercedes extends Car{
    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mercedes -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mercedes -> brake()";
    }
}


