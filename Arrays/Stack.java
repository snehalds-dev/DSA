public class Stack {

    int[] st;
    int top;

    Stack(int n) {
        st = new int[n];
        top = -1;
    }

    void push(int x) {
        if (top == st.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        st[top] = x;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack Elements: ");
        st.display();
        st.pop();
        System.out.println("Stack Elements After Pop: ");
        st.display();
    }
}
