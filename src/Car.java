class Car implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("машина закрылась");
    }

    public void drive(){
        System.out.println("машина поехала");
    }
}
