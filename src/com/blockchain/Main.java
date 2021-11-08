package com.blockchain;

public class Main {

    public static void main(String[] args) {
	    Blockchain blockchain = new Blockchain();
        Block block = blockchain.generateBlock();
        System.out.println(block.toString());
        Program.run();
    }
}
