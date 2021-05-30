package tugasstack;
public class MainStack {
    public static void main(String[] args) {
        Stack newStack = new Stack(10);
        newStack.push(50);
        newStack.printData();
        newStack.push(100);
        newStack.printData();
        newStack.pop();
        newStack.printData();
        newStack.push(60);
        newStack.printData();
        newStack.push(80);
        newStack.printData();
        newStack.pop();
        newStack.printData();
        long bacaTop = newStack.peek();
        System.out.println("nilai top = "+bacaTop);
    }   
}
