package com.ey.builder;

public final class Computer {
	 
    // final instance fields
	private final String cpu;
    private final int ram;
    private final int rom;
    private int sdd;
    private int hdd;
    private String gpu;
    
    
    public Computer(Builder builder)
    {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.rom = builder.rom;
    }
 
    // Static class Builder
    public static class Builder {
 
        /// instance fields
        private String cpu;
        private int ram;
        private int rom;
 
        public static Builder newInstance()
        {
            return new Builder();
        }
 
        private Builder() {}
 
        // Setter methods
        public Builder setCpu(String cpu)
        {
            this.cpu = cpu;
            return this;
        }
        public Builder setRam(int ram)
        {
            this.ram = ram;
            return this;
        }
        public Builder setRom(int rom)
        {
            this.rom = rom;
            return this;
        }
 
        // build method to deal with outer class
        // to return outer instance
        public Computer build()
        {
            return new Computer(this);
        }
    }
 
    @Override
    public String toString()
    {
        return "id = " + this.cpu + ", name = " + this.ram +
                               ", address = " + this.rom;
    }
}
 
