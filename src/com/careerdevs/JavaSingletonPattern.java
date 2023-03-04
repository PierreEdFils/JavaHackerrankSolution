package com.careerdevs;

public class JavaSingletonPattern {

    class Singleton {
        private Singleton() {}
        public String str;
        private static Singleton instance = null;
        public Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}

