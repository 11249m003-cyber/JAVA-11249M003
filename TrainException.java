class TrainException {
    public static void main(String[] args) {

        String trains[] = {"TN01", "TN02", "TN03", "TN04"};

        try {
            System.out.println("Train Code: " + trains[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index!");
        }

        System.out.println("Program continues normally.");
    }
}
