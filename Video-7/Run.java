public class Run {


    public static void main(String[] args) {


        // Lógica do OR
        double[][] inputs = {
            new double[]{0, 0}, // output: 0
            new double[]{0, 1}, // output: 0
            new double[]{1, 0}, // output: 0
            new double[]{1, 1}  // output: 1
        };

        double[] desired = { 0, 0, 0, 1 };

        NeuralNetwork net = new NeuralNetwork(inputs, 1000);

        net.train(desired);


        System.out.println("====== TEST OR LOGIC ======");

        for(int i = 0; i < inputs.length; i++) {

            String output = (net.run(inputs[i]) < 0.5)? "FALSE" : "TRUE";

            System.out.println(output);

        }


    }
}