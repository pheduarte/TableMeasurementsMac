
package visual.measurement;


class Measurements {
    Input input = new Input();

    public Measurements() {
        double position = input.marginLeft;

        for (int i = 0; i < input.numDevices; i++) {
            // Print signage
            System.out.println("Signage " + (i + 1) + ": " + position + "cm - " + (position + input.signage) + "cm");
            position += input.signage;
            
            // Print signage
            System.out.println("Default gap " + (i + 1) + ": " + position + "cm - " + (position + input.defaultGap) + "cm");
            position += input.defaultGap;

            // Print device
            double deviceSize = input.listDevices.get(i);
            System.out.println("Device " + (i + 1) + ": " + position + "cm - " + (position + deviceSize) + "cm");
            position += deviceSize;

            // Print gap (between devices, except after last device)
            if (i < input.numDevices - 1) {
                System.out.println("Gap " + (i + 1) + ": " + position + "cm - " + (position + input.unitGap) + "cm");
                position += input.unitGap;
            }
        }

        // Print right margin
        System.out.println("Right margin: " + position + "cm - " + input.tableSize + "cm");
    }
}