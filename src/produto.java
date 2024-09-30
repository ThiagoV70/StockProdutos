public class produto {
    public String name;
    public double price;
    public int quantity;
    //metodo pra calcular o total do valor

    public double totalvalor() {
        return price * quantity;
    }
    //metodo pra adicionar mais produtos

    public void addvelur(int quantity) {
        this.quantity += quantity;
    }
    //metodos para reduzir a quantidade de produtos

    public void removevelur(int quantity) {
        this.quantity -= quantity;
    }
    //metodo para exibir todos os comandos

    public String toString() {
    return name + ", " + "$ " + String.format("%.2f", price) + ", " + quantity + " units, Toatal: $ " + String.format("%.2f", totalvalor());
    }
}
