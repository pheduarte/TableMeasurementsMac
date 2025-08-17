/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.measurement;

import java.util.ArrayList;
import java.util.Scanner;


class Input {
    public double tableSize;
    public int numDevices;
    public ArrayList<Double> listDevices = new ArrayList<>();
    public double marginLeft;
    public double marginRight;
    public double signage;
    public double unitGap;
    public double totalDeviceSize;
    public double defaultGap = 5;

    public Input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter table size (cm): ");
        tableSize = scanner.nextDouble();

        System.out.print("Enter number of devices: ");
        numDevices = scanner.nextInt();

        System.out.print("Enter left margin (cm): ");
        marginLeft = scanner.nextDouble();

        System.out.print("Enter right margin (cm): ");
        marginRight = scanner.nextDouble();

        System.out.print("Enter signage before each device (cm): ");
        signage = scanner.nextDouble();

        // Read sizes of each device
        for (int i = 0; i < numDevices; i++) {
            System.out.print("Enter size of device " + (i + 1) + " (cm): ");
            double size = scanner.nextDouble();
            listDevices.add(size);
            totalDeviceSize += size;
        }

        // Calculate total gaps between devices
        if (numDevices > 1) {
            double remainingSpace = tableSize - marginLeft - marginRight - totalDeviceSize - (signage * numDevices) - (defaultGap * numDevices);
            unitGap = remainingSpace / (numDevices - 1);
        } else {
            unitGap = 0;
        }

        scanner.close();
    }
}