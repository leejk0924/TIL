package org.example.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args) {
        ClassLoader classLoader = Masulsa.class.getClassLoader();
        TypePool typePool = TypePool.Default.of(classLoader);

        try {
            new ByteBuddy().redefine(typePool.describe("org.example.bytebuddy.Moja").resolve(),
                    ClassFileLocator.ForClassLoader.of(classLoader))
                    .method(named("pullout")).intercept(FixedValue.value("Rabbit!"))
                    .make().saveIn(new File("C:\\Users\\jk\\Documents\\dev\\TIL\\different-ways-to-manipulate-code\\target\\classes"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new Moja().pullout());
    }

}
