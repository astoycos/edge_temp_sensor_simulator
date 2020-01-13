/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;
import java.time.*;
import java.util.Random;

public class HelloWorld {
    public static void main(String... argvs) {
        String a = LocalDateTime.now().toString()+" "+LocalTime.now().toString();
        System.out.println("Hello from Edge,Time is: " + a);
        //Print random temperature in farenheight
        int temp_reading = new Random().nextInt(110);
        System.out.println("Current Temperature is" + temp_reading);

    }
}
